package com.shump.code.nettyclientdemo.messagehandler.heartbeat;

import com.shump.code.nettyclientdemo.message.heartbeat.HeartbeatResponse;
import com.shump.code.nettycommondemo.dispatcher.MessageHandler;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HeartbeatResponseHandler implements MessageHandler<HeartbeatResponse> {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void execute(Channel channel, HeartbeatResponse message) {
        logger.info("[execute][收到连接({}) 的心跳响应]", channel.id());
    }

    @Override
    public String getType() {
        return HeartbeatResponse.TYPE;
    }

}
