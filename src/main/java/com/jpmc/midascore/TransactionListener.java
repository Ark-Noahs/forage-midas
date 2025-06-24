package com.jpmc.midascore;

import com.jpmc.midascore.foundation.Transaction;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@Component
public class TransactionListener {

    private static final Logger logger = LoggerFactory.getLogger(TransactionListener.class);
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Value("${general.kafka-topic}")
    private String topic;

    @KafkaListener(topics = "${general.kafka-topic}", groupId = "midas-core")
    public void listen(String transactionJson) {
        try {
            Transaction transaction = objectMapper.readValue(transactionJson, Transaction.class);
            logger.info("Transaction content: {}", transaction);
        } catch (Exception e) {
            logger.error("Failed to parse transaction JSON: {}", transactionJson, e);
        }
    }
}
