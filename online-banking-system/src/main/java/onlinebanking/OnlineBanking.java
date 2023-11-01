package onlinebanking;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/admin")
public class OnlineBanking extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String id=req.getParameter("id");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String name=req.getParameter("name");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Vicky2310@");
			PreparedStatement ps=con.prepareStatement("insert into admin (id,email,password,name) values (?,?,?,?)");
			ps.setInt(1,Integer.parseInt(id));
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, name);
			
			ps.execute();
			
			PrintWriter pw=res.getWriter();
			pw.println("<h1>data saved successfully</h1>");
			
			RequestDispatcher rd=req.getRequestDispatcher("Login.html");
		}
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
