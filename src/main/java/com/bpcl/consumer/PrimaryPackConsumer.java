package com.bpcl.consumer;

import com.bpcl.dto.CBDataDTO;
import com.bpcl.service.PrimaryPackService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class PrimaryPackConsumer {

    private static final Logger log = LoggerFactory.getLogger(PrimaryPackConsumer.class);

    @Autowired
    private PrimaryPackService service;

    @KafkaListener(
        topics = "primaryCapDetails",
        groupId = "test",
        containerFactory = "kafkaListenerContainerFactory"
    )
    public void consume(CBDataDTO data) {
        log.info("📥 Received message from Kafka [primaryCapDetails]: {}", data);

        try {
            log.info("⏳ Starting primary pack verification process...");
            service.primarypackverify(data);
            log.info("✅ Primary pack verification completed successfully.");
        } catch (Exception e) {
            log.error("❌ Error occurred while processing Kafka message: {}", e.getMessage(), e);
        }
    }
}
