package swifttech.kafkalib.service.impl;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Service;
import swifttech.kafkalib.service.KafkaConsumerService;

@RequiredArgsConstructor
@Service
public class KafkaConsumerServiceImpl implements KafkaConsumerService {
    @Override
    public void onMessage(@NonNull ConsumerRecord<String, Object> data) {
        //incoming messages.
    }
}
