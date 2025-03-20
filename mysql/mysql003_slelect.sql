use mbasic;
show tables;
create table milk(
mno int not null auto_increment primary key,
mname varchar(20) not null,
mprice int not null
);
insert into milk (mname,mprice) values('white',1000);
insert into milk (mname,mprice) values('choco',1200);
insert into milk (mname,mprice) values('banana',1800);

#Q1. milk에 4, melon, 5000 데이터를 추가하시오.
insert into milk (mname,mprice) values('melon',5000);

#Q2. mno가 4번인 데이터의 mprice를 1500로 변경하시오.
update milk set mprice=1500 where mno=4;

#Q3. mno가 4번이고 mname이 melon인 데이터를 삭제하시오.
delete from milk where mname='melon' and mno=4;

#Q4. milk 데이터를 출력하시오. 
select * from milk;

-- 구조 + 데이터
create table select_userinfo select * from userinfo;
alter table select_userinfo 
modify no int not null auto_increment primary key;

delete from select_userinfo where no=7; 

insert into select_userinfo (name, age) values ('first',55);
insert into select_userinfo (name, age) values ('third',66);
update select_userinfo set no=6 where no=9;

select * from select_userinfo;

##2-2 ctrl + enter 실행
-- 1. 전체 데이터 검색
select * from select_userinfo;
-- 2. 부분검색
select name, age from select_userinfo;
-- 3. 중복제거
select distinct name from select_userinfo;
-- 4. 별명
select name as `이름`, age as `나이` from select_userinfo;

-- 5. where 조건(= 같다, !=  <> 다르다, < <= > >=)
select * from select_userinfo where name='second';
select * from select_userinfo where name!='second';
select * from select_userinfo where name <> 'second';

select* from select_userinfo where age<33;		-- 11 22
select* from select_userinfo where age<=33;		-- 11 22 33
select* from select_userinfo where age>33;		-- 44 55 66
select* from select_userinfo where age>=33;		-- 33 44 55 66

-- 6. 모든조건- and , between and / 조건중에- or , in
select * from select_userinfo where age>=22 and age<=33;
select * from select_userinfo where age between 22 and 33;

select * from select_userinfo where age=22 or age=33;
select * from select_userinfo where age in (22,33);

alter table select_userinfo modify age int;

desc select_userinfo;
insert into select_userinfo (name) values ('seven');

## null 값이 비워있다라는 상태 (is null, is not null, not in, not between)
select * from select_userinfo where age=null;	-- (X)
select * from select_userinfo where age!=null;	-- (X)

select * from select_userinfo where age is null;
select * from select_userinfo where age is not null;

select * from select_userinfo where age not between 22 and 33;
select * from select_userinfo where age not in (22,33);

-- 8. like 문자열검색 (like 'a%', '%a', '%a%', '_a%')
select * from select_userinfo where name = 'first';
select * from select_userinfo where name like 'f%';	-- f로 시작
select * from select_userinfo where name like '%t';	-- t로 끝남
select * from select_userinfo where name like '%i%';	-- i포함
select * from select_userinfo where name like '_e%';	-- 2번째글자e

-- 연습문제
create table emp  (
   empno    int   not null  auto_increment primary key,
    ename     varchar(20) not null ,
    job       varchar(20) ,
    mgr       int,
    hiredate  date,
   sal       int,
   comm      int,
   deptno      int
);
insert into emp  values (7369 , 'SMITH' , 'CLERK'    , 7902 , '1980-12-17' , 800 , null, 20);
insert into emp  values (7499 , 'ALLEN' , 'SALESMAN' , 7698 , '1981-02-20' , 1600 , 300, 30);
insert into emp values (  7521 , 'WARD' ,  'SALESMAN',     7698, '1981-02-22',       1250   ,     500 , 30);
insert into emp values (  7566 , 'JONES','MANAGER',         7839 ,'1981-04-02',              2975,    null,20);
insert into emp values (  7654 , 'MARTIN','SALESMAN',        7698 ,'1981-09-28',              1250,    1400,30);
insert into emp values (  7698  , 'BLAKE','MANAGER',         7839 ,'1981-05-01',              2850,    null,30);
insert into emp values (  7782  , 'CLARK','MANAGER',         7839 ,'1981-06-09',              2450,    null,10);
insert into emp values (  7788  , 'SCOTT','ANALYST',         7566 ,'1987-04-19',              3000,    null,20);
insert into emp values (  7839  , 'KING','PRESIDENT',       null ,'1981-11-17',              5000,    null,10);
insert into emp values (  7844  , 'TURNER','SALESMAN',        7698 ,'1981-09-08',              1500,       0, 30);
insert into emp values (  7876  , 'ADAMS','CLERK',           7788 ,'1987-05-23',              1100,    null, 20);
insert into emp values (  7900  , 'JAMES','CLERK',           7698 ,'1981-12-03',               950,    null, 30);
insert into emp values (  7902  , 'FORD','ANALYST',         7566 ,'1981-12-03',              3000,    null, 20);
insert into emp values (  7934  , 'MILLER','CLERK',           7782 ,'1982-01-23',              1300,    null, 10);
select * from emp;

