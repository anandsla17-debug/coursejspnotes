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

@WebServlet("/register")
public class AdminRegister extends HttpServlet{
	
	
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		
		String adminid=request.getParameter("adminid");
		String adminname=request.getParameter("adminname");
		String adminpassword=request.getParameter("adminpassword");
		String role=request.getParameter("role");
		Admin admins= new Admin(adminid, adminname, adminpassword, role);
		
		AdminService adminService= new AdminService();
		String result=adminService.Registerlogic(admins);
		
//		response.setContentType("text/html");
//	PrintWriter out	=response.getWriter();
//	out.println(result);
		
		if(result.equals("register successfully")) {
		response.sendRedirect("AdminLogin.jsp");
		}else {
			request.setAttribute("result", result);
			request.getRequestDispatcher("AdminRegister.jsp").forward(request, response);
		}
		
		
	}

}
