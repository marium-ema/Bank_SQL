package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static Connection conn=null;
	

	public Connection createConnection() {
		try {
			//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			  conn = DriverManager.getConnection("jdbc:sqlserver:// vNTDACLSCRAPR01:1433;"
						+ "databaseName= BankAccountMNG;user= bankaccountmng_dbo;password= bankaccountmng_dbo123;");
			
			
		} catch (Exception e) {
			//log.error("Connection error: " + e.getMessage());
			System.out.println("Exception: "+ e.getMessage());
		}
		
		return conn;
	}
	
	
	
}
