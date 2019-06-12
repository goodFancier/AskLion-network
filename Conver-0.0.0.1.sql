CREATE TABLE messager.users (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  email varchar(40) DEFAULT NULL,
  name varchar(40) DEFAULT NULL,
  password varchar(100) DEFAULT NULL,
  username varchar(15) DEFAULT NULL,
  createdAt datetime DEFAULT NULL,
  updatedAt datetime DEFAULT NULL,
  PRIMARY KEY (id)
)
ENGINE = INNODB,
AUTO_INCREMENT = 6,
AVG_ROW_LENGTH = 124,
CHARACTER SET utf8,
COLLATE utf8_general_ci;

ALTER TABLE messager.users
ADD UNIQUE INDEX UK6dotkott2kjsp8vw4d0m25fb7 (email);

ALTER TABLE messager.users
ADD UNIQUE INDEX UKr43af9ap4edm43mmtq01oddj6 (username);