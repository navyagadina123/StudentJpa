package com.cg.spa.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	public static EntityManagerFactory emfy;
	public static EntityManager ema;
	public JpaUtil() {
		emfy= Persistence.createEntityManagerFactory("JPA-PU");
		ema=emfy.createEntityManager();
	}
	
	public static EntityManager getEntityManager() {
		return ema;
	}

	
	

}
