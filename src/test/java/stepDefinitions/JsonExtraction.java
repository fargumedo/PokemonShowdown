package pokemon.stepDefinitions;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

public class JsonExtraction {
	
	private String pkName;
	private int pkHP;
	private int pkAttack;
	private int pkDefense;
	private int pkSpecialAtt;
	private int pkSpecialDef;
	private int pkSpeed;
	private String pkAb1;
	private String pkAb2;
	
	public JsonExtraction(String pkName, int pkHP, int pkAttack, int pkDefense, int pkSpecialAtt, int pkSpecialDef, 
			int pkSpeed, String pkAb1, String pkAb2) {
		
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
	
	public int PokemonHP() {
		
		String jsonResponse = "";
		RestAssured.defaultParser = Parser.JSON;
		String pokeN = pkName;
		String path = "https://pokeapi.co/api/v2/pokemon/";
		jsonResponse = given().contentType("application/json").when()
					.get(path+pokeN).asString();
		
		JSONObject json = new JSONObject(jsonResponse);
		int pokHP = json.getJSONArray("stats").getJSONObject(0).getInt("base_stat");
		return pokHP;
		
	}
	
	public int PokemonAttack() {
		
		String jsonResponse = "";
		RestAssured.defaultParser = Parser.JSON;
		String pokeN = pkName;
		String path = "https://pokeapi.co/api/v2/pokemon/";
		jsonResponse = given().contentType("application/json").when()
					.get(path+pokeN).asString();
		
		JSONObject json = new JSONObject(jsonResponse);
		int pokAttack = json.getJSONArray("stats").getJSONObject(1).getInt("base_stat");
		return pokAttack;
		
	}
	
	public int PokemonDefense() {
		
		String jsonResponse = "";
		RestAssured.defaultParser = Parser.JSON;
		String pokeN = pkName;
		String path = "https://pokeapi.co/api/v2/pokemon/";
		jsonResponse = given().contentType("application/json").when()
					.get(path+pokeN).asString();
		
		JSONObject json = new JSONObject(jsonResponse);
		int pokDefense = json.getJSONArray("stats").getJSONObject(2).getInt("base_stat");
		return pokDefense;
		
	}
	
	public int PokemonSpecialAttack() {
		
		String jsonResponse = "";
		RestAssured.defaultParser = Parser.JSON;
		String pokeN = pkName;
		String path = "https://pokeapi.co/api/v2/pokemon/";
		jsonResponse = given().contentType("application/json").when()
					.get(path+pokeN).asString();
		
		JSONObject json = new JSONObject(jsonResponse);
		int pokSPAtt = json.getJSONArray("stats").getJSONObject(3).getInt("base_stat");
		return pokSPAtt;
		
	}
	
	public int PokemonSpecialDefense() {
		
		String jsonResponse = "";
		RestAssured.defaultParser = Parser.JSON;
		String pokeN = pkName;
		String path = "https://pokeapi.co/api/v2/pokemon/";
		jsonResponse = given().contentType("application/json").when()
					.get(path+pokeN).asString();
		
		JSONObject json = new JSONObject(jsonResponse);
		int pokSPDef = json.getJSONArray("stats").getJSONObject(4).getInt("base_stat");
		return pokSPDef;
		
	}
	
	public int PokemonSpeed() {
		
		String jsonResponse = "";
		RestAssured.defaultParser = Parser.JSON;
		String pokeN = pkName;
		String path = "https://pokeapi.co/api/v2/pokemon/";
		jsonResponse = given().contentType("application/json").when()
					.get(path+pokeN).asString();
		
		JSONObject json = new JSONObject(jsonResponse);
		int pokSpeed = json.getJSONArray("stats").getJSONObject(5).getInt("base_stat");
		return pokSpeed;
		
	}
	
	public String PokemonAbility1() {
		
		String jsonResponse = "";
		RestAssured.defaultParser = Parser.JSON;
		String pokeN = pkName;
		String path = "https://pokeapi.co/api/v2/pokemon/";
		jsonResponse = given().contentType("application/json").when()
					.get(path+pokeN).asString();
		
		JSONObject json = new JSONObject(jsonResponse);
		String pokAb1 = (String) ((JSONObject) json.getJSONArray("abilities").getJSONObject(0).get("ability")).get("name");
		return pokAb1;
		
	}
	
	public String PokemonAbility2() {
		
		String jsonResponse = "";
		RestAssured.defaultParser = Parser.JSON;
		String pokeN = pkName;
		String path = "https://pokeapi.co/api/v2/pokemon/";
		jsonResponse = given().contentType("application/json").when()
					.get(path+pokeN).asString();
		
		JSONObject json = new JSONObject(jsonResponse);
		String pokAb2 = (String) ((JSONObject) json.getJSONArray("abilities").getJSONObject(1).get("ability")).get("name");
		return pokAb2;
		
	}

}
