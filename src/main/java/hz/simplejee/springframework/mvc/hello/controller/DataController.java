package hz.simplejee.springframework.mvc.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/data")
public class DataController {

	@RequestMapping
	public String index() {
		return "data/index";
	}
	
}
