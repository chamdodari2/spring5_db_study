drop database if exists spring5;
create database spring5;


drop user if exists 'user_spring5'@'localhost';

grant all privileges on spring5.* 
to 'user_spring5'@'localhost' identified by 'rootroot';

grant all privileges on spring5.* to 'user_spring5'@'%' identified by 'rootroot';


drop user if exists 'user_spring5';
create user 'user_spring5'@'localhost' identified by 'rootroot';
drop database if exists spring5;
create database spring5;
grant all privileges on spring5.* to 'user_spring5'@'localhost';



