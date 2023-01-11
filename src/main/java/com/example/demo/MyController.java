package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@Autowired
	MyRepository repo;
	

	@RequestMapping("/h")
	public String homepage()
	{
		return "homepage.jsp";
	}
	
		
	@RequestMapping("/home")
	public String getData(Emp emp)
	{
		repo.save(emp);
		return "homepage.jsp";
	}
	
	
//	@RequestMapping("/search")
//	public ModelAndView showbysearch(@RequestParam("id") Integer Id)
//	{
//		
//	     Emp emp=repo.findById(Id).orElse(null);
//	     System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSal());
//		return new ModelAndView("show.jsp","emp",emp);
//	}
	
	@RequestMapping("/search1")
	public ModelAndView showbysearch1(@RequestParam("name")String name)
	{
		Emp emp=repo.findByName(name);
		return new ModelAndView("show.jsp","emp",emp);
	}
	
	@RequestMapping("/search")
	public ModelAndView showbysearch(@RequestParam("id") Integer Id)
	{
		
	     Emp emp=repo.findById(Id).orElse(null);
	     
	     List<Emp> al= repo.findEmpBySalGt(20000);
	     for(Emp e:al)
	     {
	    	 System.out.println(e);
	     }
		return new ModelAndView("show.jsp","emp",emp);
	}
}
