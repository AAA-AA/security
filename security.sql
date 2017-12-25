# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: localhost (MySQL 5.7.17)
# Database: security
# Generation Time: 2017-12-25 04:32:30 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table sec_resource
# ------------------------------------------------------------

DROP TABLE IF EXISTS `sec_resource`;

CREATE TABLE `sec_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uri` varchar(255) NOT NULL DEFAULT '' COMMENT '请求路径',
  `parent_id` int(11) NOT NULL DEFAULT '0' COMMENT '父节点id',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '版本号',
  `level` tinyint(4) NOT NULL DEFAULT '0' COMMENT '层级',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录同步时间',
  `created_by` varchar(150) NOT NULL DEFAULT '' COMMENT '创建人',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '删除状态字段，0有效，1删除',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '状态,目前仅作保留字段',
  `updated_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录更新时间',
  `updated_by` varchar(150) NOT NULL DEFAULT '' COMMENT '更新人',
  PRIMARY KEY (`id`),
  KEY `ix_parent_id` (`parent_id`),
  KEY `ix_created_at` (`created_at`),
  KEY `ix_updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台管理员资源表表';



# Dump of table sec_role
# ------------------------------------------------------------

DROP TABLE IF EXISTS `sec_role`;

CREATE TABLE `sec_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '版本号',
  `mark` varchar(255) NOT NULL DEFAULT '' COMMENT '备注信息',
  `name` varchar(50) DEFAULT NULL COMMENT '角色名',
  `role_key` varchar(255) DEFAULT NULL COMMENT '角色key',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录同步时间',
  `created_by` varchar(150) NOT NULL DEFAULT '' COMMENT '创建人',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '删除状态字段，0有效，1删除',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '状态,目前仅作保留字段',
  `updated_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录更新时间',
  `updated_by` varchar(150) NOT NULL DEFAULT '' COMMENT '更新人',
  PRIMARY KEY (`id`),
  KEY `ix_name` (`name`),
  KEY `ix_created_at` (`created_at`),
  KEY `ix_updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台管理员角色表';



# Dump of table sec_role_resource
# ------------------------------------------------------------

DROP TABLE IF EXISTS `sec_role_resource`;

CREATE TABLE `sec_role_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `resource_id` int(11) NOT NULL DEFAULT '0' COMMENT '资源id',
  `role_id` int(11) NOT NULL DEFAULT '0' COMMENT '角色id',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录同步时间',
  `created_by` varchar(150) NOT NULL DEFAULT '' COMMENT '创建人',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '删除状态字段，0有效，1删除',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '状态,目前仅作保留字段',
  `updated_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录更新时间',
  `updated_by` varchar(150) NOT NULL DEFAULT '' COMMENT '更新人',
  PRIMARY KEY (`id`),
  KEY `ix_role_id` (`role_id`),
  KEY `ix_resource_id` (`resource_id`),
  KEY `ix_created_at` (`created_at`),
  KEY `ix_updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台管理员角色资源表';



# Dump of table sec_role_user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `sec_role_user`;

CREATE TABLE `sec_role_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL DEFAULT '0' COMMENT '用户id',
  `role_id` int(11) NOT NULL DEFAULT '0' COMMENT '角色id',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '版本号',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录同步时间',
  `created_by` varchar(150) NOT NULL DEFAULT '' COMMENT '创建人',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '删除状态字段，0有效，1删除',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '状态,目前仅作保留字段',
  `updated_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录更新时间',
  `updated_by` varchar(150) NOT NULL DEFAULT '' COMMENT '更新人',
  PRIMARY KEY (`id`),
  KEY `ix_user_id` (`user_id`),
  KEY `ix_role_id` (`role_id`),
  KEY `ix_created_at` (`created_at`),
  KEY `ix_updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台管理员角色用户表';



# Dump of table sec_user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `sec_user`;

CREATE TABLE `sec_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '版本号',
  `mark` varchar(255) NOT NULL DEFAULT '' COMMENT '备注信息',
  `name` varchar(50) DEFAULT NULL COMMENT '登录用户名，与dashboard名字一致',
  `last_login_date` datetime NOT NULL DEFAULT '1970-01-01 08:00:01' COMMENT '最后登录时间，精确到秒',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录同步时间',
  `created_by` varchar(150) NOT NULL DEFAULT '' COMMENT '创建人',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '删除状态字段，0有效，1删除',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '状态,目前仅作保留字段',
  `updated_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录更新时间',
  `updated_by` varchar(150) NOT NULL DEFAULT '' COMMENT '更新人',
  PRIMARY KEY (`id`),
  KEY `ix_name` (`name`),
  KEY `ix_created_at` (`created_at`),
  KEY `ix_updated_at` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='后台管理员用户表';

LOCK TABLES `sec_user` WRITE;
/*!40000 ALTER TABLE `sec_user` DISABLE KEYS */;

INSERT INTO `sec_user` (`id`, `version`, `mark`, `name`, `last_login_date`, `created_at`, `created_by`, `is_delete`, `status`, `updated_at`, `updated_by`)
VALUES
	(1,1,'','admin','2017-12-25 00:00:00','2017-12-25 11:57:04','sys',0,0,'2017-12-25 11:57:04','');

/*!40000 ALTER TABLE `sec_user` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
