package com.swifttech.kafkalib.service;

import org.springframework.kafka.listener.MessageListener;

public interface KafkaConsumerService extends MessageListener<String, Object> {

}
