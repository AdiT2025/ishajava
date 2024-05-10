package jdbc;

import java.sql.*;

public class JDBCdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String JDBCURL = "jdbc:mysql://localhost:3306/mydb";
		String uname = "root";
		String password = "isha9096";
		
		try {
			Connection con= DriverManager.getConnection(JDBCURL, uname, password);
			
			Statement st = con.createStatement();
			
			String createtablesql = "CREATE TABLE ppl_info( id  INT, name  VARCHAR(20))";
			st.executeUpdate(createtablesql);
			System.out.println("Table created successfully");
			
			String insertvaluesql = "INSERT INTO student_info(id, name) VALUES ('1', 'Isha'), ('2', 'Karan'), ('3', 'Aditi')";
			int roowaltered = st.executeUpdate(insertvaluesql);
			System.out.println(roowaltered + " row(s) inserted");
			
			String retrievedatasql = "SELECT * FROM student_info";
			ResultSet rs = st.executeQuery(retrievedatasql);
			while(rs.next()) {
				int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
