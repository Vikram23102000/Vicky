package onlinebanking;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/addcustomer")
public class CreateAccountByCustomer extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String pincode=req.getParameter("pincode");
		
		Random random=new Random();
		long accountnumber=random.nextLong(1000000000);
		double balance=500;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Vicky2310@");
			PreparedStatement ps=con.prepareStatement("insert into customer(id,name,accountnumber,pincode,balance) values (?,?,?,?,?) ");
			ps.setInt(1, Integer.parseInt(id));
			ps.setString(2, name);
			ps.setLong(3, accountnumber);
			ps.setInt(4, Integer.parseInt(pincode));
			ps.setDouble(5, balance);
			
			ps.execute();
			
			PrintWriter pw=resp.getWriter();
			pw.println("<h1>account created successfully</h1>");
			
			//RequestDispatcher rd=req.getRequestDispatcher("customerhome.html");
			//rd.include(req, resp);
			
		}
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
