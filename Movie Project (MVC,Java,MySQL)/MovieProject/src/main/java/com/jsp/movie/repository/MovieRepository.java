package com.jsp.movie.repository;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.movie.entity.Movie;

@Repository
public class MovieRepository
{


	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Ram");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	@Autowired
	private Movie movie;

	public String rInsert( int id,String mName,int cost)
	{
		movie.setmId(id);
		movie.setmName(mName);
		movie.setmCost(cost);
		
		et.begin();
		em.persist(movie);
		et.commit();
		
		
		return "Data Inserted Sucuusfully";
	}
	
	
	public String rUpdate(int id,String mName,int mPrice)
	{

		et.begin();
		Movie movie=em.find(Movie.class, id);
	
		if(movie==null)
			return "Movie Detilas Not Found";
		else
		{
			movie.setmName(mName);
			movie.setmCost(mPrice);
		}
		et.commit();
		return "Movie details Updated Succusfully";
	}

	public String rDelete(int id)
	{
		et.begin();
		Movie movie=em.find(Movie.class, id);
		if(movie==null)
			return "movie detilas not found";
		else
			em.remove(movie);
		et.commit();
		return "Movie Deleted Succusfully";
	}
	
	
	
	
	public List<Movie> rGet()
	{
		et.begin();
		Query query=em.createQuery("from Movie");
		List <Movie> mlist=query.getResultList();
		et.commit();
		return mlist;
	}

	
	
	












}
