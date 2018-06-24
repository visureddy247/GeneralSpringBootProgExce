package com.hcl.vamsi.web.model;
/**
 * this model class is to return simple json, which says true/false
 * @author Vamsi.Kallam
 *
 */

public class CircularPrimeNo {
	private String isCircularPrime;
	public CircularPrimeNo(String isCircularPrime) {
		this.isCircularPrime = isCircularPrime;
	}
	public void setIsCircularPrime(String isCircularPrime){
		this.isCircularPrime = isCircularPrime;
	}	
	public String getIsCircularPrime(){
		return isCircularPrime;
	}

}
