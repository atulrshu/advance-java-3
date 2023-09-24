package com.caveofprogramming.db;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ProfileTest {
	
	@Test
	public void testLoadDbConfig() {
		var props = Profile.getProperties("db");
		
		assertNotNull("cannot load db properties",props);
		
		var dbname = props.getProperty("database");
		assertEquals("dbname incorrect", "peopletest",dbname);
	}
}
