package classes;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import record.CepViaCep;
import com.google.gson.Gson;

public class BuscaCep {
    public CepViaCep consultaCep(String search) { 
        URI endereco = URI.create("https://viacep.com.br/ws/%s/json/".formatted(search));
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(endereco).build();
        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());

            } catch (IOException | InterruptedException e) {
                e.getMessage();
            } 
        
        return new Gson().fromJson(response.body(), CepViaCep.class);
    }
}
