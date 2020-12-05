package dao;

import java.sql.*;


public class DBConn {
	static Connection conn = null;
	public static Connection getConn () {
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mybank?useSSL=false&serverTimezone=UTC";
		String username = "root";
		String password = "tjm123456";
		
	try {
		Class.forName(driverClassName);
		conn = DriverManager.getConnection(url, username, password);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return conn;
	
	}
	

}

//public static ResultSet selectSql(String sql) {
//try {
//	PreparedStatement pstmt = con.prepareStatement(sql);
//	ResultSet rs = pstmt.executeQuery();
//} catch (SQLException e) {
//	System.out.println("sql鏁版嵁搴撴煡璇㈠紓甯�");  
//	e.printStackTrace();
//}
//return rs;
//}