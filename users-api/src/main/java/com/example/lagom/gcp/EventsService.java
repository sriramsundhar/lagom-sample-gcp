package com.example.lagom.gcp;

import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import static com.lightbend.lagom.javadsl.api.Service.*;

public interface EventsService extends Service {
    ServiceCall<NotUsed, String> helloWorld();

    @Override
    default Descriptor descriptor() {
        return named("EventsService").withCalls(
                namedCall("events", this::helloWorld)
        ).withAutoAcl(true);
    }

}
