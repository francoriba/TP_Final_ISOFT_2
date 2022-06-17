-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema bdd_borbosblock
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bdd_borbosblock
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bdd_borbosblock` DEFAULT CHARACTER SET utf8 ;
USE `bdd_borbosblock` ;

-- -----------------------------------------------------
-- Table `bdd_borbosblock`.`key`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdd_borbosblock`.`key` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `path` VARCHAR(45) NOT NULL,
  `key` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdd_borbosblock`.`password`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdd_borbosblock`.`password` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `url` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `userName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdd_borbosblock`.`banckCard`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdd_borbosblock`.`banckCard` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `owner` VARCHAR(45) NULL,
  `number` VARCHAR(16) NOT NULL,
  `secNumber` VARCHAR(3) NOT NULL,
  `expirationDate` VARCHAR(5) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
