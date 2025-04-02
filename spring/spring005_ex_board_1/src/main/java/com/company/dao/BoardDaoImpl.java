package com.company.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {
	@Autowired SqlSession sqlSession;
	private static final String namespace="com.company.dao.BoardDao";
	
//	@Override public int insert() {}
//	@Override public int update() {}
//	@Override public int delete() {}
//	@Override public UserDto selectOne() {}
//	@Override public List<UserDto> selectList(){return sqlSession.selectList(namespace+".selectAll");}
	@Override
	public int insert(BoardDto dto) {
		return sqlSession.insert(namespace+".insert", dto);
	}
	@Override
	public int update(BoardDto dto) {
		return sqlSession.update(namespace+".update", dto);
	}
	@Override
	public int delete(BoardDto bto) {
		return sqlSession.delete(namespace+".delete", bto);
	}
	public int updateHIt(int bno) {
		return sqlSession.update(namespace+".updateHit", bno);
	}
	@Override
	public BoardDto select(int bno) {
		return sqlSession.selectOne(namespace+".select", bno);
	}
	@Override
	public List<BoardDto> selectAll() {
		return sqlSession.selectList(namespace+".selectAll");
	}
}
