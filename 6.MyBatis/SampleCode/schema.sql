CREATE DATABASE IF NOT EXISTS `testdb`;

USE `testdb`;

DROP TABLE IF EXISTS `customer_table`;

CREATE TABLE `customer_table` (
    `cus_Num` INT(20) NOT NULL AUTO_INCREMENT,
    `cus_Name` VARCHAR(255) NOT NULL DEFAULT '',
    `cus_Address` VARCHAR(255) NOT NULL DEFAULT '',
    `cus_Telno` VARCHAR(255) NOT NULL DEFAULT '',
    PRIMARY KEY (`cus_Num`)
) ENGINE=InnoDB;