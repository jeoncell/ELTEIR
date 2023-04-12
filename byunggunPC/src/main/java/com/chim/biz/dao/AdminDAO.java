package com.chim.biz.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chim.biz.dto.AdminVO;

@Repository
public class AdminDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	
	public String adminCheck(String id) {
		
		return mybatis.selectOne("AdminMapper.adminCheck",id);
	}
	
	public AdminVO getAdmin(String id){
		
		return mybatis.selectOne("AdminMapper.getAdmin",id);
	} 
	
	public void insertadmin(AdminVO vo) {
		mybatis.insert("AdminMapper.insertAdmin",vo);
	}
}