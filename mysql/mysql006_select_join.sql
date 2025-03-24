use mbasic;
#Q1.
create table join_userban(
no int not null auto_increment primary key,
name varchar(20) not null,
ban char(2)
);
desc join_userban;

#Q2.
insert into join_userban (name, ban) values('first','A');
insert into join_userban (name, ban) values('second','B');
insert into join_userban (name, ban) values('third','A');
insert into join_userban (name, ban) values('fourth','C');
insert into join_userban (name, ban) values('fifth','B');
insert into join_userban (name, ban) values('sixth','C');
insert into join_userban (name, ban) values('fifth','B');
insert into join_userban (name, ban) values('sixth','C');
select * from join_userban;

#Q3.
update join_userban set ban='D' where no>=7;
select * from join_userban;

#Q4.
delete from join_userban where no>=7;
select * from join_userban;

#Q5.
select ban `반`, count(*) `학생수` from join_userban group by ban ;



# 데이터베이스언어 ★
# DDL - create, alter, drop
# DML - insert, select, update, delete
# DCL - grant, revoke

# e(entity:테이블) r(relation:관계) 속성:pk, fk
# join ★
-- 두개이상의 테이블들을 연결해서 데이터를 조회
-- 테이블간의 연결고리 (pk, fk)

# 종류 : inner join, outer join

create table join_userinfo(
no int not null default 0,
name varchar(100) not null,
age int(11) not null
);
desc join_userinfo;
insert into join_userinfo values(1,'first',11);
insert into join_userinfo values(2,'second',22);
insert into join_userinfo values(3,'third',33);
insert into join_userinfo values(4,'fourth',44);
select * from join_userinfo;
select * from join_userban;

/*
question1) join을 이용하여 join_userinfo
  학생의 번호, 이름, 나이, 반을 출력하시오.
+----+--------+-----+------+
| no | name   | age | ban  |
+----+--------+-----+------+
|  1 | first  |  11 | A    |
|  2 | second |  22 | B    |
|  3 | third  |  33 | A    |
|  4 | fourth |  44 | C    |
+----+--------+-----+------+
#>>> (1) = join
Error Code: 1052. Column 'no' in field list is ambiguous	0.000 sec
*/
select a.no, a.name, a.age, b.ban
from join_userinfo a, join_userban b
where a.no = b.no;

#>>> (2) join  on
select a.no, a.name, a.age, b.ban
from join_userinfo a join join_userban b on (a.no = b.no);

#>>> (3) join  using
select a.no, a.name, a.age, b.ban
from join_userinfo a join join_userban b using(no);

#>>> (4) natural join
select no, name, age, ban
from join_userinfo natural join join_userban;

/*
question2) inner join을 이용하여 join_userinfo
테이블의 20세 이상 40세 이하 학생의 번호, 이름, 나이, 반을 출력하시오.
*/
-- 1
select a.no, a.name, a.age, b.ban 
from join_userinfo a, join_userban b
where a.no=b.no and age between 20 and 40;

-- 2
select no, name, age, ban
from join_userinfo natural join join_userban
where age>=20 and age<=40;

-- 3
select a.no, a.name, a.age, b.ban
from join_userinfo a join join_userban b on(a.no=b.no)
where age>=20 and age<=40;

-- 4
select a.no, a.name, a.age, b.ban
from join_userinfo a join join_userban b using(no)
where age>=20 and age<=40;


#question3) outer join
## right join은 오른쪽값 보장
select a.no, a.name, b.ban, a.age
from join_userinfo a right join join_userban b on a.no = b.no;

## left join은 왼쪽 값 보장
select a.no, a.name, b.ban, a.age
from join_userban b left join join_userinfo a on a.no = b.no;

# right join
select b.no, b.name, b.ban, a.age
from join_userinfo a right join join_userban b on a.no=b.no;

#left join
select b.no, b.name, b.ban, a.age
from join_userban b left join join_userinfo a on a.no=b.no;

-- join 연결부위!
-- 1
select * from emp, dept 
order by empno;

-- 2
select * 
from emp, dept 
where emp.deptno=dept.deptno
order by empno;

-- 3
select * from emp E, dept D where E.deptno=D.deptno
order by empno;

