package com.hcl.vamsi.web.implementation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateFloydsTriangle {
	String fT="";
	@Bean(name="cft")
	public String createFT(){
		int count=1;
		for (int i=1;i<=4;i++){
			for(int j=0;j<i;j++){
				fT = fT +" "+ count;
				count++;
			}
			fT = fT +"\n";		
		}
		return fT;		
	}
	@Bean(name="xyz")
	public String xyx(){
		return "Hello World!!";		
	}
}
