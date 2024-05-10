import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/may16","root","P@55w0rd1");
		
		Statement st = con.createStatement();
		
		String s = "delete from tb1 where id = 101;";
		
		st.execute(s);
		
		con.close();
		
		System.out.println("Query Executed");
		

	}

}
