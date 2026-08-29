package br.edu.infnet.ecommerce.payment.domain;

public interface ProcessadorCartao {
    ResultadoProcessamento processar(Dinheiro valor, NumeroCartao numeroCartao);
}
