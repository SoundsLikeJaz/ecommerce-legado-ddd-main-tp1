package br.edu.infnet.ecommerce.payment.infra.integration;

import br.edu.infnet.ecommerce.payment.domain.Dinheiro;
import br.edu.infnet.ecommerce.payment.domain.NumeroCartao;
import br.edu.infnet.ecommerce.payment.domain.ProcessadorCartao;
import br.edu.infnet.ecommerce.payment.domain.ResultadoProcessamento;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Component
public class ProcessadorCartaoImpl implements ProcessadorCartao {

    private static final BigDecimal LIMITE = new BigDecimal("10000.00");

    @Override
    public ResultadoProcessamento processar(Dinheiro quantia, NumeroCartao numeroCartao) {
        if (quantia.valor().compareTo(LIMITE) > 0) {
            return ResultadoProcessamento.recusado("LIMITE_EXCEDIDO");
        }

        if (numeroCartao.terminaEm("0000")) {
            return ResultadoProcessamento.recusado("CARTAO_BLOQUEADO");
        }

        return ResultadoProcessamento.aprovado(
                UUID.randomUUID().toString().substring(0, 8).toUpperCase()
        );
    }
}
