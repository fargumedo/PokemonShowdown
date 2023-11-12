package pokemon.stepDefinitions;

import pokemonSearch.response.PokemonSearchResponse;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.*;

public class PokemonStats {
	
	private PokemonSearchResponse pokeStatsResp = new PokemonSearchResponse();
	private String pkName;
	private int pkHP;
	private int pkAttack;
	private int pkDefense;
	private int pkSpecialAtt;
	private int pkSpecialDef;
	private int pkSpeed;
	private String pkAb1;
	private String pkAb2;
	
	public PokemonStats() {
		
	}
	
	public PokemonStats(String pkName, int pkHP, int pkAttack, int pkDefense, int pkSpecialAtt, 
			int pkSpecialDef, int pkSpeed, String pkAb1, String pkAb2) {
		
		this.pkName = pkName;
		this.pkHP = pkHP;
		this.pkAttack = pkAttack;
		this.pkDefense = pkDefense;
		this.pkSpecialAtt = pkSpecialAtt;
		this.pkSpecialDef = pkSpecialDef;
		this.pkSpeed = pkSpeed;
		this.pkAb1 = pkAb1;
		this.pkAb2 = pkAb2;
	}
	
	public int PokemonSearch(String pkName) throws Exception {
		
		URL url = new URL("https://pokeapi.co/api/v2/pokemon/"+pkName);
		HttpURLConnection pokeApi = (HttpURLConnection) url.openConnection();
		pokeApi.setRequestMethod("GET");
		InputStream strm = pokeApi.getInputStream();
		byte[] arrStream = strm.readAllBytes();
		
		String cntJson="";
		int pokHP;
		int pokAttack;
				
		for(byte tmp: arrStream)
			cntJson+=(char)tmp;
		
		JSONArray json = new JSONArray(cntJson);
		for(Object obj: json)
			pokHP = (int) ((((JSONObject)obj).getJSONArray("stats")).getJSONObject(0).get("base_stat"));
		for(Object obj2: json)
			pokAttack = (int) ((((JSONObject)obj2).getJSONArray("stats")).getJSONObject(1).get("base_stat"));
		for(Object obj3: json)
			pkDefense = (int) ((((JSONObject)obj3).getJSONArray("stats")).getJSONObject(2).get("base_stat"));
		for(Object obj4: json)
			pkSpecialAtt = (int) ((((JSONObject)obj4).getJSONArray("stats")).getJSONObject(3).get("base_stat"));
		for(Object obj5: json)
			pkSpecialDef = (int) ((((JSONObject)obj5).getJSONArray("stats")).getJSONObject(4).get("base_stat"));
		for(Object obj6: json)
			pkSpeed = (int) ((((JSONObject)obj6).getJSONArray("stats")).getJSONObject(5).get("base_stat"));
		for(Object obj7: json)
			pkAb1 = (String) ((((JSONObject)obj7).getJSONArray("abilities")).getJSONObject(0).get("name"));
		for(Object obj8: json)
			pkAb1 = (String) ((((JSONObject)obj8).getJSONArray("abilities")).getJSONObject(1).get("name"));

		
		return pkSpeed;

	//	return pkHP;

		
/*		String jsonData = jsonElement.getText();

        // Use Jackson ObjectMapper to parse JSON data
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Parse JSON data
            JsonNode jsonNode = objectMapper.readTree(jsonData);

  /*          try {
                URL url = new URL("https://pokeapi.co/api/v2/pokemon/"+pokemonName); // Replace with the actual URL of your API endpoint
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");

                int responseCode = connection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String line;
                    StringBuilder response = new StringBuilder();

                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                    reader.close();

                    // Parse the JSON response
                    String jsonResponse = response.toString();
                    int baseStat = extractBaseStat(jsonResponse);

                    // Now, 'baseStat' contains the value of the base_stat
                    System.out.println("Base Stat: " + baseStat);
                } else {
                    System.out.println("HTTP GET request failed with response code: " + responseCode);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            int extractBaseStat(String jsonResponse) {
                // Parse the JSON and extract the base_stat value
                // You may want to use a JSON parsing library like Jackson or Gson for a more robust solution
                // Here, I'm using a simple substring method for illustration purposes
                int start = jsonResponse.indexOf("\"base_stat\":") + 13;
                int end = jsonResponse.indexOf(",", start);
                String baseStatString = jsonResponse.substring(start, end);

                return Integer.parseInt(baseStatString.trim());
            }

		
	
	}

	private int extractBaseStat(String jsonResponse) {
		// TODO Auto-generated method stub
		return 0;
	}

	private Object given() {
		// TODO Auto-generated method stub
		return null;*/
	}

}
