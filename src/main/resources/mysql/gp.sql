/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50527
 Source Host           : localhost:3306
 Source Schema         : gp

 Target Server Type    : MySQL
 Target Server Version : 50527
 File Encoding         : 65001

 Date: 25/04/2020 17:44:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for accident
-- ----------------------------
DROP TABLE IF EXISTS `accident`;
CREATE TABLE `accident`  (
  `accidentno` int(5) NOT NULL AUTO_INCREMENT COMMENT '事故单号',
  `driver` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '驾驶员',
  `carbrand` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车牌号',
  `accidentTime` datetime NULL DEFAULT NULL COMMENT '事故时间',
  `accidentPlace` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '事故地点',
  `accidentDetails` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '事故详情',
  `responsibility` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '责任认定',
  `maintenanceFactory` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '维修厂家',
  `repairDate` date NULL DEFAULT NULL COMMENT '送修日期',
  `repairEndDate` date NULL DEFAULT NULL COMMENT '维修结束日期',
  `damageFee` decimal(8, 2) NULL DEFAULT NULL COMMENT '车损费',
  `InsuranceClaimAmount` decimal(8, 2) NULL DEFAULT NULL COMMENT '保险理赔金额',
  `driverBorneAmount` decimal(8, 2) NULL DEFAULT NULL COMMENT '驾驶员承担金额',
  `maintenanceCosts` decimal(8, 2) NULL DEFAULT NULL COMMENT '维修费用',
  `maintenanceContents` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '维修内容',
  `enclosure` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '附件',
  `filename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上传文件名',
  PRIMARY KEY (`accidentno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10002 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of accident
-- ----------------------------
INSERT INTO `accident` VALUES (10001, '丁二', 'A85642', '1989-07-26 00:00:00', '日本洛杉矶', '为什么没有更新？', '罚了200块+6分', '丰田', '2020-01-11', '2020-02-05', 2000.00, NULL, NULL, NULL, '这里的书记拿到了吗', 'file.ddbing.cn/bdfb3637-6e93-4528-9f67-5d53d1368f98.txt', '配置文件.txt');

-- ----------------------------
-- Table structure for car
-- ----------------------------
DROP TABLE IF EXISTS `car`;
CREATE TABLE `car`  (
  `carNo` int(10) NOT NULL AUTO_INCREMENT COMMENT '车辆编号',
  `carName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '车辆名称',
  `carBrand` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '车牌号',
  `carSpecs` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '规格',
  `fuel` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '油耗',
  `price` int(8) NULL DEFAULT 0 COMMENT '价格',
  `color` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '颜色',
  `manufacturer` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '生产商',
  `supplier` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '供应商',
  `productionDate` date NULL DEFAULT NULL COMMENT '生产日期',
  `purchaseDate` date NULL DEFAULT NULL COMMENT '采购日期',
  `engineNo` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '发动机号',
  `frameNo` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车架号',
  `storage` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '存放区域',
  `manager` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理人',
  `status` int(2) NULL DEFAULT 0 COMMENT '状态',
  `additionalDescription` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '附加描述',
  `URL` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'url',
  `nextAnnualInspectionDate` date NULL DEFAULT NULL COMMENT '下次年检日期',
  `insuranceDeadline` date NULL DEFAULT NULL COMMENT '保险截止日期',
  `lastServiceDate` date NULL DEFAULT NULL COMMENT '上次保养日期',
  PRIMARY KEY (`carNo`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of car
-- ----------------------------
INSERT INTO `car` VALUES (1, '丰田', '苏A738I1', '', '', 0, '', '', '', NULL, NULL, '', '', '', '丁一', 0, NULL, 'file.ddbing.cn/7352da07-bf1c-4940-b759-4e2e7f2fb1e9.jpg', '2020-01-08', '2021-08-18', '2019-09-17');
INSERT INTO `car` VALUES (2, '法拉利', '苏A88888', '', '', NULL, '', '', '', NULL, NULL, '', '', '', '', 0, NULL, 'file.ddbing.cn/aba8dcd6-21de-4abe-a277-64c8e3a3d78e.jpg', NULL, NULL, NULL);
INSERT INTO `car` VALUES (3, '自行车', '', '2座', '0', 500, '白色', '极客营', '极客营', '2020-01-07', '2020-01-08', '', '1', '', '丁一', 2, NULL, 'file.ddbing.cn/8f5db405-3875-4071-81c4-bd0f7d0a82c5.jpg', '2020-01-30', '2020-01-01', '2020-01-01');
INSERT INTO `car` VALUES (8, '丰田', '00001', '123123', '', 0, '', '', '', NULL, '2015-01-13', '', '', '', '丁一', 2, NULL, 'file.ddbing.cn/d6d53d61-a6ef-47c1-9f7a-9d91661a7b46.jpg', NULL, NULL, '2019-05-12');
INSERT INTO `car` VALUES (9, '卡宴', '浙B222225651', '', '', 250000, '', '', '', NULL, '2020-01-06', '', '', '', '', 1, NULL, 'file.ddbing.cn/5eb42f96-455c-46b4-b791-c9d6eeff6e5c.jpg', '2020-01-21', NULL, NULL);
INSERT INTO `car` VALUES (14, '奔驰', '苏A88888', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `car` VALUES (15, '阿里巴巴', '皖A6666', '', '', 0, '', '', '', NULL, NULL, '', '', '', '', 1, NULL, 'file.ddbing.cn/ecd75e6a-dfde-470d-b531-77bc5a0b58c8.jpg', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for carapplication
-- ----------------------------
DROP TABLE IF EXISTS `carapplication`;
CREATE TABLE `carapplication`  (
  `applicationNo` int(5) NOT NULL AUTO_INCREMENT COMMENT '用车申请表单号',
  `applicant` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '申请人',
  `applicationDate` date NULL DEFAULT NULL COMMENT '申请日期',
  `selfDriving` int(1) NOT NULL DEFAULT 0 COMMENT '是否自驾',
  `passenger` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乘车人信息',
  `passengerNumber` int(2) NULL DEFAULT NULL COMMENT '乘车人数',
  `departureTime` date NULL DEFAULT NULL COMMENT '出发时间',
  `returnTime` date NULL DEFAULT NULL COMMENT '预计返回时间',
  `reasons` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用车事由',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `designatedVehicle` int(2) NULL DEFAULT NULL COMMENT '指定车辆',
  `driverInformation` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '驾驶员信息',
  `timeAndPlace` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '乘车时间和地点',
  `actualInformation` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '实际用车信息',
  `fuel` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用车油耗',
  `cost` int(5) NULL DEFAULT NULL COMMENT '用车费用',
  PRIMARY KEY (`applicationNo`) USING BTREE,
  INDEX `car_carApplication`(`designatedVehicle`) USING BTREE,
  CONSTRAINT `car_carApplication` FOREIGN KEY (`designatedVehicle`) REFERENCES `car` (`carNo`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of carapplication
-- ----------------------------
INSERT INTO `carapplication` VALUES (2, '测试人员111', '2020-01-09', 1, '我自己', 1, '2020-01-10', '2020-01-16', '想要都疯了', '没什么好说的，就是想开车', 2, '', '', '', '', NULL);
INSERT INTO `carapplication` VALUES (3, '丁兵兵', '2020-01-09', 1, '', 1, '2020-01-16', '2020-05-23', '回家', '放假回家', 1, '', '', '', '', NULL);

-- ----------------------------
-- Table structure for carlocation
-- ----------------------------
DROP TABLE IF EXISTS `carlocation`;
CREATE TABLE `carlocation`  (
  `carNo` int(5) NOT NULL AUTO_INCREMENT COMMENT '车id',
  `carName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车名',
  `carBrand` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车牌号',
  `longitude` decimal(5, 2) NULL DEFAULT NULL COMMENT '经度',
  `latitude` decimal(5, 2) NULL DEFAULT NULL COMMENT '纬度',
  `carPhone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车载电话',
  PRIMARY KEY (`carNo`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of carlocation
-- ----------------------------
INSERT INTO `carlocation` VALUES (1, '丰田', '苏A738I1', 116.40, 39.92, '13399611042');
INSERT INTO `carlocation` VALUES (2, '法拉利', '苏A88888', 117.39, 40.80, '0563-2226666');
INSERT INTO `carlocation` VALUES (3, '丰田', '00001', 118.66, 41.55, '18225938781');
INSERT INTO `carlocation` VALUES (4, '卡宴', '浙B222225651', 119.99, 45.63, '13313166564');

-- ----------------------------
-- Table structure for driver
-- ----------------------------
DROP TABLE IF EXISTS `driver`;
CREATE TABLE `driver`  (
  `driverId` int(10) NOT NULL AUTO_INCREMENT,
  `driverName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `driverAge` int(2) NOT NULL,
  `license` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `drivingAge` int(2) NOT NULL,
  `assessment` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` int(2) NOT NULL,
  `birthday` date NULL DEFAULT NULL,
  `sfzzm` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证正面照片url',
  `sfzfm` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证反面照片url',
  `jszzm` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '驾驶证正面照片url',
  `jszfm` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '驾驶证反面照片url',
  PRIMARY KEY (`driverId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of driver
-- ----------------------------
INSERT INTO `driver` VALUES (1, '高青松', 22, 'C1', 2, '合格', '淮北师范大学大坑', 0, '1994-06-10', 'file.ddbing.cn/5eb42f96-455c-46b4-b791-c9d6eeff6e5c.jpg', 'file.ddbing.cn/c3e34b2b-1bfd-4f67-a5ec-3f2def057d3d.png', 'file.ddbing.cn/c16e243d-6c8f-4587-ba1e-05bd633785fa.jpg', '');
INSERT INTO `driver` VALUES (2, '高高', 50, 'A1', 1, '优秀', '无锡软件园', 1, '1998-06-02', NULL, 'file.ddbing.cn/5eb42f96-455c-46b4-b791-c9d6eeff6e5c.jpg', NULL, NULL);
INSERT INTO `driver` VALUES (3, '12312', 225, 'C2', 1, '请选择', '', 1, NULL, 'file.ddbing.cn/957581e3-1438-446c-9464-43e2eac468ab.jpg', 'file.ddbing.cn/bb860ff3-1c85-44d1-96fd-64c9b405633f.jpg', '', 'file.ddbing.cn/624b8901-0c8c-41f0-9143-8a2b9ff68f6e.jpg');

-- ----------------------------
-- Table structure for fuel
-- ----------------------------
DROP TABLE IF EXISTS `fuel`;
CREATE TABLE `fuel`  (
  `registrationNumber` int(5) NOT NULL AUTO_INCREMENT COMMENT '登记单号',
  `applicant` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '申请人',
  `applicationDate` date NULL DEFAULT NULL COMMENT '申请日期',
  `carBrand` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车牌号',
  `refuelingDate` date NULL DEFAULT NULL COMMENT '加油日期',
  `refuelingCapacity` decimal(5, 2) NULL DEFAULT NULL COMMENT '加油容量',
  `fuelAmount` decimal(5, 2) NULL DEFAULT NULL COMMENT '加油金额',
  `chargePerson` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经办人',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `voucher` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '凭证的url',
  PRIMARY KEY (`registrationNumber`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10003 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of fuel
-- ----------------------------
INSERT INTO `fuel` VALUES (10002, '收到啊', '2020-01-09', '苏A88888', '2020-01-15', 1.50, 200.00, '', '这是我第二次加油了', 'file.ddbing.cn/5ec1e6a9-4b39-470e-8b5a-392af0f0727d.jpg');

-- ----------------------------
-- Table structure for inspection
-- ----------------------------
DROP TABLE IF EXISTS `inspection`;
CREATE TABLE `inspection`  (
  `inspectionNo` int(5) NOT NULL AUTO_INCREMENT COMMENT '车检单号',
  `applicant` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '申请人',
  `applicationDate` date NULL DEFAULT NULL COMMENT '申请日期',
  `theme` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '主题',
  `carBrand` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车牌号',
  `inspectionPlace` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '年检地点',
  `phoneNumber` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
  `cost` decimal(8, 2) NULL DEFAULT NULL COMMENT '费用',
  `chargePerson` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经办人',
  `thisInspectionDate` date NULL DEFAULT NULL COMMENT '本次年检日期',
  `nextInspectionDate` date NULL DEFAULT NULL COMMENT '下次年检日期',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `enclosure` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '附件',
  `filename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上传文件名',
  PRIMARY KEY (`inspectionNo`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of inspection
-- ----------------------------
INSERT INTO `inspection` VALUES (2, '丁一', '2020-01-11', '第一次年检', 'hu123123', '宣城weqeq', '123132156', 0.00, '', '2020-01-15', '2021-01-15', '挺好的asdasdaasadasdasdasdasd', 'file.ddbing.cn/1ea5777c-c97c-4ffa-97e0-bbacca699b4b.txt', '网址.txt');
INSERT INTO `inspection` VALUES (3, '阿卡丽', '2020-01-11', '真实伤害', 'A22223', '淮北师范大学', '13265598', 2000.00, '艾克', '2020-01-11', '2021-02-11', '没什么好说的，一个皮肤7900点券', 'file.ddbing.cn/3e95336d-aa25-4869-aec1-89c4725159e7.txt', '线程间隔输出.txt');

-- ----------------------------
-- Table structure for insurance
-- ----------------------------
DROP TABLE IF EXISTS `insurance`;
CREATE TABLE `insurance`  (
  `insuranceNo` int(5) NOT NULL AUTO_INCREMENT COMMENT '保险表单号',
  `applicant` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '申请人',
  `applicationDate` date NULL DEFAULT NULL COMMENT '申请日期',
  `theme` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '主题',
  `carBrand` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车牌号',
  `firstInsurancePremium` int(10) NULL DEFAULT NULL COMMENT '交强险保费',
  `firstInsuranceAmount` int(10) NULL DEFAULT NULL COMMENT '交强险保额',
  `firstInsuranceRemarks` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '交强险备注',
  `secondInsurancePremium` int(10) NULL DEFAULT NULL COMMENT '车辆损失险保费',
  `secondInsuranceAmount` int(10) NULL DEFAULT NULL COMMENT '车辆损失险保额',
  `secondInsuranceRemarks` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车辆损失险备注',
  `thirdInsurancePremium` int(10) NULL DEFAULT NULL COMMENT '第三者责任人险保费',
  `thirdInsuranceAmount` int(10) NULL DEFAULT NULL COMMENT '第三者责任人险保额',
  `thirdInsuranceRemarks` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '第三者责任人险备注',
  `fourthInsurancePremium` int(10) NULL DEFAULT NULL COMMENT '车上人员责任保险保费',
  `fourthInsuranceAmount` int(10) NULL DEFAULT NULL COMMENT '车上人员责任保险保额',
  `fourthInsuranceRemarks` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车上人员责任保险备注',
  `fifthInsurancePremium` int(10) NULL DEFAULT NULL COMMENT '盗抢险保费',
  `fifthInsuranceAmount` int(10) NULL DEFAULT NULL COMMENT '盗抢险保额',
  `fifthInsuranceRemarks` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '盗抢险备注',
  `sixthInsurancePremium` int(10) NULL DEFAULT NULL COMMENT '划痕险保费',
  `sixthInsuranceAmount` int(10) NULL DEFAULT NULL COMMENT '划痕险保额',
  `sixthInsuranceRemarks` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '划痕险备注',
  `seventhInsurancePremium` int(10) NULL DEFAULT NULL COMMENT '玻璃单独破碎险保费',
  `seventhInsuranceAmount` int(10) NULL DEFAULT NULL COMMENT '玻璃单独破碎险保额',
  `seventhInsuranceRemarks` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '玻璃单独破碎险备注',
  `eighthInsurancePremium` int(10) NULL DEFAULT NULL COMMENT '自燃险保费',
  `eighthInsuranceAmount` int(10) NULL DEFAULT NULL COMMENT '自燃险保额',
  `eighthInsuranceRemarks` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '自燃险备注',
  `repairShopPremium` int(10) NULL DEFAULT NULL COMMENT '指定专修厂保费',
  `repairShopAmount` int(10) NULL DEFAULT NULL COMMENT '指定专修厂保额',
  `repairShopRemarks` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '指定专修厂备注',
  `excludingDeductiblePremium` int(10) NULL DEFAULT NULL COMMENT '不计免赔保费',
  `excludingDeductibleAmount` int(10) NULL DEFAULT NULL COMMENT '不计免赔保额',
  `excludingDeductibleRemarks` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '不计免赔备注',
  `insuranceCompany` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '投保公司',
  `insuranceCall` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '投保电话',
  `insurancePeriodStart` date NULL DEFAULT NULL COMMENT '保险有效期开始',
  `insurancePeriodEnd` date NULL DEFAULT NULL COMMENT '保险有效期结束',
  `totalCost` decimal(10, 2) NULL DEFAULT NULL COMMENT '投保总费用',
  `chargePerson` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经办人',
  `enclosure` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '附件',
  `filename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件上传名',
  PRIMARY KEY (`insuranceNo`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of insurance
-- ----------------------------
INSERT INTO `insurance` VALUES (1, '丁一', '2020-01-10', '个哈哈哈', '沪A123131', NULL, NULL, '', NULL, NULL, '', NULL, NULL, '', NULL, NULL, '', NULL, NULL, '', NULL, NULL, '', NULL, NULL, '', NULL, NULL, '', NULL, NULL, '', NULL, NULL, '', '', '', '2020-01-17', '2020-01-11', 0.00, '', 'file.ddbing.cn/6049ec73-8be1-431f-8682-d954ee6a40cc.txt', '简历字.txt');
INSERT INTO `insurance` VALUES (3, 'asdasd', '2020-01-15', 'asdasdad', '皖A80551', 200, NULL, '', NULL, NULL, '', NULL, NULL, '', NULL, NULL, '', 200, NULL, '', NULL, NULL, '', NULL, NULL, '', NULL, NULL, '', NULL, NULL, '', NULL, NULL, '', '', '', '2020-01-09', '2019-12-30', 0.00, '', '', '');

-- ----------------------------
-- Table structure for maintain
-- ----------------------------
DROP TABLE IF EXISTS `maintain`;
CREATE TABLE `maintain`  (
  `maintainNo` int(5) NOT NULL AUTO_INCREMENT COMMENT '维修保养单号',
  `applicant` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '申请人',
  `applicationDate` date NULL DEFAULT NULL COMMENT '申请日期',
  `theme` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '主题',
  `carBrand` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车牌号',
  `type` int(1) NULL DEFAULT 0 COMMENT '维修保养类型 维修：保养',
  `maintenanceCompany` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '维修保养公司',
  `cost` decimal(8, 2) NULL DEFAULT NULL COMMENT '费用',
  `chargePerson` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经办人',
  `startMaintainDate` date NULL DEFAULT NULL COMMENT '开始日期',
  `endMaintainDate` date NULL DEFAULT NULL COMMENT '结束日期',
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '具体内容',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `enclosure` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '附件',
  `filename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上传文件名',
  PRIMARY KEY (`maintainNo`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20004 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of maintain
-- ----------------------------
INSERT INTO `maintain` VALUES (20002, 'heow', '2020-01-11', '第二次进行保养车', 'A24154', 0, '自行车保养公司', 200.00, '丁一', '2020-01-11', '2020-01-13', 'Helloween打完大无', '希望我的自行车能修好', 'file.ddbing.cn/0eaa9c2e-abf3-4c17-9724-98c409ebb100.txt', '新建文本文档.txt');

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission`  (
  `perid` int(11) NOT NULL AUTO_INCREMENT,
  `pername` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `percode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`perid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES (1, '用户查询', 'user:query');
INSERT INTO `permission` VALUES (2, '用户添加', 'user:add');
INSERT INTO `permission` VALUES (3, '用户修改', 'user:update');
INSERT INTO `permission` VALUES (4, '用户删除', 'user:delete');
INSERT INTO `permission` VALUES (5, '导出用户', 'user:export');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `roleid` int(11) NOT NULL AUTO_INCREMENT,
  `rolename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`roleid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, '超级管理员');
INSERT INTO `role` VALUES (2, '人事经理');
INSERT INTO `role` VALUES (3, '人事专员');

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission`  (
  `perid` int(255) NOT NULL,
  `roleid` int(11) NOT NULL,
  PRIMARY KEY (`perid`, `roleid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES (1, 1);
INSERT INTO `role_permission` VALUES (1, 2);
INSERT INTO `role_permission` VALUES (1, 3);
INSERT INTO `role_permission` VALUES (2, 1);
INSERT INTO `role_permission` VALUES (2, 2);
INSERT INTO `role_permission` VALUES (3, 1);
INSERT INTO `role_permission` VALUES (3, 2);
INSERT INTO `role_permission` VALUES (4, 1);
INSERT INTO `role_permission` VALUES (5, 3);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`userid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '丁一', '3bde870b8eb82708ec98b9282e5bba07', '男', '上海');
INSERT INTO `user` VALUES (2, 'lisi', 'c6e8fba5c6b276fdc90fe41586ae6583', '女', '南京');
INSERT INTO `user` VALUES (3, 'wangwu', '84b963fcbe7ae625387926c534d56b11', '女', '武汉');
INSERT INTO `user` VALUES (4, 'zhangsan', 'cf04e04c9b383414401852c5e0c6f623', '男', '无锡');
INSERT INTO `user` VALUES (5, '丁二', 'd1f7dd588ea24d1acc09b66446200fc7', NULL, NULL);
INSERT INTO `user` VALUES (17, '毕学文', 'a911ff5f0cbccdffb61ab86cd25147a0', '0', '马鞍山');
INSERT INTO `user` VALUES (18, '阿舒', '3d1527eb6d67e44c986524a7888b72e5', '0', '合肥');
INSERT INTO `user` VALUES (19, '123', 'b2793335f43645fd8e00c7d18e14e05f', '0', '123');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
  `userid` int(11) NOT NULL,
  `roleid` int(11) NOT NULL,
  PRIMARY KEY (`userid`, `roleid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES (1, 1);
INSERT INTO `user_role` VALUES (2, 2);
INSERT INTO `user_role` VALUES (3, 3);

SET FOREIGN_KEY_CHECKS = 1;
