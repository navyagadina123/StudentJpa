package com.cg.spa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.spa.model.Student;
import com.cg.spa.util.JpaUtil;



public class StudentDao {
	EntityManager ema;
	
	JpaUtil util = new JpaUtil();
	
	public StudentDao() {
		ema= util.getEntityManager();

	}
	
	public void addStudent(Student s) {
		ema.persist(s);
		
	}
	
	public void updateStudent(Student s) {
		ema.merge(s);
	}
	
	public void deleteStudent(Student s) {
		ema.remove(s);
	}
	
	public Student findStudent(int id) {
		Student s = ema.find(Student.class, id);   
		return s;
	}
	
	
	public void beginTransaction() {
		ema.getTransaction().begin();
		
	}
	
	public void commitTransaction() {
		ema.getTransaction().commit();
		
	}
	public List<Student> listStudent(){
		TypedQuery<Student> tq=ema.createQuery("select s from Student s ",Student.class);
		List<Student>  slist=tq.getResultList();
		return slist;
		
	}
}



