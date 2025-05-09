package services;

import java.io.IOException;
import java.net.http.HttpResponse;

public class ResponseService {
    private final RequestService requestService;

    // instância do request para obter a resposta da API
    public ResponseService(RequestService requestService) {
        this.requestService = requestService;
    }

    // body do JSON da resposta obtida da API
    public String getResponse() throws IOException, InterruptedException {
        HttpResponse<String> response = requestService.getClient()
                .send(requestService.getRequest(), HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
