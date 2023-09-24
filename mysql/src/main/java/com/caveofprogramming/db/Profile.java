package com.caveofprogramming.db;

import java.util.Properties;

public class Profile {
	public static Properties getProperties(String name) {
	
		Properties props = new Properties();
		
		String env = System.getProperty("env");
		
		if (env == null) {
			env = "dev";
		}
		
		String propertiesFile = String.format("/config/%s.%s.properties",name,env);
		
		//System.out.println(propertiesFile);
		
		try {
			props.load(App.class.getResourceAsStream(propertiesFile));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			throw new RuntimeException("Cannot load properties file "+propertiesFile);
			
		}	

		return props;
		
	}
}
