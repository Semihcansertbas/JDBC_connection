package JDBC.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_RUN {

	public static void main(String[] args) throws SQLException {
		
		
		System.out.println( "Hello World!" );

		// Connection String
		// 1-vendor name
		// 2-sub type
		// 3-host name
		// 4-port name
		// 5-SID / Service
		
		String url = "jdbc:oracle:thin:@ec2-18-218-208-4.us-east-2.compute.amazonaws.com:1521:xe";
		String user = "hr";
		String password = "hr";
		Connection conn = DriverManager.getConnection(url,user,password);
		
		Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = st.executeQuery("SELECT * FROM EMPLOYEES");
		
		    while (rs.next()) {		
			
			for (int i = 1; i < 12; i++) 
				System.out.print(rs.getObject(i) + " || ");
					
				System.out.println();
			
		    }
			
			
			
		//System.out.print("Connected");
		    
		    
		    
	}

}
