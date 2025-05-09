package services;

import model.Coin;

public class ExchangeService {
    private final Coin coin;

    public ExchangeService(Coin coin) {
        this.coin = coin;
    }

    // calcula a conversão com base na quantidade do cambio inserida
    public double exchangeCoin(int quantity) {
        // faz o calculo através de big decimals para evitar erros de flutuação
        return (coin.getBaseCoin().multiply(coin.getTargetCoin())).doubleValue() * quantity;
    }
}
