/*
 Navicat Premium Data Transfer

 Source Server         : Local
 Source Server Type    : MySQL
 Source Server Version : 50644
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50644
 File Encoding         : 65001

 Date: 13/06/2019 18:02:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `org_id` bigint(20) NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `telephone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `register_time` datetime(0) NULL DEFAULT NULL,
  `status` int(1) NULL DEFAULT NULL,
  `createtime` datetime(0) NULL DEFAULT NULL,
  `deleteflag` int(1) NULL DEFAULT 0,
  `updatetime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (2, 7, 'Anwei', '123', '18286176420', '2019-06-13 11:17:11', 0, '2019-06-13 11:17:16', 1, NULL);
INSERT INTO `sys_user` VALUES (3, 7, 'Anwei', '123', '18286176420', '2019-06-13 11:17:11', 0, '2019-06-13 11:17:16', 0, NULL);
INSERT INTO `sys_user` VALUES (4, 7, 'Anwei', '123', '123', '2019-06-13 16:19:31', NULL, NULL, 0, NULL);
INSERT INTO `sys_user` VALUES (5, 7, 'Anwei2', '123', '123', '2019-06-13 16:29:59', NULL, '2019-06-13 16:29:59', 0, NULL);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT 0,
  `email` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `deleteflag` int(1) NULL DEFAULT 0,
  `version` int(11) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (2, 'Anwei', 27, '1@163.com', 0, 0);
INSERT INTO `user` VALUES (3, 'Anwei2', 27, '1@163.com', 0, 0);
INSERT INTO `user` VALUES (4, 'optlocker', 19, 'test@baomidou.com', 0, 2);
INSERT INTO `user` VALUES (5, 'optlocker', 28, 'test@baomidou.com', 0, 2);
INSERT INTO `user` VALUES (6, 'optlocker', 19, 'test@baomidou.com', 0, 2);

SET FOREIGN_KEY_CHECKS = 1;
