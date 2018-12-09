package com.ercin.springframework.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personel")
public class Personel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="per_name")
	private String perName;
	
	@Column(name="per_surname")
	private String perSurname;
	
	@Column(name="per_adres")
	private String perAdres;
	
	@Column(name="per_mail")
	private String perMail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}

	public String getPerSurname() {
		return perSurname;
	}

	public void setPerSurname(String perSurname) {
		this.perSurname = perSurname;
	}

	public String getPerAdres() {
		return perAdres;
	}

	public void setPerAdres(String perAdres) {
		this.perAdres = perAdres;
	}

	public String getPerMail() {
		return perMail;
	}

	public void setPerMail(String perMail) {
		this.perMail = perMail;
	}
	
}
