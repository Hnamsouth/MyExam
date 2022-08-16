﻿

USE Custemers
GO
create table Numbers(
	phoneNB char(10) not null primary key 
	constraint Check_phoneNB check(phoneNB not like '%[a-z]%'),
	typenumber nvarchar(30) not null ,
	Registration Date not null  ,
)


create table Custemers(
	ID int primary key not null ,
	Name nvarchar(50) not null ,
	Address nvarchar(255) not null ,
	NumberID char(10) foreign key (NumberID) references Numbers(phoneNB)
	constraint Check_CTM_NumberID check(NumberID not like '%[a-z]%'),
)



insert into Numbers 
values ('0967656246','tra truoc','2020/12/12')

insert into Numbers 
values ('0967656246','tra truoc','2020/12/12')

insert into Numbers 
values ('0967656246','tra truoc','2020/12/12')

insert into Numbers 
values ('0123456789','tra truoc','2020/12/12')

insert into Numbers 
values ('0123456798','tra sau','2020/12/12')

insert into Numbers 
values ('0123456987','tra sau','2020/12/12')


SELECT * FROM Numbers
SELECT NumberID FROM Custemers
 WHERE ID='123456789'
-- Liệt kê các thuê bao đăng ký vào ngày 12/12/09
SELECT phoneNB FROM Numbers
WHERE Registration='2020/12/12'
--Liệt kê các thuê bao có địa chỉ tại Hà Nội
 SELECT COUNT (ID) FROM Custemers
 --Tổng số thuê bao của công ty.
  SELECT COUNT (phoneNB) FROM Numbers
 --Tổng số thuê bào đăng ký ngày 12/12/09.
  SELECT COUNT (phoneNB) FROM Numbers WHERE Registration='2020/12/12'
 --Hiển thị toàn bộ thông tin về khách hàng và thuê bao của tất cả các số thuê bao
	ALTER TABLE Numbers
	ALTER COLUMN Registration DATE not null;
-- Viết câu lệnh để thay đổi trường ngày đăng ký là trước hoặc bằng ngày hiện tại.
	ALTER TABLE Numbers
	ALTER COLUMN  Registration  default getdate() ;
-- Viết câu lệnh để thay đổi số điện thoại phải bắt đầu 09
	ALTER TABLE Custemers
	ALTER COLUMN phoneNB check(phoneNB LIKE '09%');
-- Viết câu lệnh để thêm trường số điểm thưởng cho mỗi số thuê bao.
	ADD RewardPoints int ;	