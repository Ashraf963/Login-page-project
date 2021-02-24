package springexform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller1 {
@RequestMapping(path="/login")
public String sample(@RequestParam("email") String email, @RequestParam("pwd") String pwd, Model m) {
	String msg;
	
	if(email.equals(pwd)) {
		msg="hello "+email;
		m.addAttribute("msg",msg);
		return "first";
	}
	else {
		msg="invalid user name and pwd";
		m.addAttribute("msg",msg);
		return "error";
	}
}
}