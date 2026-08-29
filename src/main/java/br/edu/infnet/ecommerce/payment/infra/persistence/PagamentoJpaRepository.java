package br.edu.infnet.ecommerce.payment.infra.persistence;

import br.edu.infnet.ecommerce.payment.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PagamentoJpaRepository extends JpaRepository<Pagamento, Long> {
    Optional<Pagamento> findByPedidoId(Long pedidoId);
}
