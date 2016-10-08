package hz.simplejee.springframework.mvc.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hz.simplejee.springframework.mvc.hello.controller.vo.UserVo;

@RequestMapping("/user")
@Controller
public class UserController {

	@RequestMapping(value="create", params="page", method=RequestMethod.GET)
	public String createPage() {
		return "user/create";
	}
	
	@RequestMapping(value="create" ,method=RequestMethod.POST)
	public String create(UserVo u) {
		System.out.println(u);
		return "user/success";
	}
	
	@RequestMapping(value = "{username}", method=RequestMethod.GET)
	public String show(@PathVariable("username")String username, Model model) {
		return "user/show";
	}
}
