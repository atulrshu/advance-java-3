package com.caveofprogramming.db;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		
		var db = Database.instance();
		
		try {
			db.connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Cannot connect to database.");
		}
		
		System.out.println("Connected");
		
		try {
			db.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Cannot close database connection.");
		}
		
	}
}
