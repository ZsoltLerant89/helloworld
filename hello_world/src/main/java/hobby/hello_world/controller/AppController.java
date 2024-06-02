package hobby.hello_world.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

@GetMapping("/")
	
	public String welcome()
	{
		
		return "index.html";
	}
	
}
