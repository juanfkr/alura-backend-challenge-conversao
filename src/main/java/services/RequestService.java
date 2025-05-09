package services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class RequestService {
    private final HttpClient client;
    private final HttpRequest request;

    // inicializa o cliente e faz o pedido para a API
    public RequestService(String API_KEY, String baseCoin) {
        this.client = HttpClient.newHttpClient();
        this.request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/"+API_KEY+"/latest/"+baseCoin))
                .build();
    }

    // retorna o cliente http local
    public HttpClient getClient() {
        return client;
    }

    // retorna a requisição
    public HttpRequest getRequest() {
        return request;
    }
}
