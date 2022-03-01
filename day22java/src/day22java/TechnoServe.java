package day22java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TechnoServe {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TechnoServe","root", "root");
		
		Statement st = con.createStatement();
		//String query = "create table candidates (UNIQUEID int primary key,Name varchar(20), EMAIL varchar(50))";
		//st.executeUpdate(query);
		//System.out.println("candidates Table created successfully");
		
		//String query1 = "insert into candidates values(1,'Ruman','mohammedruman1996@gmail.com')";
		//st.executeUpdate(query1);
	    //System.out.println("candidates Table created successfully");
		
		//Inserting multirows.
		//String query2 = "insert into candidates values(11,'Ruman','mohammedruman1996@gmail.com'),(2,'abc','abc@gmail.com'),(3,'def','def@gmail.com'),(4,'ghi','ghi@gmail.com'),(5,'jkl','jkl@gmail.com'),(6,'mno','mno@gmail.com'),(7,'pqr','pqr@gmail.com'),(8,'stu','stu@gmail.com'),(9,'vwx','vwx@gmail.com'),(10,'yz','yz@gmail.com')";
		//st.executeUpdate(query2);
		//System.out.println("candidates values inserted successfully");
		
		//copy of a table
		//String query3 = "create table candidates1 as Select * from candidates"; //(11,'Ruman','mohammedruman1996@gmail.com'),(2,'abc','abc@gmail.com'),(3,'def','def@gmail.com'),(4,'ghi','ghi@gmail.com'),(5,'jkl','jkl@gmail.com'),(6,'mno','mno@gmail.com'),(7,'pqr','pqr@gmail.com'),(8,'stu','stu@gmail.com'),(9,'vwx','vwx@gmail.com'),(10,'yz','yz@gmail.com')"
		//st.executeUpdate(query3);
		//System.out.println("candidates values inserted successfully");
		
		//updating a single row
		//String query4 = "update candidates set Name = 'zyx' where Name = 'Ruman' and UNIQUEID = 11";
		//st.executeUpdate(query4);
		//System.out.println("candidates values inserted successfully");
		
		//String query5 = "update candidates set EMAIL = 'zyx@gmail.com' where  UNIQUEID = 11";
		//st.executeUpdate(query5);
		//System.out.println("candidates values inserted successfully");
		
		//deleting rows
		//String query6 = "delete from candidates where UNIQUEID = 11";
		//st.executeUpdate(query6);
		//System.out.println("candidates values deleted successfully");
		
		//deleting columns
		String query7 = "alter table candidates drop column email";
		st.executeUpdate(query7);
		System.out.println("candidates column deleted successfully");
		
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
		//String query13 = "truncate student";
		//st.executeUpdate(query);//steps 7
		/*st.executeUpdate(query6);//steps 7
		st.executeUpdate(query7);//steps 7
		st.executeUpdate(query8);//steps 7
		st.executeUpdate(query9);//steps 7
		st.executeUpdate(query10);//steps 7*/
		//st.executeUpdate(query13);//steps 7
		//System.out.println("Student Table created successfully");
		//st.executeUpdate(query1);
		//System.out.println("Row inserted successfully");
		//st.executeUpdate(query1);
		
	st.close();
	con.close();
	}

}