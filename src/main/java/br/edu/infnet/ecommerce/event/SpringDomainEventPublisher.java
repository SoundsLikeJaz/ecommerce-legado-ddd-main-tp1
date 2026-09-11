package br.edu.infnet.ecommerce.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class SpringDomainEventPublisher implements DomainEventPublisher {
    private final ApplicationEventPublisher publisher;

    public SpringDomainEventPublisher(
            ApplicationEventPublisher publisher
    ) {
        this.publisher = publisher;
    }

    @Override
    public void publicar(Collection<DomainEvent> eventos) {
        eventos.forEach(publisher::publishEvent);
    }
}
