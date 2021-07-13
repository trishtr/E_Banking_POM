package com.eBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig
{
	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configurations/config.properties");
		
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		} catch (IOException e) {
			System.out.println("Exception is " + e.getMessage());
			
		}
		
	}
	
	public String getApplicationUrl()
	{
		String url= pro.getProperty("baseURL");
		return url;
	}
	
	public String getUserName()
	{
		String username = pro.getProperty("username");
		return username;
	}
	
	public String getPassword()
	{
		String password = pro.getProperty("password");
		return password;
	}
	
	public String getChromePath()
	{
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getIEPath()
	{
		String iepath = pro.getProperty("iepath");
		return iepath;
	}
	public String getFireFoxPath()
	{
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}
}
