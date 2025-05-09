package model;

import dto.CoinDTO;

import java.math.BigDecimal;
import java.util.Map;

public class Coin {
    private final Map<String, BigDecimal> coinList; // lista de cambios da API
    private BigDecimal baseCoin;
    private BigDecimal targetCoin;

    // instância do DTO
    public Coin(CoinDTO coinDTO) {
        this.coinList = coinDTO.conversion_rates();
    }

    // define e armazena a moeda base escolhida pelo usuário
    public void setBaseCoin(String baseCoin) {
        this.baseCoin = coinList.get(baseCoin);
    }

    // define e armazena a moeda alvo escolhida pelo usuário
    public void setTargetCoin(String targetCoin) {
        this.targetCoin = coinList.get(targetCoin);
    }

    // retorna a lista de cambios disponibilizadas pela API
    public Map<String, BigDecimal> getCoinList() {
        return coinList;
    }

    // retorna o valor da moeda base escolhida pelo usuário
    public BigDecimal getBaseCoin() {
        return this.baseCoin;
    }

    // retorna o valor da moeda alvo escolhida pelo usuário
    public BigDecimal getTargetCoin() {
        return this.targetCoin;
    }

}
