package cn.dsx.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @Classname: ReceiveMessageListenerController
 * @Author: Dsx
 * @Date: 2020/04/14/17:12
 */
@Slf4j
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController{



    @Value("${server.port}")
    private String serverPort;


    @StreamListener(Sink.INPUT)//监听的
    public void input(Message<String> message)    {
        log.info("消费者2号,----->接受到的消息: "+message.getPayload()+"\t  port: "+serverPort);
    }
}