drop database class;
create database class;
use class;
create table Student(
	sid varchar(10),
	fullName varchar(100) not null,
	DOB varchar(10) not null,
	gender varchar(100)not null,
	address varchar(100) not null,
	phone_no int,
	guardian_name varchar(100),
	guardian_job varchar(100),
	guardian_phone_no int,
	constraint primary key(sid) 
);
insert into student values('s001','Nimal_Perera','2001-03-06','Male','NO:20,Kakanadura,Matara','0776672890','A.G.Danapala','','0778965432');
insert into student values('s013','rety','2009-09-09','Male','sdfgh','1234567890','fghj','sdfgh','1234567890');
create table Grade(
	gid varchar(10),
	grade_No int not null,
	year varchar(10),
	student_Limit int,
	constraint primary key(gid)
);
insert into Grade values('g001','6','2017','20');
create table Subject(
	sub_id varchar(10),
	name varchar(100)not null,
	subject_Fee Decimal(10,2),
	constraint primary key(sub_id)
);
insert into Subject values('su01','sinhala','500.00');

create table Teacher(
	tid varchar(10),
	sub_id varchar(10),
	full_name varchar(100)not null,
	name_with_initials varchar(100),
	dob varchar(10) not null,
	gender varchar(100)not null,
	address varchar(100)not null,
	tele int not null,
	income Decimal not null,
	constraint primary key(tid),
	constraint foreign key(sub_id)references Subject(sub_id)
	ON UPDATE CASCADE ON DELETE CASCADE
);
insert into teacher values('t001','su01','Vimal_Rathnayaka','V.Rathnayaka','1983-03-04','Female','No:18,Matara','0726474568','25000');

create table Class(
	gid varchar(10),
	sub_id varchar(10),
	grade_sub_id varchar(10),
	constraint primary key(grade_sub_id),
	constraint foreign key(gid)references Grade(gid),
	constraint foreign key(sub_id)references Subject(sub_id)
);
insert into Class values('g001','su01','gs01');
create table registration(
	rid varchar(10),
	sid varchar(10),
	gid varchar(10),
	date varchar (10)not null,
	fee Decimal,
	constraint primary key(rid),
	constraint foreign key (sid) references Student(sid)
	ON UPDATE CASCADE ON DELETE CASCADE,
	constraint foreign key (gid) references Grade(gid)
	ON UPDATE CASCADE ON DELETE CASCADE
);
insert into Registration values('r001','s001','g001','2017-09-09','500.00');
insert into registration values('r002','s013','g001','2017-09-09','500.00');

create table Attendence(
	attend_id varchar(10),
	rid varchar(10),
	sub_id varchar(10),
	date varchar(10) not null,
        time Decimal not null,
        present_mark varchar(10),
	constraint primary key(attend_id),
	constraint foreign key (rid) references Registration(rid)
);

create table Schedule(
        scheduleId varchar(100),
	tid varchar(10),
	gid varchar(10),
        sub_id varchar(10),
	rid varchar(10),
        day varchar(10),
        time Decimal(10,2),
	constraint primary key(scheduleId),
	constraint foreign key(tid)references Teacher(tid)
	ON UPDATE CASCADE ON DELETE CASCADE,
        constraint foreign key(gid)references Class(gid)
	ON UPDATE CASCADE ON DELETE CASCADE,
        constraint foreign key(sub_id)references Class(sub_id)
	ON UPDATE CASCADE ON DELETE CASCADE,
	constraint foreign key(rid)references Registration(rid)
	ON UPDATE CASCADE ON DELETE CASCADE
);

insert into Schedule values('sch01','t001','g001','su01','r001','2017-09-09','2.30');
create table Payment(
	pid varchar(10),
	rid varchar(10),
	subject_Name varchar(10),
	payment_type varchar(100),
	date varchar(10),
	fee Decimal(10,2),
	constraint primary key(pid),
	constraint foreign key(rid)references Registration(rid)
	ON UPDATE CASCADE ON DELETE CASCADE
);

