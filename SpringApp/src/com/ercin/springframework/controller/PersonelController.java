package com.ercin.springframework.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ercin.springframework.entities.Personel;
import com.ercin.springframework.servis.PersonelServis;

@Controller
@RequestMapping("/personel")
public class PersonelController {
	
	@Autowired
	private PersonelServis servis;
	
	@GetMapping("/list")
	public String listPersonels(Model theModel) {
		List<Personel> personelList=servis.getStudents();
		theModel.addAttribute("personel", personelList);
		return "listPersonelPage";
	}

}
