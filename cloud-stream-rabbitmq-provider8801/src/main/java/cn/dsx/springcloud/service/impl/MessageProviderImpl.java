package cn.dsx.springcloud.service.impl;

import cn.dsx.springcloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;
/**
 * @Classname: MessageProviderImpl
 * @Author: Dsx
 * @Date: 2020/04/14/16:39
 */
@Slf4j
@EnableBinding(Source.class) //定义消息的推送管道
public class MessageProviderImpl implements IMessageProvider{
    @Resource
    private MessageChannel output; // 消息发送管道

    @Override
    public String send(){
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        log.info("消息发送: " + serial);
        return null;
    }
}
