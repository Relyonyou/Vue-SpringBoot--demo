/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 20/07/2020 14:52:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `stu_id` bigint(12) NOT NULL AUTO_INCREMENT,
  `stu_name` char(20) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL,
  `stu_age` char(3) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL,
  `stu_sex` char(2) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL,
  `stu_grade` char(10) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL,
  PRIMARY KEY (`stu_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20181104491 CHARACTER SET = gbk COLLATE = gbk_chinese_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '1啊啊的', '23', '女', '1');
INSERT INTO `student` VALUES (2014490, '王二', '20', '男', '大一');
INSERT INTO `student` VALUES (20104485, '张三', '20', '男', '大一');
INSERT INTO `student` VALUES (20104487, '王五', '20', '男', '大一');
INSERT INTO `student` VALUES (20181183, '李九', '20', '男', '大一');
INSERT INTO `student` VALUES (20181484, '王楞', '20', '男', '大一');
INSERT INTO `student` VALUES (20181488, '赵四', '20', '男', '大一');
INSERT INTO `student` VALUES (20184486, '李四', '20', '男', '大一');
INSERT INTO `student` VALUES (20184489, '赵六', '20', '男', '大一');
INSERT INTO `student` VALUES (201811041, '贾七', '20', '男', '大一');
INSERT INTO `student` VALUES (201811042, '贾八', '20', '男', '大一');

SET FOREIGN_KEY_CHECKS = 1;
