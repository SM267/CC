package com.shortlinkx.analytics;
import org.springframework.beans.factory.annotation.Value;import org.springframework.kafka.core.KafkaTemplate;import org.springframework.stereotype.Service;
@Service public class ClickEventProducer{private final KafkaTemplate<String,ClickEventPayload> kafka;private final String topic;public ClickEventProducer(KafkaTemplate<String,ClickEventPayload> kafka,@Value("${shortlinkx.analytics-topic}")String topic){this.kafka=kafka;this.topic=topic;}public void publish(ClickEventPayload e){kafka.send(topic,e.shortCode(),e);}}
