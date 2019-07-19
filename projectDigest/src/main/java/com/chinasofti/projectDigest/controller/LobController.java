package com.chinasofti.projectDigest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasofti.projectDigest.service.MyBatisLobService;

@Controller
@RequestMapping("/lob")
public class LobController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LobController.class);
	
	@Autowired
	MyBatisLobService myBatisLobService;
	
	@RequestMapping("/get_lob")
	@ResponseBody
	public Object get_lob() {
		
		return myBatisLobService.getLob();
	}
	
	@RequestMapping("get_selectLob")
	@ResponseBody
    public Object get_selectLob() {
    	return myBatisLobService.get_selectLob();
    }

}
