/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : yonghe

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 21/04/2023 15:18:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_door
-- ----------------------------
DROP TABLE IF EXISTS `tb_door`;
CREATE TABLE `tb_door`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tel` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `addr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_door
-- ----------------------------
INSERT INTO `tb_door` VALUES (1, '永和大王(黄石港店)', '0714-6211231', '黄石市黄石港区沿江路黄石港店');
INSERT INTO `tb_door` VALUES (2, '永和大王(磁湖路店)', '0714-82356537', '湖北省黄石市下陆区磁湖路');
INSERT INTO `tb_door` VALUES (3, '永和大王(团城山店)', '0714-84477746', '湖北省黄石市下陆区团城山店');
INSERT INTO `tb_door` VALUES (4, '永和大王(西塞山店)', '0714-65286602', '湖北省黄石市西塞山区西塞山店');
INSERT INTO `tb_door` VALUES (5, '永和大王(八栋口店)', '0714-62152539', '湖北省黄石市黄石港区沈家营八栋口店');
INSERT INTO `tb_door` VALUES (15, 'Might Blue', '18279061609', '湖北师范大学');

-- ----------------------------
-- Table structure for tb_order
-- ----------------------------
DROP TABLE IF EXISTS `tb_order`;
CREATE TABLE `tb_order`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `door_id` int(11) NULL DEFAULT NULL,
  `order_no` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `order_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pnum` int(11) NULL DEFAULT NULL,
  `cashier` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `order_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `pay_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `pay_type` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` double NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `door_id`(`door_id`) USING BTREE,
  CONSTRAINT `tb_order_ibfk_1` FOREIGN KEY (`door_id`) REFERENCES `tb_door` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_order
-- ----------------------------
INSERT INTO `tb_order` VALUES (1, 1, 'P001', '堂食', 1, '张三', '2023-04-21 15:16:38', '2023-04-21 15:16:38', '微信支付', 16);
INSERT INTO `tb_order` VALUES (2, 1, 'P003', '外卖', 3, '张三', '2023-04-21 15:16:38', '2023-04-21 15:16:38', '微信支付', 20);
INSERT INTO `tb_order` VALUES (3, 1, 'P005', '打包', 1, '张三', '2023-04-21 15:16:38', '2023-04-21 15:16:38', '微信支付', 28);
INSERT INTO `tb_order` VALUES (4, 1, 'P007', '堂食', 1, '李四', '2023-04-21 15:16:38', '2023-04-21 15:16:38', '微信支付', 49);
INSERT INTO `tb_order` VALUES (7, 15, '0006', '打包', 77, '邱翔宇', '2023-04-21 15:17:33', '2023-04-21 15:17:33', '微信支付', 77);

SET FOREIGN_KEY_CHECKS = 1;
