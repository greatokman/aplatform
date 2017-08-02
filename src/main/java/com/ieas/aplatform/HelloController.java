package com.ieas.aplatform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	
	@RequestMapping("/Hello/Testing")
	@ResponseBody
	public String Test(){
		return "Testing";
	}
	
}
