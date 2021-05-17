
drop table member


create table MEMBER (
ID int auto_increment primary key,
EMAIL varchar(255),
PASSWORD varchar(100),
NAME varchar(100),
REGDATE datetime,
unique key (EMAIL) 
);


-- 단방향해시함수
password char(41)