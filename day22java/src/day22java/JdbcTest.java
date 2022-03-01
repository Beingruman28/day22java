package day22java;

import java.sql.*; // Step 1 import 

public class JdbcTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");// step 2  class loader 
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/connection","root", "root");//step 3 create connection
		
		Statement st = con.createStatement();// step 4
		//String query = "create table student(ID int primary key,SName varchar(20), SMarks int)";//step 6
		//String query1 = "insert into student values(1,'Ruman',20)";
		//String query2 = "insert into student values(2,'virat',30)";
		//String query3 = "insert into student values(3,'rohit',40)";
		//String query4 = "delete from student where ID =2";
		//String query5 = "update student SET SNAME = 'VIRAT'  where ID =1";
		//String query6 = "insert into student values(4,'rishab',50)";
		//String query7 = "insert into student values(5,'shreyas',60)";
		//String query8 = "insert into student values(6,'surya',60)";
		//String query9 = "insert into student values(7,'bhumrah',80)";
		//String query10 = "insert into student values(8,'shami',80)";
		//String query11 = "create TABLE studentnew AS select * from student";
		//String query12 = "truncate studentnew";
		String query13 = "truncate student";
		//st.executeUpdate(query);//steps 7
		/*st.executeUpdate(query6);//steps 7
		st.executeUpdate(query7);//steps 7
		st.executeUpdate(query8);//steps 7
		st.executeUpdate(query9);//steps 7
		st.executeUpdate(query10);//steps 7*/
		st.executeUpdate(query13);//steps 7
		//System.out.println("Student Table created successfully");
		//st.executeUpdate(query1);
		System.out.println("Row inserted successfully");
		//st.executeUpdate(query1);
		
	st.close();
	con.close();
	}

}