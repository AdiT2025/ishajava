import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/may16","root","P@55w0rd1");
		
		Statement st = con.createStatement();
		
		String s = "select * from tb1;";
		ResultSet rs = st.executeQuery(s);
		
		while (rs.next()) {
			int x = rs.getInt("id");
			String n = rs.getString("name");
			
			System.out.println(x + " " + n);
		}
		
		con.close();
		
		System.out.println("Query Executed ... ");
		
		
	}

}