-- 4
select empno, ename, deptno, dname, loc
from emp E, dept D
where E.deptno= D.deptno;
/*
Error Code: 1052. Column 'deptno' in field list is ambiguous	0.000 sec
*/
select empno, ename, e.deptno, dname, loc
from emp E, dept D
where E.deptno= D.deptno;

-- 5
select empno, ename, deptno, dname, loc
from emp natural join dept;

select empno, ename, d.deptno, dname, loc
from emp e join dept d on(e.deptno=d.deptno);

select empno, ename, d.deptno, dname, loc
from emp e join dept d using(deptno);

-- 6
select empno, ename, sal, d.deptno, dname, loc
from emp e join dept d 
where e.deptno=d.deptno and sal>=3000;

-- 7
select * from emp e, salgrade s
where e.sal between s.losal and s.hisal 
order by s.grade, e.sal;

-- 8
-- emp1 사원정보, emp2 매니저정보, salgrade 급여정보
-- 사원정보의 mgr = 매니저정보 empno, 사원정보의 최대, 최소값
-- 정렬 매니저정보의 사원번호기준으로 오름차순
-- #13줄
select e1.empno, e1.ename, e1.mgr, e2.empno `mgr_empno`, e2.ename `mgr_ename`
from emp e1, emp e2, salgrade s 
where e1.mgr = e2.empno and e1.sal between s.losal and s.hisal
order by e2.empno asc;

-- 9
-- left join은 right쪽의 테이블 값 보장
select e1.empno, e1.ename, e1.mgr, e2.empno `mgr_empno`, e2.ename `mgr_ename`
from emp e1 left join emp e2 on e1.mgr=e2.empno;

-- 10
-- right join은 right쪽의 테이블 값 보장
select e1.empno, e1.ename, e1.mgr, e2.empno `mgr_empno`, e2.ename `mgr_ename`
from emp e1 right join emp e2 on e1.mgr=e2.empno
order by e1.empno;

-- 11
select empno, ename, job, mgr, hiredate, sal, comm, deptno, dname, loc
from emp natural join dept order by deptno, empno;

-- 12
select empno, ename, job, mgr, hiredate, sal, comm, d.deptno, dname, loc 
from emp e join dept d using(deptno) 
where sal>=3000 order by deptno, empno;

-- 13
select empno, ename, job, mgr, hiredate, sal, comm, d.deptno, dname, loc
from emp e join dept d on(e.deptno=d.deptno)
where sal<=3000
order by deptno, empno;

-- 14
select d.deptno, dname, empno, ename, sal
from emp e, dept d where e.deptno=d.deptno and sal>2000;

-- 15
select deptno, dname, empno, ename, sal
from emp natural join dept 
where sal>2000;

-- 16
select d.deptno, d.dname
, avg(sal) `AVG_SAL`
, max(sal) `MAX_SAL`
, min(sal) `MIN_SAL`
, count(*) `CNT`
from emp e, dept d where e.deptno=d.deptno
group by deptno, dname
order by deptno, dname;

-- 17
select d.deptno, dname
, avg(sal)
, max(sal)
, min(sal)
, count(*)
from emp e join dept d using (deptno)
group by deptno, dname
order by deptno, dname;

-- 18
select d.deptno, dname, empno, ename, job, sal
from dept d left join emp e using(deptno)
order by deptno, ename;

-- 19
select d.deptno, dname, empno, ename, job, sal
from emp e right join dept d using(deptno)
order by deptno, ename;

-- 20
select d.deptno, dname
, e.empno , e.ename, e.mgr, e.sal, e.deptno
, s.losal, s.hisal, s.grade
, e2.empno `MGR_EMPNO`, e2.ename `MGR_ENAME` 
from emp e right join dept d 	 on(e.deptno=d.deptno) 
			left join salgrade s on (e.sal between s.losal and s.hisal)
			left join emp e2     on (e.mgr=e2.empno)
order by d.deptno, e.empno;











/*
question3) inner join을 이용하여 join_userinfo
테이블의 20세 이상 40세 이하 학생의 번호, 이름, 나이, 반을 출력하시오.
*/
















