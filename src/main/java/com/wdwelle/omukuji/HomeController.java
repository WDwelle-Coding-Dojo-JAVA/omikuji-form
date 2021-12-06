package com.wdwelle.omukuji;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public String submit(HttpSession session,
			@RequestParam(value="years") int years,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="job") String job,
			@RequestParam(value="creature") String creature,
			@RequestParam(value="say") String say
			) {
		session.setAttribute("years", years);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("job", job);
		session.setAttribute("creature", creature);
		session.setAttribute("say", say);
		return "redirect:/show";
	}
	@RequestMapping("/show")
	public String show(Model model) {
		return "show.jsp";
	}
}
