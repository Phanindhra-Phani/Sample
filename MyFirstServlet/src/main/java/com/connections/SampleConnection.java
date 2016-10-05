package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleConnection {

	public static void main(String args[]) throws ClassNotFoundException,
			SQLException {
		// step1 load the driver class
		Class.forName("com.mysql.jdbc.Driver");

		// step2 create the connection object
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://127.0.0.1:3306/SampleTest", "root", "password");
		try {

			// step3 create the statement object
			Statement stmt = con.createStatement();

			// step4 execute query
//			ResultSet rs = stmt.executeQuery("SELECT USERFIRSTNAME as u,USERLASTNAME as m FROM USERS");
			
			String sql = "UPDATE USERS SET AGE=25 WHERE USERID=11";
			
			int isInsert = stmt.executeUpdate(sql);
			
			if(isInsert == 1){
				System.out.println("Successfully Updated");
			}else{
				System.out.println("Not found records to update");
			}
			
//			int i = 1;
//			rs.next();
//			while (rs.next())
//				System.out.println( rs.getString("u")+ " "+rs.getString("m") );
			

			stmt.close();
			

		} catch (Exception e) {
			System.out.println(e);

		} finally {
			// step5 close the connection object
			con.close();
		}

	}

}
