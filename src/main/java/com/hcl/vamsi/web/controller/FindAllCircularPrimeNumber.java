package com.hcl.vamsi.web.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class to find all the circular prime numbers between 2 and the given number.
 * @author Vamsi.Kallam
 *
 */
@RestController
public class FindAllCircularPrimeNumber {
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/findAllCircularPrime")
	@ResponseBody
	public static HashMap<String,Integer> findAllCircularPrimeNumber(@RequestParam("number") int number){
		//StringBuilder circularPrimeNumberList = new StringBuilder();
		HashMap<String,Integer> cpnum = new HashMap<String,Integer>();
		int count = 1;
		CircularPrimeNumber cpn = new CircularPrimeNumber();
		// TODO Auto-generated method stub				
				for (int i = 2;i<=number;i++){  
					if(Boolean.valueOf(cpn.isCircularPrimeNumber(i).getIsCircularPrime())){
						System.out.println(i + " is circular Prime number");
						//circularPrimeNumberList.append(String.valueOf(i)).append(" ");
						cpnum.put("Serial No" + count++, i);
					}
				}
		return cpnum;
	}
}