create table select_emp select * from emp;
desc select_emp;

-- 1
select * from select_emp;

-- 2
select * from select_emp where deptno=30;

-- 3
select * from select_emp where deptno=30 and job='SALESMAN';

-- 4
select * from select_emp where deptno=30 or job='CLERK';

-- 5
select * from select_emp where sal*12=36000;

-- 6
select * from select_emp where sal>=3000;

-- 7
select * from select_emp where ename >= 'F';

-- 8
select * from select_emp where ename <= 'FORD'; 

-- 9
select * from select_emp where sal!=3000;

-- 10
select * from select_emp where sal <> 3000;

-- 11
select * from select_emp where not sal=3000;

-- 12
select * from select_emp where job='SALESMAN' or job='MANAGER' or job='CLERK';

-- 13
select * from select_emp where job in('SALESMAN','MANAGER','CLERK');

-- 14
select * from select_emp where job!='MANAGER' and (job!='SALESMAN' and job<>'CLERK');

-- 15
select * from select_emp where job not in ('MANAGER','SALESMAN','CLERK');

-- 16
select * from select_emp where sal>=2000 and sal<=3000;

-- 17
select * from select_emp where sal between 2000 and 3000;

-- 18
select * from select_emp where sal not between 2000 and 3000;

-- 19
select * from select_emp where not (sal>=2000 and sal<=3000);

-- 20
select * from select_emp where empno=7499 and deptno=30;

-- 21
select * from select_emp where deptno=20 or job='SALESMAN';

-- 22
select * from select_emp where sal>=2500 and job='ANALYST';

-- 23
select * from select_emp where deptno in(10,20);

-- 24
select * from select_emp where deptno not in(10,20);

-- 25
select * from select_emp where ename like 'S%';

-- 26
select * from select_emp where ename like '_L%';

-- 27
select * from select_emp where ename like '%AM%';

-- 28
select * from select_emp where ename not like '%AM%';

-- 29 숫자 + null 계산안됨.
select ename `ENAME`, sal `SAL`, sal*12+comm `ANNSAL`, comm `COMM` 
from select_emp 
where ename like '%AM%';

-- 30
select * from select_emp where comm = null; # X

-- 31
select * from select_emp where comm is null;

-- 32
select * from select_emp where mgr is not null;

-- 33 null값은 비교불가
select * from select_emp where sal > null;  -- null은 등가비교연산자 사용할 수 없음

-- 34 comm이 null인 값만 출력
select * from select_emp where sal > null or comm is null;

-- 35 
select * from select_emp where ename like '%S';

-- 36
select empno,ename,job,sal,deptno from select_emp 
where deptno=30 and job='SALESMAN';

-- 37
select empno,ename,job,sal,deptno from select_emp 
where deptno in (20,30) and sal>2000;

-- 38
select * from select_emp where  sal<2000 or sal>3000;

-- 39
select ename,empno,sal,deptno from select_emp 
where deptno=30 and ename like '%E%' and (sal>2000 or sal<1000);

-- 40
select * from select_emp 
where comm is null  and  mgr is not null  and  job in('MANAGER','CLERK') 
and  ename not like '_L%';












