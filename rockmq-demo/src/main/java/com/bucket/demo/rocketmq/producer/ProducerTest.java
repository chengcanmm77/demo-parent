package com.bucket.demo.rocketmq.producer;


import java.io.UnsupportedEncodingException;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.apache.rocketmq.remoting.exception.RemotingException;

public class ProducerTest {

	public static void main(String[] args) throws MQClientException, RemotingException, MQBrokerException, InterruptedException, UnsupportedEncodingException {
		DefaultMQProducer producer = new DefaultMQProducer("bucket_group");
		producer.setNamesrvAddr("10.1.25.82:9876");
		// Launch the instance.
		producer.start();
		//producer.createTopic("TopicTest", "TopicTest", 4);
		for (int i = 0; i < 100; i++) {
			// Create a message instance, specifying topic, tag and message
			// body.
			Message msg = new Message("TopicTest" , "TagA" , ("Hello RocketMQ " + i)
					.getBytes(RemotingHelper.DEFAULT_CHARSET) 
			);
			// Call send message to deliver message to one of brokers.
			SendResult sendResult = producer.send(msg);
			System.out.printf("%s%n", sendResult);
		}
		// Shut down once the producer instance is not longer in use.
		producer.shutdown();
	}
    
}
