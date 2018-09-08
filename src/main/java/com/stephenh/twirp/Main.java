package com.stephenh.twirp;

import com.flit.runtime.undertow.FlitHandler;
import com.stephenh.twirp.ping.RpcPingServiceHandler;
import io.undertow.Undertow;

public class Main {
    public static void main(String[] args) {
        Undertow server = Undertow.builder()
                .addHttpListener(8080, "0.0.0.0")
                .setHandler(new FlitHandler
                        .Builder()
                        .withNext(null)
                        .withRoute(RpcPingServiceHandler.ROUTE, new RpcPingServiceHandler(new PingService()))
                        .build()
                )
                .build();
        server.start();
    }
}
