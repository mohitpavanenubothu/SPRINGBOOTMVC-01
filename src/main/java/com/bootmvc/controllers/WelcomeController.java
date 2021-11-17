package com.bootmvc.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bootmvc.service.DemoTest;
import com.bootmvc.service.IWishMessageService;

@Controller
public class WelcomeController {

	@Autowired
	private IWishMessageService service;

	// Using ModelAndView-1
	/*@RequestMapping("/home")
	public ModelAndView displayWelcomeMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome to Boot MVC");
		mav.setViewName("index");
		return mav;
	}*/

	// Using ModelAndView-2
	/*@RequestMapping("/home")
	public ModelAndView homePage() {
		System.out.println("WelcomeController.homePage()");
		String result=service.generateMsg();
		//String result = "Welcome to SPRING BOOT MVC";
		return new ModelAndView("index", "msg", result);
	
	}*/
	
	//Using ModelMap-1 
	/*@RequestMapping("/home")
	public String welcomePage(ModelMap map) {
		System.out.println("Shared Memory obj class name"+map.getClass());
		String result=service.generateMsg();
		map.put("msg", result);
		return "index";
		
	}*/
	
	//Using ModelMap-2---Industry recommended
	@RequestMapping("/home")
	public String welcomePage(Map<String,Object> map) {
		
		DemoTest d=()->{
			return"Shared Memory obj class name using ModelMap Objec";
		};
		String hh = d.getMessage();
		System.out.println("Shared Memory obj class name using ModelMap Object"+map.getClass());
		String result=service.generateMsg();
		map.put("msg", hh);
		return "index";
		
	}
	
	//Using Model object
	/*@RequestMapping("/home")
	public String viewPage(Model model) {
		System.out.println("Shared memory obj class name using Model"+model.getClass());
		String result=service.generateMsg();
		model.addAttribute("msg",result);
		return "index";	
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	

}
