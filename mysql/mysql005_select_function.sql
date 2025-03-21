use mbasic;
select * from emp;

select @@sql_mode;
set SESSION sql_mode='STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

#Q1.
select deptno,job,avg(sal) `평균급여` from emp 
where sal<=3000 group by deptno,job having avg(sal)>=2000 order by deptno; 

#Q2.
select deptno, job, count(*) `사원수`, max(sal) `최고급여`, sum(sal) `급여함`, avg(sal) `평균급여` from emp
group by deptno, job order by deptno,job;

# ■ 진도 - function
#1. Number
#2. String
#3. Date
#4. if / case

#1. Number (cell 올림, floor 내림, round 반올림, mod 나머지)
--			 2
select ceil(1.1) `올림`, floor(1.9) `내림`, round(1.5) `반올림`, mod(10,3) `나머지`;

select round(123.4578,4) `ROUND1`, round(123.4578) `ROUND2`, round(123.4578,-1) `ROUND3`, round(123.4578,2) `ROUND4`;

select 123.4578, ceil(123.4578) `ceil`, floor(123.4578) `floor`;

-------------------------------
# String
-------------------------------

-- 2-1. basic
-- 1) length(문자열)  갯수
select length('abc');

-- 2) upper/lower
select 'abc', upper('abc'), lower('abc');

-- 3) instr 위치				
select instr('abc','b') `b의 위치`, instr('abc','ab') `ab의 위치`, instr('abc','ac') `ac의 위치`;

-- 4) left(문자열, 몇개), right, substr(문자열, 시작, 몇개) 문자열 일부분
select left('abc',1), left('abc',2), right('abc',1), right('abc',2); -- a, ab, c, bc
select substr('abcde', 2,2) `bc`, substr('abcde',2,3) `bcd`, substr('abcde',1,3) `abc`;

-- 5) 문자열연결 concat(문자열1, 문자열2)
select concat('hello ','mysql') ;

-- 6) trim 좌우공백빼기
select trim(' a b c ') `a b c`;

select concat('#', trim(' a b c '), '#')	`#a b c#`
	 , concat('#', ltrim(' a b c '), '#')   `#a b c #`
     , concat('#', rtrim(' a b c '), '#')	`# a b c#` ;
-- 7) replace(문자열에서, 찾아서, 바꾸기)
select replace("hello sally", 'sally', 'alpha') `hello alpha`; 

-- 8) repeat(뭐를, 몇개반복)
select repeat ('*',5) `*****`;

-- 9) 빈칸채우기
select lpad('abc', 10, '#')
	  , rpad('abc', 10, '#');
      
-- 1) length(문자열) 갯수
-- 2) upper 대문자 / lower 소문자
-- 3) instr(문자열, 찾을문자열) 위치, 못찾으면 0
-- 4) left(문자열, 몇개) right, substr(문자열, 시작, 몇개) 문자열 일부분
-- 5) 문자열연결 concat(문자열1, 문자열2)
-- 6) trim 좌우공백빼기
-- 7) replace(문자열에서, 찾아서, 바꾸기)
-- 8) repeat(뭐를, 몇개반복)
-- 9) 빈칸채우기

-- function 연습문제
create table fn_select_userinfo2(
no int not null default  0, name varchar(20) not null,
age int not null, email varchar(20) not null
); 
desc fn_select_userinfo2;
insert into fn_select_userinfo2 values(1,'aaa',11,'aaa@gmail.com');
insert into fn_select_userinfo2 values(2,'bbb',22,'bbb@gmail.com');
insert into fn_select_userinfo2 values(3,'ccc',33,'ccc@gmail.com');
insert into fn_select_userinfo2 values(4,'ddd',44,'ddd@gmail.com');
insert into fn_select_userinfo2 values(5,'abc',55,'abc@gmail.com');
insert into fn_select_userinfo2 values(6,'bca',66,'bca@gmail.com');
drop table fn_select_userinfo2;
select * from fn_select_userinfo2;

-- 1
select name `이름`, length(name) `갯수` from fn_select_userinfo2;

-- 2
select name, left(name,1) `첫번째 글자`, right(name,1) `마지막 글자` 
from fn_select_userinfo2;

-- 3
select name, replace(name,'aaa','aaa 1등') from fn_select_userinfo2;

-- 4
select concat(name,'는 개발자입니다.') `직업` from fn_select_userinfo2;

-- 5
select upper(name) `대문자` from fn_select_userinfo2;

-- 6
select lower(name) `소문자` from fn_select_userinfo2;

-- 7
select name, instr(name, 'b') from fn_select_userinfo2 where age>=40;

-- 8
select name, instr(name, 'b') from fn_select_userinfo2 
where age>=40 order by age desc limit 2;

-- 9
select name, concat(left(name,1),'*',right(name,1)) `test` from fn_select_userinfo2;

-- 10
drop table select_userinfo2;

