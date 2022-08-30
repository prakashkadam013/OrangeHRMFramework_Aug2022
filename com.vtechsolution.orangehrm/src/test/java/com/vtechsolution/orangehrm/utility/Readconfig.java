package com.vtechsolution.orangehrm.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	
	Properties pro;
	public Readconfig() {
		
		File src = new File("./ConfigData/config.properties");
		
		try {
			
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		} catch(Exception e) {
			
			System.out.println(e.getMessage());
		} 
	}
	
	public String geturl(){
		
		String url = pro.getProperty("Appurl");
		return url;
	}
	
	public String enterusername(){
	
		String username = pro.getProperty("username");
		return username;
	}

	public String enterpassword() {
		
		String password = pro.getProperty("password");
		return password;
	}
}
