package com.krish.tour;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CityController 
{
	
	@RequestMapping(value = "/viewcity", method = RequestMethod.GET)
	public ModelAndView allCity()
	{
		City ctone = new City();
		return new ModelAndView("viewcity","ctone", ctone);
	}

	@RequestMapping(value = "/addcity", method = RequestMethod.POST)
	public String addCity(City cty, Model model)
	{
		model.addAttribute("CityName", cty.getCityName());
		model.addAttribute("CityState", cty.getCityState());
		model.addAttribute("CityCountry", cty.getCityCountry());
		model.addAttribute("Population", cty.getPopulation());
		model.addAttribute("Area", cty.getArea());
		model.addAttribute("CityFoundedYear", cty.getCityFoundedYear());
		
		return "includedcity";
		
	}
}
