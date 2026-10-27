package model;

public class Course {
	private int studentid;
	private String courseid;
	private String coursename;
	private String coursedays;
	private String coursetime;
	private String startdate;
	private String enddate;
	private long phone;
	private double price;
	
	public Course(int studentid, String courseid, String coursename, String coursedays, String coursetime,
			String startdate, String enddate, long phone, double price) {
	
		this.studentid = studentid;
		this.courseid = courseid;
		this.coursename = coursename;
		this.coursedays = coursedays;
		this.coursetime = coursetime;
		this.startdate = startdate;
		this.enddate = enddate;
		this.phone = phone;
		this.price = price;
	}
	
	public Course() {
		
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getCoursedays() {
		return coursedays;
	}
	public void setCoursedays(String coursedays) {
		this.coursedays = coursedays;
	}
	public String getCoursetime() {
		return coursetime;
	}
	public void setCoursetime(String coursetime) {
		this.coursetime = coursetime;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
