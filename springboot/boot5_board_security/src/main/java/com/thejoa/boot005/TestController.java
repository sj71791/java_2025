package com.thejoa.boot005;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/test1")
	@ResponseBody public String test() {return "hello";}
	
	@GetMapping("/test")
	public String layout() { return "test"; }
	
}
