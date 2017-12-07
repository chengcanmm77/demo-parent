package com.bucket.demo.rocketmq.consumer;

import java.util.List;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.common.message.MessageExt;

public class Consumer {

	public static void main(String[] args) throws MQClientException {
		 DefaultMQPushConsumer consumer = new DefaultMQPushConsumer("example_group_name");

	        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
	        consumer.subscribe("TopicTest", "TagA || TagC || TagD");
	        consumer.setNamesrvAddr("10.1.25.82:9876");

	        consumer.registerMessageListener(new MessageListenerConcurrently() {

				@Override
				public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs,
						ConsumeConcurrentlyContext context) {
					for(MessageExt msg:msgs){
						System.out.println(msg.getTopic()+"-"+msg.getTags()+":"+new String(msg.getBody()));
					}
					return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;  
				}

	        });

	        consumer.start();

	        System.out.printf("Consumer Started.%n");
	}
}
