import com.google.gson.Gson;
import dto.CoinDTO;
import model.Coin;
import services.ExchangeService;
import services.RequestService;
import services.ResponseService;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner s = new Scanner(System.in);

        // moeda a ser convertida
        coinList();
        String baseCoin = s.next().toUpperCase();

        System.out.println("Insira a quantidade de "+ baseCoin.toUpperCase() + ": ");
        int quantity = s.nextInt();


        // inicialização do serviço de request e response.
        final String API_KEY = "";
        RequestService requestService = new RequestService(API_KEY, baseCoin.toUpperCase());
        ResponseService responseService = new ResponseService(requestService);

        // desserialização p/ Objeto java
        Gson gson = new Gson();
        // transferencia de dados entre CoinDTO > Coin
        CoinDTO conversao = gson.fromJson(responseService.getResponse(), CoinDTO.class);
        Coin coin = new Coin(conversao);

        // moeda a converter
        coinList();
        String targetCoin = s.next().toUpperCase();
        if(coin.getCoinList().containsKey(targetCoin) && coin.getCoinList().containsKey(baseCoin)) {
            // armazenando valores da moeda base e alvo
            coin.setBaseCoin(baseCoin);
            coin.setTargetCoin(targetCoin);

            // conversão
            ExchangeService exchangeService = new ExchangeService(coin);
            double exchanged = exchangeService.exchangeCoin(quantity);

            System.out.println("$" + quantity + baseCoin + "'s = $" + exchanged + targetCoin + "'s");
        } else {
            System.out.println("Uma das moedas especificadas não existe.");
        }
        s.close();
    }

    private static void coinList() {
        System.out.print("""
                Opções:
                ARS - Peso argentino
                BOB - Boliviano boliviano
                BRL - Real brasileiro
                CLP - Peso chileno
                COP - Peso colombiano
                USD - Dólar americano
                Moeda a ser convertida
                """);
    }
}
