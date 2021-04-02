package com.example.lagom.gcp.impl;


import akka.NotUsed;
import com.example.lagom.gcp.EventsService;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import static java.util.concurrent.CompletableFuture.completedFuture;

public class EventsServiceImpl implements EventsService {
    @Override
    public ServiceCall<NotUsed, String> helloWorld() {
        return notUsed -> completedFuture("Hello world");
    }
}
