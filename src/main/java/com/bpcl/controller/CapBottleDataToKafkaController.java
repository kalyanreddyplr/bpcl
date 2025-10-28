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

}
