package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlConnect {

	public Connection conn;
	public static MySqlConnect db;

    private Statement statement;
	
	private MySqlConnect(){
		String url= "jdbc:mysql://127.0.0.1:3306/";
        String dbName = "SampleTest";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "password";
        try {
            Class.forName(driver).newInstance();
            this.conn = (Connection)DriverManager.getConnection(url+dbName,userName,password);
        }
        catch (Exception sqle) {
            sqle.printStackTrace();
        }
	}
	
	public static synchronized MySqlConnect getDbCon() {
        if ( db == null ) {
            db = new MySqlConnect();
        }
        return db;
    }
	
	public ResultSet getUser() throws SQLException{
        statement = db.conn.createStatement();
        ResultSet res = statement.executeQuery("SELECT USERFIRSTNAME FROM USERS");
        return res;
    }
	
	public static void main(String[] args) throws SQLException {
		MySqlConnect sq = new MySqlConnect();
		sq.getUser();
	}
	
}
