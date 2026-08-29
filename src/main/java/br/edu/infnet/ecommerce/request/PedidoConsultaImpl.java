package br.edu.infnet.ecommerce.request;

import br.edu.infnet.ecommerce.repository.PedidoRepository;
import org.springframework.stereotype.Component;

@Component
public class PedidoConsultaImpl implements PedidoConsulta {

    private final PedidoRepository pedidoRepository;

    public PedidoConsultaImpl(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public boolean existePedido(Long pedidoId) {
        return pedidoRepository.existsById(pedidoId);
    }
}
