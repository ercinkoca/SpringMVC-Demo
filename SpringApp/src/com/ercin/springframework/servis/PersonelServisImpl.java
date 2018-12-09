package com.ercin.springframework.servis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ercin.springframework.dao.PersonelDao;
import com.ercin.springframework.entities.Personel;

@Service
public class PersonelServisImpl implements PersonelServis {

	@Autowired
	private PersonelDao personelDao;
	
	@Override
	@Transactional
	public List<Personel> getStudents() {
		return personelDao.getStudents();
	}

}
