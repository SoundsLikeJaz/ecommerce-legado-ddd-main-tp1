package br.edu.infnet.ecommerce.event;

import java.time.Instant;

public interface DomainEvent {
    Instant ocorridoEm();
}
