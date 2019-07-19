package com.chinasofti.projectDigest.service;

import java.util.List;

import com.chinasofti.projectDigest.pojo.TLob;

public interface  MyBatisLobService {
	
	public List<TLob> getLob();
	
	public List<TLob> get_selectLob();

}
