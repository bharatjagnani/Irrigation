package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Person;

@Controller
public class PrsnCntrl {

@RequestMapping("/person")
public String person(Model model){
	Person p = new Person();
	p.setAge(22);
	p.setFstName("Bharat");
	p.setLstName("Jagnani");
	model.addAttribute("person",p);
	return "personview";

}
@ResponseBody
@RequestMapping("/")
String entry(){
	return "NewFile";

}
}
