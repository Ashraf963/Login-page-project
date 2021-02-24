package springexform;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller2 {
	@Autowired
	Sampledao dao;
@RequestMapping(path="/register")
public String sample(@RequestParam("name") String name,@RequestParam("email") String email, @RequestParam("pwd") String pwd, @RequestParam("gen") String gen,  Model m) {
	
	Sample s=new Sample();
	s.setName(name);
	s.setEmail(email);
	s.setPwd(pwd);
	s.setGen(gen);
	int i=dao.save(s);
	if(i>0) {
	return "second";}
	else
	{
		return "error";
	}
}
}