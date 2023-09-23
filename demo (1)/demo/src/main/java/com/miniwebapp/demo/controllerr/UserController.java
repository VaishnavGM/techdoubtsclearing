package com.miniwebapp.demo.controllerr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.miniwebapp.demo.Rices.Rices;
import com.miniwebapp.demo.dao.Userdao;

@Controller
public class UserController {
	@Autowired
	Userdao dao;

	@RequestMapping("adduser")
	public String adduser(Rices rice) {
	dao.save(rice);
		return "index.jsp";
	}
	@RequestMapping("/showuser")
	public ModelAndView showuser(@RequestParam int id)
	{
		ModelAndView mv = new ModelAndView("getuser.jsp");
Rices a= dao.findById(id).orElse(null);
mv.addObject(a);
return mv;
	}
	
}
