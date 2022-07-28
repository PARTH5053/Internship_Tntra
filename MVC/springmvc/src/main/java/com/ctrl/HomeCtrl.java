package com.ctrl;

import java.util.List;

import javax.servlet.ServletContext;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Theinfo;

import org.springframework.ui.Model;

@Controller
public class HomeCtrl {

	@Autowired
	ServletContext context;

	@RequestMapping("/home")
	public String Home(Model m) {
		m.addAttribute("page", "home");
		return "home";

	}
	@RequestMapping("/view")
	public String View(@Valid Model m) {
		Theinfo d1 = new Theinfo();

		List<Theinfo> list = (List<Theinfo>) context.getAttribute("list");
		m.addAttribute("Theinfo", list);
		m.addAttribute("form", d1);
		return "Details_view";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("Theinfo") Theinfo d1, Model m) {

			System.out.println(d1);
			System.out.println("Value is received....");
			List<Theinfo> list = (List<Theinfo>) context.getAttribute("list");
			list.add(d1);
			m.addAttribute("Theinfo", list);
			m.addAttribute("form", d1);
			m.addAttribute("msg", "Successful...");
			System.out.println("Successful...");
			return "Details_view";
		
		
	}
}
