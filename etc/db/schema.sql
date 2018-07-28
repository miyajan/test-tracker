DROP TABLE IF EXISTS `repository`;
CREATE TABLE `repository` (
  `id` bigint(20) NOT NULL,
  `name` text NOT NULL,
  `fullName` text NOT NULL,
  `private` tinyint(1) NOT NULL,
  `htmlUrl` text NOT NULL,
  `defaultBranch` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC;
