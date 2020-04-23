/*
 Navicat MySQL Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : factory

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 22/04/2020 16:08:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for 库存表
-- ----------------------------
DROP TABLE IF EXISTS `库存表`;
CREATE TABLE `库存表`  (
  `bookid` int(11) NOT NULL,
  `bookname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `num` int(11) NOT NULL,
  PRIMARY KEY (`bookid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of 库存表
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
