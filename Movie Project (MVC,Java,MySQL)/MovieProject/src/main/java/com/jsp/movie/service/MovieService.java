package com.jsp.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.movie.entity.Movie;
import com.jsp.movie.repository.MovieRepository;

@Service
public class MovieService 
{
	@Autowired
	private MovieRepository mr;

	
	
	public String sInsert(int id,String mName,int cost)
	{
		return mr.rInsert(id,mName,cost );
	}

	
	
	
	
	public String sUpdate(int id,String mName,int cost)
	{
		return mr.rUpdate(id,mName,cost );
	}

	

	public String sDelete(int id)
	{
		return mr.rDelete(id);
	}
	
	
	
	public List<Movie> sGet()
	{
		return mr.rGet();
	}
	
	
	
	
	
	
}
