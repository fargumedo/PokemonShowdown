package pokemonSearch.items;

public class EmeraldItem {
	
	@JsonProperty("front_default")
	private String frontDefault;
	@JsonProperty("front_shiny")
	private String frontShiny;
	
	public EmeraldItem() {
		super();
	}
	
	public EmeraldItem(String frontDefault, String frontShiny) {
		super();
		this.frontDefault = frontDefault;
		this.frontShiny = frontShiny;
	}

	public String getFrontDefault() {
		return frontDefault;
	}

	public void setFrontDefault(String frontDefault) {
		this.frontDefault = frontDefault;
	}

	public String getFrontShiny() {
		return frontShiny;
	}

	public void setFrontShiny(String frontShiny) {
		this.frontShiny = frontShiny;
	}

}
