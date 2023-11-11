package pokemonSearch.items;

public class SilverItem {
	
	@JsonProperty("back_default")
	private String backDefault;
	@JsonProperty("back_shiny")
	private String backShiny;
	@JsonProperty("front_default")
	private String frontDefault;
	@JsonProperty("front_shiny")
	private String frontShiny;
	@JsonProperty("front_transparent")
	private String frontTransparent;
	
	public SilverItem() {
		super();
	}
	
	public SilverItem(String backDefault, String backShiny, String frontDefault, String frontShiny, String frontTransparent) {
		super();
		this.backDefault = backDefault;
		this.backShiny = backShiny;
		this.frontDefault = frontDefault;
		this.frontShiny = frontShiny;
		this.frontTransparent = frontTransparent;
	}

	public String getBackDefault() {
		return backDefault;
	}

	public void setBackDefault(String backDefault) {
		this.backDefault = backDefault;
	}

	public String getBackShiny() {
		return backShiny;
	}

	public void setBackShiny(String backShiny) {
		this.backShiny = backShiny;
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

	public String getFrontTransparent() {
		return frontTransparent;
	}

	public void setFrontTransparent(String frontTransparent) {
		this.frontTransparent = frontTransparent;
	}

}
