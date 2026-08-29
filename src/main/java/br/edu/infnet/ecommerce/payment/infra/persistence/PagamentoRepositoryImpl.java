package br.edu.infnet.ecommerce.payment.infra.persistence;


import br.edu.infnet.ecommerce.exception.RecursoNaoEncontradoException;
import br.edu.infnet.ecommerce.payment.domain.Pagamento;
import br.edu.infnet.ecommerce.payment.domain.PagamentoId;
import br.edu.infnet.ecommerce.payment.domain.PagamentoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class PagamentoRepositoryImpl implements PagamentoRepository {

    private final PagamentoJpaRepository jpaRepository;

    public PagamentoRepositoryImpl(PagamentoJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Pagamento salvar(Pagamento pagamento) {
        return jpaRepository.save(pagamento);
    }

    @Override
    public Pagamento buscarPorId(PagamentoId id) {
        return jpaRepository.findById(id.valor())
                .orElseThrow(() -> new RecursoNaoEncontradoException(id.toString()));
    }

    @Override
    public Pagamento buscarPorPedidoId(Long pedidoId) {
        return jpaRepository.findByPedidoId(pedidoId)
                .orElseThrow(() -> new RecursoNaoEncontradoException(pedidoId.toString()));
    }
}
