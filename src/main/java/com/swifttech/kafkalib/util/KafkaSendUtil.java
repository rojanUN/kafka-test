package com.swifttech.kafkalib.util;

import com.swifttech.kafkalib.payload.ActivityLogRequest;
import com.swifttech.kafkalib.payload.ApplicationLogRequest;
import com.swifttech.kafkalib.payload.CommunicationRequest;
import com.swifttech.kafkalib.payload.LoginLogRequest;
import com.swifttech.kafkalib.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class KafkaSendUtil {
    private final KafkaProducerService kafkaProducerService;

    @Value("${kafka.topic.application}")
    private String applicationLogTopic;

    @Value("${kafka.topic.activity}")
    private String activityLogTopic;

    @Value("${kafka.topic.notification}")
    private String notificationTopic;

    @Value("${kafka.topic.login}")
    private String loginTopic;

    public void sendApplicationLog(ApplicationLogRequest request) {
        kafkaProducerService.send(applicationLogTopic, request);
    }

    public void sendActivityLog(ActivityLogRequest request) {
        kafkaProducerService.send(activityLogTopic, request);
    }

    public void sendNotification(CommunicationRequest request) {
        kafkaProducerService.send(notificationTopic, request);
    }

    public void sendLoginLog(LoginLogRequest request) {
        kafkaProducerService.send(loginTopic, request);
    }
}
