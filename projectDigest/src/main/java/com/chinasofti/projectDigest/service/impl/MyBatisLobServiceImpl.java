package com.chinasofti.projectDigest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.projectDigest.dao.TLobMapper;
import com.chinasofti.projectDigest.dto.Lob;
import com.chinasofti.projectDigest.pojo.TIndustry;
import com.chinasofti.projectDigest.pojo.TIndustryExample;
import com.chinasofti.projectDigest.pojo.TLob;
import com.chinasofti.projectDigest.pojo.TLobExample;
import com.chinasofti.projectDigest.service.MyBatisLobService;

@Service
public class MyBatisLobServiceImpl implements MyBatisLobService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(MyBatisLobServiceImpl.class);
	
	@Autowired
	TLobMapper tLobMapper;
	
	public List<TLob> getLob(){
		
		TLobExample example = new TLobExample();
		example.setOrderByClause("id asc");
		return tLobMapper.selectByExample(example);
		
	}
	
	public List<TLob> get_selectLob() {
		
		TLobExample example = new TLobExample();
		example.setOrderByClause("id asc");
		List<TLob> lobs =  tLobMapper.selectByExample(example);
		
		 
		TLob l = new TLob();
		l.setId(0);
		l.setLob("--请选择--");
		lobs.add(l);
		 
		return lobs;
	}
	

}
