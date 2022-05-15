package com.cg.spa.service;


import java.util.List;

import com.cg.spa.dao.StudentDao;
import com.cg.spa.model.Student;


public class StudentService {
  StudentDao dao = new StudentDao();
	
	
	public void addStudent(Student s) {
		dao.beginTransaction();
		dao.addStudent(s);
		dao.commitTransaction();
		
	}
	
	public void updateStudent(Student s) {
		dao.beginTransaction();
		dao.updateStudent(s);
		dao.commitTransaction();
		
	}
	
	public void deleteStudent(Student s) {
		dao.beginTransaction();
		dao.deleteStudent(s);
		dao.commitTransaction();
	}
	
	public Student findStudent(int id) {
		Student s = dao.findStudent(id);
		return s ;
	
	}
	public List<Student> listStudent(){
		List<Student> s1=dao.listStudent();
		return s1;
		
	}
	

}



