package br.edu.infnet.ecommerce.payment.domain;

import java.util.Optional;

public interface PagamentoRepository {
    Pagamento salvar(Pagamento pagamento);
    Pagamento buscarPorId(PagamentoId id);
    Pagamento buscarPorPedidoId(Long pedidoId);
}
