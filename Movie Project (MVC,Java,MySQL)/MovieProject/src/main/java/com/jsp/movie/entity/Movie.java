package com.jsp.movie.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Movie 
{
	@Id
	private int mId;
	private String mName;
	private int mCost;
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public int getmCost() {
		return mCost;
	}
	public void setmCost(int mCost) {
		this.mCost = mCost;
	}
	@Override
	public String toString() {
		return "Movie [mId=" + mId + ", mName=" + mName + ", mCost=" + mCost + "]";
	}





}
