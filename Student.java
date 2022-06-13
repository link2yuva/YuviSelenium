package org.student;

import org.department.Dept;

public class Student extends Dept{
	
	public void studentName()
	{
		System.out.println("Sharvesh");
	}
	
	public void studentDept()
	{
		System.out.println("Computer Application");
	}
	public void studentId()
	{
		System.out.println("0703");
	}

	public static void main(String[] args) {
		Student stu = new Student();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		stu.collegeName();
		stu.collegeRank();
		stu.collegeCode();
		stu.deptName();

	}

}
