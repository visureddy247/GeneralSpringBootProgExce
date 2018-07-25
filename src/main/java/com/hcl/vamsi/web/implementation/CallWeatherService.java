package com.hcl.vamsi.web.implementation;
/**
 * 
 * @author Vamsi.Kallam
 * CallWeatherService implementation class will call the external API using API key
 * ex : api.openweathermap.org/data/2.5/weather?q=London&APPID=f90890cf6486c58aaad0c493f52d9cc7
 * we will get city value as input to the method and also Api key.
 */

import org.springframework.web.client.RestTemplate;

public class CallWeatherService {
	String uri = "http://api.openweathermap.org/data/2.5/weather?q=";	
	public String getWeatherInfo(String city){
		RestTemplate callApi = new RestTemplate();		
		return callApi.getForObject(uri+city+"&APPID=f90890cf6486c58aaad0c493f52d9cc7", String.class);		
	}
	
}
