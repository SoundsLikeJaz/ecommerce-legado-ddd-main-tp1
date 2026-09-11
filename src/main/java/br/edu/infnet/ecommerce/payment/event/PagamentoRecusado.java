package br.edu.infnet.ecommerce.payment.event;

import br.edu.infnet.ecommerce.event.DomainEvent;
import br.edu.infnet.ecommerce.payment.domain.Dinheiro;
import br.edu.infnet.ecommerce.payment.domain.PagamentoId;

import java.time.Instant;

public record PagamentoRecusado(
        PagamentoId pagamentoId,
        Long usuarioId,
        Dinheiro valor,
        String motivo,
        Instant ocorridoEm) implements DomainEvent {
    public PagamentoRecusado(
            PagamentoId pagamentoId,
            Long usuarioId,
            Dinheiro valor,
            String motivo) {
        this(
                pagamentoId,
                usuarioId,
                valor,
                motivo,
                Instant.now()
        );
    }
}
