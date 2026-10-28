package Controller;

import java.io.IOException;

import Service.CourseService;
import Service.UpdateanddeleteService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Course;

@WebServlet("/courseupdate")
public class CourseUpdateController extends HttpServlet{
	Course course= new Course();
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		
		int studentid= Integer.valueOf(request.getParameter("id"));
		String courseid=request.getParameter("courseid");
		String coursename=request.getParameter("coursename");
		String coursedays=request.getParameter("coursedays");
		String coursetime=request.getParameter("coursetime");
		String startdate=request.getParameter("startdate");
		String enddate=request.getParameter("enddate");
		course.setStudentid(studentid);
		course.setCourseid(courseid);
		course.setCoursename(coursename);
		course.setCoursetime(coursetime);
		course.setStartdate(startdate);
		course.setCoursedays(coursedays);
		course.setEnddate(enddate);
		UpdateanddeleteService updateanddeleteService= new UpdateanddeleteService();
	   String result	=updateanddeleteService.Updatecourselogic(course);
	   if(result.equals("update")) {
		   response.sendRedirect("displayall");
	   }
	   else {
		   request.setAttribute("result", result);
		   request.getRequestDispatcher("/CourseUpdate.jsp").forward(request, response);
	   }
		
	}

}
