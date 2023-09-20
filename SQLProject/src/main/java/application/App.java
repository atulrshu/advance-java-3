package application;

import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		int[] ids = {0,1,2};
		String[] names = {"Sue","Bob","Charley"}; 
		
		//Class.forName("org.sqlite.JDBC");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//String dbUrl = "jdbc:sqlite:people.db";
		//String dbUrl = "jdbc:mysql://localhost:3307/people?serverTimezone=UTC";
		String dbUrl = "jdbc:mysql://localhost:3307/people";
		var conn = DriverManager.getConnection(dbUrl,"root","root");
		
		var stmt = conn.createStatement();
		conn.setAutoCommit(false);
		
		//var sql = "create table if not exists user (id integer primary key, name text not null) ";
		//stmt.execute(sql);
		
		//sql = "insert into user (id, name) values (0, 'Bob') ";
		//stmt.execute(sql);
		
		//sql = "insert into user (id, name) values (1, 'Mary') ";
		//stmt.execute(sql);
		
		var sql = "insert into user (id, name) values (?, ?) ";
		var insertStmt = conn.prepareStatement(sql);
		
		for(int i=0; i < ids.length ; i++) {
			insertStmt.setInt(1, ids[i]);
			insertStmt.setString(2, names[i]);
			
			insertStmt.executeUpdate();
		}
		
		conn.commit();
		
		insertStmt.close();
		
		sql= "select id, name from user ";
		var rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			
			System.out.println(id + " : "+ name);
		}
		
		
		//sql = "drop table user";		
		//stmt.execute(sql);
		
		stmt.close();
		conn.close();
	}
}
