package swifttech.kafkalib.util;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import swifttech.kafkalib.payload.ActivityLogRequest;
import swifttech.kafkalib.payload.ApplicationLogRequest;
import swifttech.kafkalib.payload.CommunicationRequest;
import swifttech.kafkalib.payload.LoginLogRequest;
import swifttech.kafkalib.service.KafkaProducerService;

@RequiredArgsConstructor
@Service
public class SendUtil {
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
