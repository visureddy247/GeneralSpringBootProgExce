package com.hcl.vamsi.web.controller;


import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.vamsi.web.implementation.CallWeatherService;

@RestController
public class WeatherUpdate {
	/**
	 * This method is exposed as WeatherUpdate API, internally it is going to consume API's available in Opensource provider.
	 * api.openweathermap.org/data/2.5/weather?q=London&APPID=f90890cf6486c58aaad0c493f52d9cc7
	 */
	@RequestMapping("/getWeatherUpdate")	
	public String getWeatherUpdate(@RequestParam("city") String city){
		//AnnotationConfigApplicationContext context =
			    //new AnnotationConfigApplicationContext("com.acme.app.configuration");
			//String weather = context.getBean(String.class,"getWeatherInfo");
			//context.close();
			CallWeatherService weather = new CallWeatherService();
			return weather.getWeatherInfo(city);
	}
}
