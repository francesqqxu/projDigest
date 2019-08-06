package com.chinasofti.projectDigest.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasofti.projectDigest.pojo.TMenu;
import com.chinasofti.projectDigest.service.MyBatisMenuService;
import com.chinasofti.projectDigest.utils.PropertyUtil;
import com.chinasofti.projectDigest.utils.TempUtil;
 
 



@Controller
@RequestMapping("/menu")
public class MenuController {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(MenuController.class);
	@Autowired
	private MyBatisMenuService menuService;
	
	@Autowired
	private PropertyUtil propertyUtil;
	
	@RequestMapping("get_menu")
	@ResponseBody
	public Object getMenus(ServletRequest request, Integer id) {
		
		LOGGER.info("/get_menu");
		HttpServletRequest httpReq = (HttpServletRequest)request;
		
		//TempUtil.getReqInfo(httpReq);
		if(null == id) {
			id = 0;
		}
		
		String userId = httpReq.getRemoteUser();
		String adminUserId = propertyUtil.getAdminUserid();
		Boolean isAdmin = false;
		
		if(id==0) {
			isAdmin = true;
		}
		if(userId.equals(adminUserId)) {
			isAdmin = true;
		}
		List<TMenu> menus = new ArrayList<TMenu>();
		
		menus = menuService.getMenuByPid(id, isAdmin);
		
		return menus;
		
	}
	
	

}
