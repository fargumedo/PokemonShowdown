package pokemon.stepDefinitions;

import pokemonSearch.response.PokemonSearchResponse;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PokemonStats {
	
	private PokemonSearchResponse pokeStatsResp = new PokemonSearchResponse();
	
	HttpClient httpClient = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://pokeapi.co")).build();

    try {
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Response Code: " + response.statusCode());
        System.out.println("Response Body: " + response.body());
    } catch (Exception e) {
        e.printStackTrace();
    }
}

}
