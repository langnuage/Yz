package com.yz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yz.pojo.Hero;
import com.yz.service.HeroService;

@Controller
@RequestMapping("")
public class HeroListController 
{
	@Autowired
	private HeroService heroService;
		
	@RequestMapping("listHero")
	public ModelAndView listHero()
	{
		ModelAndView mav = new ModelAndView();
        List<Hero> cs= heroService.list();
         
        // 放入转发参数
        mav.addObject("cs", cs);
        // 放入jsp路径
        mav.setViewName("listHero");
        return mav;
	}

}
