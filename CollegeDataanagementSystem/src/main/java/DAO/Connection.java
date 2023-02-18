package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import DTO.StudentData;

public class Connection {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	
	public List<StudentData> fetchAll() {
		return manager.createQuery("select x from StudentData x",StudentData.class).getResultList();

	}


	public void insert(StudentData insertStdData) {
		// TODO Auto-generated method stub
		transaction.begin();
		manager.persist(insertStdData);
		transaction.commit();
	}


	public StudentData find(int row_num) {
		// TODO Auto-generated method stub
		
		return manager.find(StudentData.class, row_num);
	}
	
}
