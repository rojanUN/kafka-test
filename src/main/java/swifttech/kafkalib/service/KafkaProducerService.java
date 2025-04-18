package swifttech.kafkalib.service;

public interface KafkaProducerService {
    void send(String topic, Object value);

    void send(String topic, String key, Object value);
}
