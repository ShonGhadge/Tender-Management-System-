package org.jsponetoone_bi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsponetoone_bi.dto.Mobile;
import org.jsponetoone_bi.dto.Os;

public class Mobile_Os_Dao {
	
	public EntityManager getEntityManager() {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager=factory.createEntityManager();
	return manager;
}

public void saveMobile(Mobile mobile) {
	EntityManager manager=getEntityManager();
	EntityTransaction transaction=manager.getTransaction();
//	save
	transaction.begin();
	manager.persist(mobile);
	transaction.commit();
}

public void saveOs(Os os) {
	EntityManager manager=getEntityManager();
	EntityTransaction transaction=manager.getTransaction();
//	save
	transaction.begin();
	manager.persist(os);
	transaction.commit();
	
	
//perform update operation
}
}
	