package com.bpcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CapBottleDataToKafkaService {

	
	private static final String TOPIC = "primaryCapDetails";

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@Autowired
	private ObjectMapper objectMapper;

public void sendMessage(Object data) {
		try {
			// Convert Java object (MainRequestDTO) to JSON string
			String jsonMessage = objectMapper.writeValueAsString(data);

			// Send message to Kafka topic
			kafkaTemplate.send(TOPIC, jsonMessage);

			System.out.println("Produced Message: " + jsonMessage);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
}}
