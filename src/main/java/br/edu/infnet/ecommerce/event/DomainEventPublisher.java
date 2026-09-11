package br.edu.infnet.ecommerce.event;

import java.util.Collection;

public interface DomainEventPublisher {
    void publicar(Collection<DomainEvent> eventos);

}
