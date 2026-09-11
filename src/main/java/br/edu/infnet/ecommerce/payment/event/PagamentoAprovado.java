package br.edu.infnet.ecommerce.payment.event;

import br.edu.infnet.ecommerce.event.DomainEvent;
import br.edu.infnet.ecommerce.payment.domain.Dinheiro;
import br.edu.infnet.ecommerce.payment.domain.PagamentoId;
import br.edu.infnet.ecommerce.user.domain.Usuario;

import java.time.Instant;

public record PagamentoAprovado(
        PagamentoId pagamentoId,
        Long usuarioId,
        Dinheiro valor,
        Instant ocorridoEm) implements DomainEvent {
    public PagamentoAprovado(
            PagamentoId pagamentoId,
            Long usuarioId,
            Dinheiro valor
    ) {
        this(
                pagamentoId,
                usuarioId,
                valor,
                Instant.now()
        );
    }
}
