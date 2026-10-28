package Controller;

import java.io.IOException;

import Service.UpdateanddeleteService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Course;

@WebServlet("/deletecourse")
public class DeleteCourseController extends HttpServlet{
	Course course= new Course();
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		int studentid=Integer.valueOf(request.getParameter("studentid"));
		course.setStudentid(studentid);
		UpdateanddeleteService updateanddeleteService=new UpdateanddeleteService();
	String result	=updateanddeleteService.Deletecourselogic(course);
	if(result.equals("delete")) {
		response.sendRedirect("displayall");
	}else {
		request.setAttribute("dresult", result);
		request.getRequestDispatcher("/Deletecourse.jsp").forward(request, response);
	}
		
	}
	

}
