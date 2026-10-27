package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import Service.CourseService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Course;

@WebServlet("/addcourse")
public class CourseAddController extends HttpServlet {
	CourseService courseService=new CourseService();
	
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		 int studentid =Integer.valueOf(request.getParameter("id"));
	     String courseid=request.getParameter("courseid");
		 String coursename=request.getParameter("coursename");
		 String coursedays=request.getParameter("coursedays");
		 String coursetime=request.getParameter("coursetime");
		 String startdate=request.getParameter("startdate");
		 String enddate=request.getParameter("enddate");
		 long phone=Long.valueOf(request.getParameter("phone"));
		 double price=Double.valueOf(request.getParameter("price"));
		 Course course=new Course();
		 course.setStudentid(studentid);
		 course.setCourseid(courseid);
		 course.setCoursedays(coursedays);
		 course.setCoursename(coursename);
		 course.setCoursetime(coursetime);
		 course.setStartdate(startdate);
		 course.setEnddate(enddate);
		 course.setPhone(phone);
		 course.setPrice(price);
		String result= courseService.courseinsertlogic(course);
		 
//		System.out.println(result);
		 
//		 response.setContentType("text/html");
//		PrintWriter out =response.getWriter();
//		if(result.equals("course add successfully")) {
//		 out.println("course added successfully");
//		}else {
//			out.println("course not add");
//		}
		response.sendRedirect("displayall");
		
		
	}

}
