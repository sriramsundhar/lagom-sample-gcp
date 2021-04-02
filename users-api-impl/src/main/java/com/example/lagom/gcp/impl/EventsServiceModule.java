package com.example.lagom.gcp.impl;

import com.example.lagom.gcp.EventsService;
import com.google.inject.AbstractModule;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;

public class EventsServiceModule extends AbstractModule implements ServiceGuiceSupport {
    @Override
    protected void configure() {
        bindService(EventsService.class, EventsServiceImpl.class);
        additionalRouter(HelloGrpcServiceImpl.class);
    }
}
