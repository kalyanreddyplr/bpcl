package com.bpcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bpcl.dto.CBDataDTO;
import com.bpcl.service.CapBottleDataToKafkaService;

@RestController
@RequestMapping("/capbottle")
public class CapBottleDataToKafkaController {

	@Autowired
	CapBottleDataToKafkaService CBService;
	
	
	@PostMapping("/aggregation")
	public void senttokafka(@RequestBody CBDataDTO data)
	
	{
		
		System.out.println("This is new commit");
		
		
		CBService.sendMessage(data);
		
	}

	

public void subbu2(@RequestBody CBDataDTO data)
	
	{
		
		System.out.println("This is new subbu2");
		
		
		CBService.sendMessage(data);
		
	}


public void Subbu4(@RequestBody CBDataDTO data)

{
	
	System.out.println("This is new Subbu4");
	
	
	CBService.sendMessage(data);
	
}

public void subbu3(@RequestBody CBDataDTO data)
	
	{
		
		System.out.println("This is new subbu3");
		
		
		CBService.sendMessage(data);
		
	}


}
