package jdbc_employee_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class AdminController
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
			System.out.println("welcome admin");
			System.out.println("1.add emp   2.view emp   3.view all emp");
			System.out.println("4.block emp   5.unblock emp   6.delete emp by id");
			System.out.println("7.update emp");
			
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
			{
				PreparedStatement ps1=con.prepareStatement("insert into employee(id,name,email,password,accountstatus) values (?,?,?,?,?)");
				System.out.println("enter id");
				int id=sc.nextInt();
				System.out.println("enter name");
				String name=sc.next();
				System.out.println("enter email");
				String email1=sc.next();
				System.out.println("enter password");
				String password1=sc.next();
				System.out.println("enter account status");
				boolean accountstatus=sc.nextBoolean();
				
				ps1.setInt(1, id);
				ps1.setString(2, name);
				ps1.setString(3, email1);
				ps1.setString(4, password1);
				ps1.setBoolean(5, accountstatus);
				
				ps1.execute();
				System.out.println("data saved successfully");
				break;
			}
			case 2:
			{
				PreparedStatement ps2=con.prepareStatement("select * from employee where id=?");
				System.out.println("enter id");
				int id=sc.nextInt();
				ps2.setInt(1, id);
				ResultSet rs1=ps2.executeQuery();
				if(rs1.next())
				{
					System.out.println(rs1.getInt(1));
					System.out.println(rs1.getString(2));
					System.out.println(rs1.getString(3));
					System.out.println(rs1.getString(4));
					System.out.println(rs1.getBoolean(5));
				}
				else
				{
					System.out.println("invalid id");
				}
				break;
			}
			case 3:
			{
				PreparedStatement ps3=con.prepareStatement("select * from employee");
				ResultSet rs2=ps3.executeQuery();
				while(rs2.next())
				{
					System.out.println(rs2.getInt(1));
					System.out.println(rs2.getString(2));
					System.out.println(rs2.getString(3));
					System.out.println(rs2.getString(4));
					System.out.println(rs2.getBoolean(5));
				}
				break;
			}
			case 4:
			{
				PreparedStatement ps4=con.prepareStatement("update employee set accountstatus=false where id=?");
				System.out.println("enter id");
				int id=sc.nextInt();
				ps4.setInt(1, id);
				
				int count=ps4.executeUpdate();
				if(count!=0)
				{
					System.out.println("updated successfully");
				}
				else
				{
					System.out.println("invalid input");
				}
				break;
			}
			case 5:
			{

				PreparedStatement ps5=con.prepareStatement("update employee set accountstatus=true where id=?");
				System.out.println("enter id");
				int id=sc.nextInt();
				ps5.setInt(1, id);
				
				int count=ps5.executeUpdate();
				if(count!=0)
				{
					System.out.println("updated successfully");
				}
				else
				{
					System.out.println("invalid input");
				}
				break;
			}
			case 6:
			{
				PreparedStatement ps6=con.prepareStatement("delete from employee where id=?");
				System.out.println("enter id");
				int id=sc.nextInt();
				ps6.setInt(1, id);
				
				int count=ps6.executeUpdate();
				if(count!=0)
				{
					System.out.println("data deleted successfully");
				}
				else
				{
					System.out.println("id not found");
				}
				break;
			}
			case 7:
			{
				PreparedStatement ps7=con.prepareStatement("update employee set name=? where id=?");
				System.out.println("enter name");
				String name=sc.next();
				System.out.println("enter id");
				int id=sc.nextInt();
				ps7.setString(1, name);
				ps7.setInt(2, id);
				
				int count=ps7.executeUpdate();
				if(count!=0)
				{
					System.out.println("data updated successfully");
				}
				else
				{
					System.out.println("id not found");
				}
				break;
			}
			
				
			default:
			{
				System.out.println("invalid input");
			}
		  }
			
		}
		else
		{
			System.out.println("invalid credentials");
		}
	}
}
