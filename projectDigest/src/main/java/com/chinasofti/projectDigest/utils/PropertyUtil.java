package com.chinasofti.projectDigest.utils;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chinasofti.projectDigest.configure.ConfigBeanProp;

@Component
public class PropertyUtil {
	
	@Autowired
	private ConfigBeanProp  configBeanProp;
	private static ConfigBeanProp sConfigBeanProp;
	
	
	@PostConstruct
	public void init() {
		sConfigBeanProp = this.configBeanProp;
	}
	
		
	public static String getAdminUserid() {
		return sConfigBeanProp.getAdmin();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
