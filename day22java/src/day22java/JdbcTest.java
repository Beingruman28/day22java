package day22java;

import java.sql.*; // Step 1 import 

public class JdbcTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");// step 2  class loader 
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "root");//step 3 create connection
		
		Statement st = con.createStatement();// step 4
	//	String query = "create table student(ID int primary key,SName varchar(20), SMarks int)";//step 6
		String query1 = "insert into student values(1,'Ruman')";
		//st.executeUpdate(query);//steps 7
		System.out.println("Student Table created successfully");
		//st.executeUpdate(query1);
		System.out.println("Row inserted successfully");
		st.executeUpdate(query1);
		
	st.close();
	con.close();
	}

}