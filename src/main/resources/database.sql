CREATE TABLE `company` (
                           `id` bigint NOT NULL,
                           `name` varchar(255) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
                           `longitude` varchar(20) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
                           `latitude` varchar(20) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
                           `geometry` geometry NOT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='企业信息表';