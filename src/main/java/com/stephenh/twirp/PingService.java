package com.stephenh.twirp;

import com.stephenh.twirp.ping.PingProto;
import com.stephenh.twirp.ping.RpcPingService;

public class PingService implements RpcPingService {

    @Override
    public PingProto.PingResponse handlePing(PingProto.PingRequest in) {
        return null;
    }
}
