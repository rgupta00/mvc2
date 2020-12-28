package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello {
	@RequestMapping("/")
	public ModelAndView hello(ModelAndView mv) {
		mv.setViewName("page");
		mv.addObject("data", "spring mvc hello world");
		return mv;
	}

}
