package interviewprogram;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class Main {
 
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://10.71.7d2.39:1433;database=FingedrPrint;integratedSecurity=true");
		System.out.println("test");
		Statement sta = conn.createStatement();
		String Sql = " select top 10 strProdName FROM [FingerPrint].[dbo].[tblMastProd]";
		ResultSet rs = sta.executeQuery(Sql);
		while (rs.next()) {
			System.out.println(rs.getString("strProdName"));
		}
	}
}