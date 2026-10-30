package AdminController;

import java.io.IOException;
import java.io.PrintWriter;

import Service.AdminService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Admin;

@WebServlet("/Login")
public class AdminLogin extends  HttpServlet{
	
	Admin admin= new Admin();
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		
		String adminid=request.getParameter("adminid");
		String password=request.getParameter("adminpassword");
		admin.setId(adminid);
		admin.setPassword(password);
		AdminService adminService= new AdminService();
		String result =adminService.Loginlogic(admin);
		String frontenddata=adminid+password;
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
		
		if(result.equals(frontenddata)) {
//			out.println("Login successfull");
			response.sendRedirect("displayall");
			
		}else if (result.equals("login failed")) {
//			out.println("Login failed");
			request.setAttribute("result", result);
			request.getRequestDispatcher("/AdminLogin.jsp").forward(request, response);
		}
		
		
	}

}
