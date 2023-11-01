package jdbc_employee_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LogInValidation 
{
	public static void main(String[] args) throws SQLException
	{
		Scanner sc= new Scanner(System.in); 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management","root","Vicky2310@");
		PreparedStatement ps=con.prepareStatement("select * from  admin where email=? and password=?");
		
		System.out.println("enter email");
		String email=sc.next();
		System.out.println("enter password");
		String password=sc.next();
		
		ps.setString(1, email);
		ps.setString(2, password);
		
		ResultSet rs= ps.executeQuery();
		if(rs.next())
		{
			System.out.println("welcome");
		}
		else
		{
			System.out.println("invalid credentials");
		}
	}
}
