package org.employee.controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Manuh")
public class LoginPage {

	Logger log = Logger.getLogger(LoginPage.class.getName());

	@GetMapping("/")
	private String login() {
		return "login";
	}

	@PostMapping("/LoginPage")
	private String index(@RequestParam String Username, @RequestParam String Password, ModelMap model,
			HttpSession session) {

		log.info(String.format("Username:%s,Password:%s", Username, Password));
		if (Username.equals("monika@gmail.com") && Password.equals("monika")) {
			session.setAttribute("Username", Username);
			model.addAttribute("Username", Username);
			return "index";
		} else {
			model.put("error", "Invalid username and password");
			return "login";
		}
	}

	@GetMapping("/Logout")
	private String logout(Model model) {
		model.addAttribute("error", "Successfully loggedout");
		return "login";

	}

	@GetMapping("index")
	public String index() {
		return "index";

	}

}
