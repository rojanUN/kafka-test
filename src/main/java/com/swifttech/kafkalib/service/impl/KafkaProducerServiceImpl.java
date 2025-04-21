package com.swifttech.kafkalib.service.impl;

import com.swifttech.kafkalib.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class KafkaProducerServiceImpl implements KafkaProducerService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public void send(String topic, Object value) {
        kafkaTemplate.send(topic, value);
    }

    @Override
    public void send(String topic, String key, Object value) {
        kafkaTemplate.send(topic, key, value);
    }
}
