package com.cg.spa.client;

import java.util.List;
import java.util.Scanner;

import com.cg.spa.model.Student;
import com.cg.spa.service.StudentService;

public class StudentMain {

	

	public static void main(String[] args) {
		StudentService service= new StudentService();
//		Student s1= new Student(1,"navya","sindhanur");
//		Student s2= new Student(2,"bhavya","bellary");
//		Student s3= new Student(3,"keerthi","davangere");
//		Student s4= new Student(4,"mounika","raichur");
//		service.addStudent(s1);
//		service.addStudent(s2);
//		service.addStudent(s3);
//		service.addStudent(s4);
//		System.out.println("Record added successfully");
		//Student  s = service.findStudent(2);
//		s.setStudentName("Bhargavi");
//		s.setStudentaddress("Dharwad");
		
//		service.updateProduct(s);
		
	   // service.findStudent(2);
	    
		//System.out.println("student removed successfully");
		
		
		int choice;
		do {
			System.out.println("Main-Menu");
			System.out.println("1.Add");
			System.out.println("2.List");
			System.out.println("3.Modify");
			System.out.println("4.Delete");
			System.out.println("5.Search student by name");
			System.out.println("6.search student by id");
			System.out.println("7.Exit");
			System.out.println("Enter your choice:");
			Scanner sc=new Scanner(System.in);
		   choice =sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Student id");
				int id=sc.nextInt();
				System.out.println("Enter Student name");
				String name=sc.next();
				System.out.println("Enter student address");
				String addrs=sc.next();
				 Student s=new Student(id,name,addrs);
				service.addStudent(s);
				System.out.println("Student  added successfully");
				break;
			
			case 2:
				List<Student> sList=service.listStudent();
				
				for(Student slist:sList)
				{
					System.out.println(slist.getStudentId()+" "+slist.getStudentName()+" "+slist.getStudentaddress());
				}
				break;
			
			case 3:
				System.out.println("Enter id of the student  that you want to modify");
				int mid=sc.nextInt();
				s=service.findStudent(mid);
				if(s==null)
					System.out.println("Student  does not exist");
				else {
					System.out.println("Enter Student name");
					String sname=sc.next();
					s.setStudentName(sname);
					service.updateStudent(s);
					System.out.println("student data  modified successfully");
				}
				break;
			
			case 4:
				System.out.println("Enter id of the Student that you want to delete");
				int sid=sc.nextInt();
				s=service.findStudent(sid);
				if(s==null)
					System.out.println("Student does not exist");
				else 
				service.deleteStudent(s);
				System.out.println("student  deleted successfully");
				
					break;
			case 6:
				System.out.println("enter id of student to be searched");
				sid=sc.nextInt();
				s=service.findStudent(sid);
				if(s==null)
					System.out.println("student does not exists");
				else
					System.out.println(s.getStudentName()+" " +s.getStudentaddress());
				break;
			case 7:
				System.exit(0);
			}
		}
		while(choice <7);
			
		
	
       	}
	}


