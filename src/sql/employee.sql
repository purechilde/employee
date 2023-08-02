CREATE DATABASE `employee` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

-- employee.`user` definition
CREATE TABLE `user` (
                        `user_id` int NOT NULL AUTO_INCREMENT,
                        `user_name` varchar(30) COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
                        `full_name` varchar(30) COLLATE utf8mb4_general_ci NOT NULL COMMENT '姓名',
                        `user_password` varchar(50) COLLATE utf8mb4_general_ci NOT NULL COMMENT '密码',
                        `user_email` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '邮件',
                        `user_phone` bigint DEFAULT NULL COMMENT '电话',
                        `create_time` date DEFAULT NULL COMMENT '创建时间',
                        `update_time` date DEFAULT NULL COMMENT '更新时间',
                        PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='用户表';