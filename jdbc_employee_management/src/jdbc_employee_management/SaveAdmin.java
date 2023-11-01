package jdbc_employee_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SaveAdmin 
{
	public static void main(String[] args) throws SQLException 
	{
		Scanner sc=new Scanner(System.in);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management","root","Vicky2310@");
		PreparedStatement ps=con.prepareStatement("insert into Admin(id,name,email,password) values (?,?,?,?)");
		
		System.out.println("enter the id");
		int id=sc.nextInt();
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the email");
		String email=sc.next();
		System.out.println("enter the password");
		String password=sc.next();
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4, password);
		
		ps.execute();
		System.err.println("data saved");
	}
}
