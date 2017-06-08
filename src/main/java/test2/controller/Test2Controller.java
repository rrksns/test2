package test2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import test2.model.Test2;
import test2.service.Test2Service;

@Controller
public class Test2Controller {
	@Autowired
	private Test2Service ts;
	
	@RequestMapping("main")
		public String main (Model model){
		List<Test2> list = ts.list();
		model.addAttribute("list", list);
		
		return "main1";
	}

}
