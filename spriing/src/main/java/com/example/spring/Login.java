package com.example.spring;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class Login {
@RequestMapping("/login")
public String Login1(@RequestParam(name="username",required=true)String username,Model model,
		@RequestParam(name="password",required=true)String password,Model model1)
{
	model.addAttribute("username",username);
	model.addAttribute("password",password);
	if("edureka".equalsIgnoreCase(username) && "pass".equalsIgnoreCase(password))
		return "/login1";
	else
		return "login2";
}
}
