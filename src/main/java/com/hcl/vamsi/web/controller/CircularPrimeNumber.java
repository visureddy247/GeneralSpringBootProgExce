package com.hcl.vamsi.web.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.vamsi.web.model.CircularPrimeNo;

@RestController
public class CircularPrimeNumber {
	
	/**
	 * circular prime number method, which will circulate number and then check if it prime or not
	 * 
	 */	
	@RequestMapping("/isCircularPrime")
	@ResponseBody	
	public CircularPrimeNo isCircularPrimeNumber(@RequestParam("number") int number){		
		int tempnumber = number;int circularprimenumber = number;
		int intlength = Integer.toString(circularprimenumber).length();
		//boolean isCircularPrime=true;
		CircularPrimeNo cp = new CircularPrimeNo("true");
		do{			
			if (isPrimeNumber(circularprimenumber)){
				System.out.println(circularprimenumber + " is Prime Number");
				circularprimenumber = (circularprimenumber%10)*powerOf(10,intlength-1) + circularprimenumber/10;
				System.out.println("Next circular permutation is " + circularprimenumber);
			}
			else{
				System.out.println(circularprimenumber + " is not Prime Number");				
				//isCircularPrime=false;
				cp.setIsCircularPrime("false");
				break;
			}				
		}while((tempnumber=tempnumber/10)>0);
		if (Boolean.getBoolean(cp.getIsCircularPrime())){
			System.out.println(number + " entered is Circular Prime Number");
		}
		else{
			System.out.println(number + " entered is not Circular Prime Number");
		}
		return cp;
				
	}// end of isCircularPrimeNumber method
	/**
	 * this is powerOf method which takes base and exponent and returns the result
	 * @param base
	 * @param exponent
	 * @return
	 */
	public static int powerOf(int base, int exponent){
		int count = 0;int result = 1;
		if(base > 1){
			while(count < exponent){
				result = result*base;
				count++;
			}			
		}
		else if (base == 0)
			result = 0;
		else if (base == 1)
			result = 1;		
		return result;
	} // end of powerOf method
	
	/** 
	 * isPrimeNumber methid is to check if passed number is prime or not
	 * @param number
	 * @return
	 */
	public static boolean isPrimeNumber(int number){
		boolean isPrime = false; int count = 0; int loopvar = 1;
		if (number > 1){
			while(loopvar <= number/2){
				if (number%loopvar == 0)
					count++;
				loopvar++;
			}
			if (count > 1)	// most numbers are not prime numbers so probability of executing this is more
				isPrime = false;
			else
				isPrime = true;
		}
		else if (number == 0 || number == 1)
			isPrime = false;
		return isPrime;
	} // end of primeNumber method

} //end of CircularPrimeNumber Class
