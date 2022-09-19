package com.example.redissubscriber.subcriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Service;


@Service
public class Subscriber implements MessageListener {
    Logger logger = LoggerFactory.getLogger(Subscriber.class);

    @Override
    public void onMessage(Message message, byte[] pattern) {
        logger.info("Subscriber >>"+message);

    }
}
