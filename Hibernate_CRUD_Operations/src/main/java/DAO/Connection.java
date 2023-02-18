package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import DTO.StudentData;

public class Connection {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("CRUD");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	public StudentData find(int roll_num) {
		// TODO Auto-generated method stub
		return manager.find(StudentData.class, roll_num);
	}
	public void insert(StudentData newStudent) {
		transaction.begin();
		manager.persist(newStudent);
		transaction.commit();
	}
	public void pay(StudentData fetchstudentData) {
		// TODO Auto-generated method stub
		transaction.begin();
		manager.merge(fetchstudentData);
		transaction.commit();
	}
	public void deleteStudentData(StudentData deleteStudentData) {
		// TODO Auto-generated method stub
		transaction.begin();
		manager.remove(deleteStudentData);
		transaction.commit();
	}
	public void update(StudentData updatestudentData) {
		// TODO Auto-generated method stub
		transaction.begin();
		manager.merge(updatestudentData);
		transaction.commit();
	}
	
}
