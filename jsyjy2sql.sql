/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.1.62-community : Database - jsy
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`jsy` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `jsy`;

/*Table structure for table `t_class` */

DROP TABLE IF EXISTS `t_class`;

CREATE TABLE `t_class` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `c_name` varchar(22) NOT NULL,
  PRIMARY KEY (`cid`),
  CONSTRAINT `t_class_ibfk_1` FOREIGN KEY (`cid`) REFERENCES `t_class` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `t_class` */

insert  into `t_class`(`cid`,`c_name`) values (1,'C++'),(2,'Java'),(3,'IOS'),(4,'Android');

/*Table structure for table `t_student` */

DROP TABLE IF EXISTS `t_student`;

CREATE TABLE `t_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `s_name` varchar(22) NOT NULL,
  `s_sex` varchar(22) NOT NULL,
  `s_cid` int(11) NOT NULL,
  `s_tid` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `t_student_ibfk_2` FOREIGN KEY (`id`) REFERENCES `t_teacher` (`tid`),
  CONSTRAINT `t_student_ibfk_1` FOREIGN KEY (`id`) REFERENCES `t_class` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `t_student` */

insert  into `t_student`(`id`,`s_name`,`s_sex`,`s_cid`,`s_tid`) values (1,'Eagle','男',1,1),(2,'Snow','女',3,2),(3,'Arvan','男',3,3),(4,'Tomcat','女',4,4);

/*Table structure for table `t_teacher` */

DROP TABLE IF EXISTS `t_teacher`;

CREATE TABLE `t_teacher` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `t_name` varchar(22) COLLATE utf8_estonian_ci NOT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_estonian_ci;

/*Data for the table `t_teacher` */

insert  into `t_teacher`(`tid`,`t_name`) values (1,'张三丰'),(2,'令狐冲'),(3,'张无忌'),(4,'包拯'),(5,'小龙女');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
