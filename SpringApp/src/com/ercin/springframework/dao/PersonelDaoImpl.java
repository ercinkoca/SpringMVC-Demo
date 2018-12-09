package com.ercin.springframework.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ercin.springframework.entities.Personel;

@Repository
public class PersonelDaoImpl implements PersonelDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public List<Personel> getStudents() {
		Session currentSession=session.getCurrentSession();
		Query<Personel> theQuery=currentSession.createQuery("from Personel",Personel.class);
		List<Personel> personelList=theQuery.getResultList();
		return personelList;
	}

}
