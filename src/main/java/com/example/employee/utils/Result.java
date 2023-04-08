package com.example.employee.utils;

import com.example.employee.code.ErrorCode;
import com.example.employee.code.UserErrorCode;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
public class Result <T> {
    public static final int OK_CODE = 0;

    public static final String OK_MSG = "success";

    private Integer code;

    private String level;

    private String msg;

    private Boolean ok;

    private T data;

    public Result(Integer code, String level, boolean ok, String msg, T data) {
        this.code = code;
        this.level = level;
        this.ok = ok;
        this.msg = msg;
        this.data = data;
    }

    public Result(ErrorCode errorCode, boolean ok, String msg, T data) {
        this.code = errorCode.getCode();
        this.level = errorCode.getLevel();
        this.ok = ok;
        if (StringUtils.isNotBlank(msg)) {
            this.msg = msg;
        } else {
            this.msg = errorCode.getMsg();
        }
        this.data = data;
    }

    public static <T> Result<T> ok() {
        return new Result<>(OK_CODE, null, true, OK_MSG, null);
    }

    public static <T> Result<T> ok(T data) {
        return new Result<>(OK_CODE, null, true, OK_MSG, data);
    }

    public static <T> Result<T> okMsg(String msg) {
        return new Result<>(OK_CODE, null, true, msg, null);
    }

    // -------------------------------------------- 最常用的 用户参数 错误码 --------------------------------------------

    public static <T> Result<T> userErrorParam() {
        return new Result<>(UserErrorCode.PARAM_ERROR, false, null, null);
    }


    public static <T> Result<T> userErrorParam(String msg) {
        return new Result<>(UserErrorCode.PARAM_ERROR, false, msg, null);
    }

    // -------------------------------------------- 错误码 --------------------------------------------

    public static <T> Result<T> error(ErrorCode errorCode) {
        return new Result<>(errorCode, false, null, null);
    }

    public static <T> Result<T> error(ErrorCode errorCode, boolean ok) {
        return new Result<>(errorCode, ok, null, null);
    }

    public static Result error(Result Result) {
        return new Result<>(Result.getCode(), Result.getLevel(), Result.getOk(), Result.getMsg(), Result.getData());
    }

    public static <T> Result<T> error(ErrorCode errorCode, String msg) {
        return new Result<>(errorCode, false, msg, null);
    }

    public static <T> Result<T> errorData(ErrorCode errorCode, T data) {
        return new Result<>(errorCode, false, null, data);
    }
}
