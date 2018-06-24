package com.hcl.vamsi.web.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.vamsi.web.model.BerlinClockModel;

/**
 * To implement Berlin clock logic
 * @author Vamsi.Kallam
 *
 */
@RestController
public class BerlinClock {
/**
 * Exposing getBerlinClockTime as Rest Service.
 * @return BerlinClockModel as return type for the service
 * use date get methods to get hours, minutes and seconds.
 */
	@SuppressWarnings("deprecation")
	@RequestMapping("/getBerlinClockTime")
	@ResponseBody
	public BerlinClockModel getBerlinClockTime(){
		BerlinClockModel bc = new BerlinClockModel();
		Date date = new Date();
		System.out.println("Current Date is :"+ date);
		bc.setFivehours(date.getHours()/5);
		bc.setSinglehours(date.getHours()%5);
		bc.setFivemins(date.getMinutes()/5);
		bc.setMins(date.getMinutes()%5);
		bc.setSecs(date.getSeconds());
		return bc;
	}
}
