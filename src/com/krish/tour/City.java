package com.krish.tour;

public class City 
{

	private String CityName;
	private String CityState;
	private String CityCountry;
	private int Population;
	private int Area;
	private int CityFoundedYear;
	
	public City()
	{
		
		
	}
	public String getCityName() 
	{
		return CityName;
	}
	public void setCityName(String CityName) 
	{
		this.CityName = CityName;
	}
	public String getCityState() 
	{
		return CityState;
	}
	public void setCityState(String CityState) 
	{
		this.CityState = CityState;
	}
	public String getCityCountry() 
	{
		return CityCountry;
	}
	public void setCityCountry(String CityCountry) 
	{
		this.CityCountry = CityCountry;
	}
	public int getPopulation() 
	{
		return Population;
	}
	public void setPopulation(int Population) 
	{
		this.Population = Population;
	}
	public int getArea() 
	{
		return Area;
	}
	public void setArea(int Area)
	{
		this.Area = Area;
	}
	public int getCityFoundedYear() 
	{
		return CityFoundedYear;
	}
	public void setCityFoundedYear(int CityFoundedYear) 
	{
		this.CityFoundedYear = CityFoundedYear;
	}
	
	@Override
	public String toString() 
	{
		return "City [CityName=" + CityName + ", CityState=" + CityState + ", CityCountry=" + CityCountry
				+ ", Population=" + Population + ", Area=" + Area + ", CityFoundedYear=" + CityFoundedYear + "]";
	}
	
	public City(String CityName, String CityState, String CityCountry, int Population, int Area, int CityFoundedYear) 
	{
		this.CityName = CityName;
		this.CityState = CityState;
		this.CityCountry = CityCountry;
		this.Population = Population;
		this.Area = Area;
		this.CityFoundedYear = CityFoundedYear;
	}
}
