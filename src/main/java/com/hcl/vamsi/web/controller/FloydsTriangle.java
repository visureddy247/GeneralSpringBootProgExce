package com.hcl.vamsi.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.vamsi.web.implementation.CreateFloydsTriangle;

@RestController
public class FloydsTriangle {
/**
 * Exposing Floyds Triangle Service.
 */	
	@Autowired
	CreateFloydsTriangle cft;	
	@RequestMapping("/printFloydsTriangle")
	public String printFloydsTriangle(@RequestParam("number") int number){
		/**
		 * Invoke the implementation Bean of the floyds triangle.
		 */
		//CreateFloydsTriangle cft = new CreateFloydsTriangle();
		//System.out.println("Floyds Triangle " + cft.createFT(number));
		return cft.createFT();
		
	}
}
