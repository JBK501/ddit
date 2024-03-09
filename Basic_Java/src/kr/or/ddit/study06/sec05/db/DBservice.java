package kr.or.ddit.study06.sec05.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBservice {
	
	Connection 	conn = null;
	Statement 	stmt = null;
	ResultSet 	rs 	 = null;
	
	public static void main(String[] args) {
		DBservice dbs = new DBservice();
		dbs.selectAll();
	}
	
	
	public void selectAll() {
		
		try {
			conn = DBConn.getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT MEM_ID, MEM_PASS, MEM_NAME \r\n" + 
					"FROM MEMBER";
			
			
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String mid = rs.getString("MEM_ID");
				String mps = rs.getString("MEM_PASS");
				String mnm = rs.getString("MEM_NAME");
				
				System.out.println(mid+"\t"+mps+"\t"+mnm);
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
