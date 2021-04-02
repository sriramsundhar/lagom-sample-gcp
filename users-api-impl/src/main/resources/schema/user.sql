DROP TABLE IF EXISTS `user`;

CREATE TABLE IF NOT EXISTS `user` (
    userId int NOT NULL AUTO_INCREMENT,
    lastName varchar(255) NOT NULL,
    lirstName varchar(255),
    Age int,
    PRIMARY KEY (Personid)
);