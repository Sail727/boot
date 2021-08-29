CREATE TABLE `t_user`
(
    `id`         varchar(32) NOT NULL,
    `username`   varchar(100)                                            DEFAULT NULL,
    `password`   varchar(100)                                            DEFAULT NULL,
    `name`       varchar(100)                                            DEFAULT NULL,
    `email`      varchar(100)                                            DEFAULT NULL,
    `CREATORID`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL,
    `CREATOR`    varchar(100)                                            DEFAULT NULL,
    `CREATETIME` datetime                                                DEFAULT NULL,
    `UPDATERID`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci  DEFAULT NULL,
    `UPDATER`    varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
    `UPDATETIME` datetime                                                DEFAULT NULL,
    `DELETED`    int                                                     DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;