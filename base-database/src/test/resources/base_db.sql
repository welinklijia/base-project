/*
SQLyog Ultimate v12.3.1 (64 bit)
MySQL - 5.6.41 : Database - base_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`base_db` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `base_db`;

/*Table structure for table `base_department` */

DROP TABLE IF EXISTS `base_department`;

CREATE TABLE `base_department` (
  `depart_id` int(11) NOT NULL AUTO_INCREMENT,
  `department_name` varchar(100) DEFAULT NULL,
  `depart_create_time` datetime DEFAULT NULL,
  `depart_insert_time` datetime DEFAULT NULL,
  `organization_id` int(11) DEFAULT NULL,
  `depart_valid` smallint(6) DEFAULT '1',
  `depart_parent_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`depart_id`),
  KEY `organization_id` (`organization_id`),
  CONSTRAINT `base_department_ibfk_1` FOREIGN KEY (`organization_id`) REFERENCES `base_organization` (`org_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `base_department` */

insert  into `base_department`(`depart_id`,`department_name`,`depart_create_time`,`depart_insert_time`,`organization_id`,`depart_valid`,`depart_parent_id`) values 
(2,'综合监控','2018-12-23 09:53:51','2018-12-23 09:53:51',1,1,NULL),
(3,'综合资源','2018-12-23 09:53:51','2018-12-23 09:53:51',1,1,NULL),
(4,'综合激活','2018-12-23 09:53:51','2018-12-23 09:53:51',1,1,NULL),
(5,'综合监控','2018-12-23 10:24:37','2018-12-23 10:24:37',1,1,NULL),
(6,'综合资源','2018-12-23 10:24:37','2018-12-23 10:24:37',1,1,NULL),
(7,'综合激活','2018-12-23 10:24:37','2018-12-23 10:24:37',1,1,NULL),
(8,'综合监控','2018-12-23 10:25:10','2018-12-23 10:25:10',1,1,NULL),
(9,'综合资源','2018-12-23 10:25:10','2018-12-23 10:25:10',1,1,NULL),
(10,'综合激活','2018-12-23 10:25:10','2018-12-23 10:25:10',1,1,NULL),
(11,'综合监控','2018-12-23 10:25:30','2018-12-23 10:25:30',1,1,NULL),
(12,'综合资源','2018-12-23 10:25:30','2018-12-23 10:25:30',1,1,NULL),
(13,'综合激活','2018-12-23 10:25:30','2018-12-23 10:25:30',1,1,NULL);

/*Table structure for table `base_organization` */

DROP TABLE IF EXISTS `base_organization`;

CREATE TABLE `base_organization` (
  `org_id` int(11) NOT NULL AUTO_INCREMENT,
  `org_name` varchar(100) DEFAULT NULL,
  `org_create_time` datetime DEFAULT NULL,
  `org_insert_time` datetime DEFAULT NULL,
  `org_valid` smallint(6) DEFAULT '1',
  `org_parent_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`org_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `base_organization` */

insert  into `base_organization`(`org_id`,`org_name`,`org_create_time`,`org_insert_time`,`org_valid`,`org_parent_id`) values 
(1,'亿阳信通','2018-12-23 09:26:42','2018-12-23 09:26:42',1,1),
(2,'中兴物联','2018-12-23 09:30:34','2018-12-23 09:30:34',1,1);

/*Table structure for table `base_resource` */

DROP TABLE IF EXISTS `base_resource`;

CREATE TABLE `base_resource` (
  `resource_id` int(11) NOT NULL AUTO_INCREMENT,
  `resource_name` varchar(100) DEFAULT NULL,
  `resource_url` varchar(100) DEFAULT NULL,
  `resource_parent_id` int(11) DEFAULT NULL,
  `resource_type` int(11) DEFAULT NULL,
  `resource_update_time` datetime DEFAULT NULL,
  `resource_insert_time` datetime DEFAULT NULL,
  `resource_valid` smallint(6) DEFAULT '1',
  PRIMARY KEY (`resource_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `base_resource` */

/*Table structure for table `base_role` */

DROP TABLE IF EXISTS `base_role`;

CREATE TABLE `base_role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(20) DEFAULT NULL,
  `role_descripse` varchar(100) DEFAULT NULL,
  `role_create_time` datetime DEFAULT NULL,
  `role_insert_time` datetime DEFAULT NULL,
  `role_valid` smallint(6) DEFAULT '1',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `base_role` */

insert  into `base_role`(`role_id`,`role_name`,`role_descripse`,`role_create_time`,`role_insert_time`,`role_valid`) values 
(1,'超级管理员','拥有系统的所有功能操作权限','2018-12-30 18:14:03','2018-12-30 18:14:07',1),
(2,'管理员','管理员权限','2018-12-30 18:14:10','2018-12-30 18:14:12',1),
(3,'普通用户','普通操作权限','2018-12-30 18:14:16','2018-12-30 18:14:18',1);

/*Table structure for table `base_user` */

DROP TABLE IF EXISTS `base_user`;

CREATE TABLE `base_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) DEFAULT NULL,
  `user_password` varchar(20) DEFAULT NULL,
  `user_register_time` datetime DEFAULT NULL,
  `user_insert_time` datetime DEFAULT NULL,
  `user_department_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_name` (`user_name`),
  KEY `department_id` (`user_department_id`),
  CONSTRAINT `base_user_ibfk_1` FOREIGN KEY (`user_department_id`) REFERENCES `base_department` (`depart_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `base_user` */

insert  into `base_user`(`user_id`,`user_name`,`user_password`,`user_register_time`,`user_insert_time`,`user_department_id`) values 
(1,'zhangsan','123456','2018-12-23 18:28:50','2018-12-23 18:28:50',2),
(2,'lisi','123456','2018-12-23 18:28:50','2018-12-23 18:28:50',2),
(3,'wangwu','123456','2018-12-23 18:28:50','2018-12-23 18:28:50',2);

/*Table structure for table `role_resource` */

DROP TABLE IF EXISTS `role_resource`;

CREATE TABLE `role_resource` (
  `role_id` int(11) NOT NULL,
  `resource_id` int(11) NOT NULL,
  `update_time` datetime DEFAULT NULL,
  `insert_time` datetime DEFAULT NULL,
  `valid` smallint(6) DEFAULT '1',
  PRIMARY KEY (`role_id`,`resource_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role_resource` */

/*Table structure for table `user_role` */

DROP TABLE IF EXISTS `user_role`;

CREATE TABLE `user_role` (
  `user_id` bigint(20) NOT NULL,
  `role_id` int(11) NOT NULL,
  `valid` smallint(6) DEFAULT '1',
  `update_time` datetime DEFAULT NULL,
  `insert_time` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_role` */

insert  into `user_role`(`user_id`,`role_id`,`valid`,`update_time`,`insert_time`) values 
(2,2,1,'2018-12-30 18:15:55','2018-12-30 18:15:58'),
(2,3,1,'2018-12-30 18:16:09','2018-12-30 18:16:01'),
(3,2,1,NULL,NULL),
(3,3,1,'2018-12-30 18:16:14','2018-12-30 18:16:06');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
