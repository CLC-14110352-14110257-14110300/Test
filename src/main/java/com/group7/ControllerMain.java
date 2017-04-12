package com.group7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping(value="/form")
public class ControllerMain {

	@Autowired
	ServiceTin tin;
	
	@RequestMapping(value="/")
	public String tin1(Model model){
		
		return "/WEB-INF/jsp/home.jsp";
	}
	@RequestMapping(value="/tin")
	public String tin(Model model){
		model.addAttribute("page", "tin");
		model.addAttribute("listtin", tin.lietKe());
		return "index";
	}
	
//  xu ly Sua hoat dong
	@RequestMapping(value="/xulysuatin/{id}")
	public String xuLySuaTin(Model model, @PathVariable String id){
		model.addAttribute("page", "suatin");
		model.addAttribute("listtin", tin.lietKe());
		model.addAttribute("tin", tin.findOne(Integer.parseInt(id)));
		
		return "index";
	}
	// Sua hoat dong
	@RequestMapping(value="/suatin")
	public String suaTin(Model model, @ModelAttribute ModelTin t){
		model.addAttribute("page", "tin");
		tin.sua(t);
		return "redirect:/form/tin";
	}
}
