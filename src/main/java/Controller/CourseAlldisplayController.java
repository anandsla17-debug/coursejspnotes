package Controller;

import java.io.IOException;
import java.util.ArrayList;

import Service.CourseService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Course;

@WebServlet("/displayall")
public class CourseAlldisplayController extends HttpServlet{
	CourseService courseService= new CourseService();
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Course>  result=courseService.displayalllogic();
		   request.setAttribute("courseview",result);// set => display data
		   request.getRequestDispatcher("/Courseview.jsp").forward(request, response);
		
	}
	

}
