package com.jsp.movie.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.movie.entity.Movie;
import com.jsp.movie.service.MovieService;

@Controller
public class MovieController 
{
	@Autowired
	private MovieService  ms;

	@RequestMapping("/insert")
	public ModelAndView mInsert(HttpServletRequest re,HttpServletResponse res)
	{

		int id = Integer.parseInt(re.getParameter("MovieId"));
		String mName = (String)re.getParameter("MovieName");
		int cost=Integer.parseInt(re.getParameter("MovieCost"));
		
		String mname=ms.sInsert(id,mName,cost);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("i.jsp");
		mv.addObject("output",mname);
		return mv;


	}


	@RequestMapping("/update")
	public ModelAndView mUpdate(HttpServletRequest re,HttpServletResponse res)
	{
		int id = Integer.parseInt(re.getParameter("MovieId"));
		String mName = (String)re.getParameter("MovieName");
		int cost=Integer.parseInt(re.getParameter("MovieCost"));


		String out=ms.sUpdate(id, mName, cost);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("u.jsp");
		mv.addObject("output",out);
		return mv;

	}

	@RequestMapping("/delete")
	public ModelAndView mDelete(HttpServletRequest re,HttpServletResponse res)
	{
		int id = Integer.parseInt(re.getParameter("MovieId"));

		String out=ms.sDelete(id);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("d.jsp");
		mv.addObject("output",out);
		return mv;
	}


	@RequestMapping("/get")
	public ModelAndView mGet(HttpServletResponse res)
	{

		List<Movie> list=ms.sGet();

		ModelAndView mv = new ModelAndView();
		mv.setViewName("g.jsp");
		mv.addObject("output",list);

		return mv;

	}


}