create table select_userinfo2 
select name,concat(left(name,1),repeat('*',length(name)-2),right(name,1)) `test`
from select_userinfo3; 

select * from select_userinfo2;


-------------------------------------------------
#3. Date
-------------------------------------------------

-- 1) 시스템의 현재 시각조회
select now();	-- '2025-03-21 11:58:22'
select current_time(); -- '11:59:08'

-- 2) 요일	(0 = Mon , 1 = Tue , 6=Sun)
select weekday(now());	-- 4 금
select weekday("2025-03-21");	-- 4 금

-- 3) 날짜형식 date_format(날짜지정, '%Y-%m-%d')
select date_format("2025-03-21", '%Y-%m-%d');
select date_format(now(), '%Y-%m-%d %H:%i:%s' );

-- 4) 100일전 / 후 date_add
select date_add(now(), interval -10 day); -- 2025-03-11 12:06:07
select date_add(now(), interval  10 day); -- 2025-03-31 12:06:40
select date_add(now(), interval  -3 hour); -- 2025-03-21 09:07:15

-- 5) datediff(날짜1, 날짜2) 날짜차이
select datediff('2025-03-22','2025-03-21');		-- 1
select timestampdiff(hour, '2025-03-22','2025-03-21');		-- -24

-- function date 연습문제
use mbasic;
desc date_userinfo;
create table date_userinfo(
no int not null, name varchar(100) not null,
age int not null,
date datetime default now() not null
);
insert into date_userinfo values(1,'aaa',11,'2022-12-30 00:00:00');
insert into date_userinfo values(2,'bbb',22,'2022-11-30 00:00:00');
insert into date_userinfo values(3,'ccc',33,'2022-10-30 00:00:00');
insert into date_userinfo values(4,'ddd',44,'2022-09-30 00:00:00');
select * from date_userinfo;

-- 1
select name, date from date_userinfo where date < date_format('2022-11-01',"%Y-%m-%d");
select name, date from date_userinfo where date < '2022-11-01';

-- 2
select name, date, date_add(date, interval 30 day) `event1` from date_userinfo
where month(date)=12;

-- 3
select name, date_format(date,'%Y년%m월%d일') `가입날짜` from date_userinfo;


-- 번외
-- 연습문제2)



------------------------------
#4. if / case
------------------------------
-- if(조건, 참, 거짓)
-- 다형식
/*  case	조건1	then	상태1
	when	조건2	then	상태2
    else	모든조건에 해당하지 않을때, 생략가능
    end
*/

create table control (no int);
insert into control values (1), (2), (3);
select * from control;

-- 1-1
select no, if(no=1, '1이다', '1이 아니다') `상태` from control;

-- 1-2
select no, if(no>1, '1보다 크다', '1보다 작다') `상태` from control;

-- 1-3. case	when/then		end
select no, case
				when no=1 then '1이다'
				when no=2 then '2이다'
				when no=3 then '3이다'
				else '1,2,3이 아니다'		
			end `state`
from control;

-- 1-4. 2이다, 크다, 작다
select no, case 
				when no>2 then '크다'
                when no=2 then '2이다'
                when no<3 then '작다'
			end `state`
from control;


desc if_userinfo;
create table if_userinfo select * from userinfo;
alter table if_userinfo add sex char(1);
alter table if_userinfo add sns char(1);
select * from if_userinfo;
drop table if_userinfo;
create table if_userinfo(
no int not null auto_increment primary key,
name varchar(100) not null,
age int,
sex char(1),
sns char(1)
);
insert into if_userinfo (name,age,sns) values('first',11,'n');
insert into if_userinfo (name,age,sex,sns) values('second',122,'m','y');
insert into if_userinfo (name,age,sex,sns) values('third',33,'m','y');
insert into if_userinfo (name,age,sex,sns) values('fourth',44,'f','n');
insert into if_userinfo (name,age,sex,sns) values('fifth',55,'f','y');
insert into if_userinfo (name,age,sex,sns) values('sixth',66,'m','n');

-- 1
select no, name, age, sex, sns, if(sns='n', '수신거부', '수신유지') `수신여부상태` 
from if_userinfo;

-- 2
select no, name, age, sex, sns, if(age>19, '성인','미성년자') `성인여부` 
from if_userinfo;

-- 3
select ename, deptno, case
when deptno=10 then 'ACCOUNTING'
when deptno=20 then 'RESEARCH'
when deptno=30 then 'SALES'
end `부서이름`
from emp;

select ename, deptno, case deptno
when 10 then 'ACCOUNTING'
when 20 then 'RESEARCH'
when 30 then 'SALES'
end `부서이름`
from emp;


select ename, job, case
when job='CLERK' then '판매원'
when job='SALESMAN' then '판매원'
when job='MANAGER' then '판매원'
when job='ANALYST' then ''
when job='PRESIDENT' then '사원'
end `job2`
from emp













