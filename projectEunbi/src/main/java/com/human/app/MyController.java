package com.human.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping(value="/contactus", method=RequestMethod.GET)
	public String exam(Model model) {
		model.addAttribute("mobile", "010-8075-3708");
		return "contactus";
	}
	
//	@RequestMapping("/contactus")
//	public ModelAndView method2() {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("mobile","01080753708");
//		mav.setViewName("contactus");
//		return mav;
//	}
}
