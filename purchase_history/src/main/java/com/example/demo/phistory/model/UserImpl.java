import java.util.List;
 
import javax.persistence.EntityManager;
import javax.persistence.Query;
 
import org.springframework.stereotype.Repository;
 
@Repository
public class UserImpl implements {
	private static final long serialVersionUID = 1L;
	
	private EntityManager entityManager;
    
}

Shell
package com.transonic.springboot;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class MyDataDaoImpl implements MyDataDao {
	private static final long serialVersionUID = 1L;
	
	private EntityManager entityManager;
	
	public MyDataDaoImpl() {
		super();
	}
	
	public MyDataDaoImpl(EntityManager manager) {
		this();
		entityManager = manager;
	}
	
	@Override
	public List getAll() {
		Query query = entityManager.createQuery("from MyData");
		@SuppressWarnings("unchecked")
		List list = query.getResultList();
		entityManager.close();
		// TODO Auto-generated method stub
		return list;
	}
}package com.transonic.springboot;
 
public class MyDataDaoImpl implements MyDataDao {
	private static final long serialVersionUID = 1L;
	
	private EntityManager entityManager;
	
	public MyDataDaoImpl() {
		super();
	}
	
	public MyDataDaoImpl(EntityManager manager) {
		this();
		entityManager = manager;
	}
	
	@Override
	public List getAll() {
		Query query = entityManager.createQuery("from MyData");
		@SuppressWarnings("unchecked")
		List list = query.getResultList();
		entityManager.close();
		// TODO Auto-generated method stub
		return list;
	}
}