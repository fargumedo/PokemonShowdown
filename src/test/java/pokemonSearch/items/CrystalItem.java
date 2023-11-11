package pokemonSearch.items;

public class CrystalItem {
	
	@JsonProperty("back_default")
	private String backDefault;
	@JsonProperty("back_shiny")
	private String backShiny;
	@JsonProperty("back_shiny_transparent")
	private String backShinyTransparent;
	@JsonProperty("back_transparent")
	private String backTransparent;
	@JsonProperty("front_default")
	private String frontDefault;
	@JsonProperty("front_shiny")
	private String frontShiny;
	@JsonProperty("front_shiny_transparent")
	private String frontShinyTransparent;
	@JsonProperty("front_transparent")
	private String frontTransparent;
	
	public CrystalItem() {
		super();
	}
	
	public CrystalItem(String backDefault, String backShiny, String backShinyTransparent, String backTransparent, String frontDefault, 
			String frontShiny, String frontShinyTransparent, String frontTransparent) {
		super();
		this.backDefault = backDefault;
		this.backShiny = backShiny;
		this.backShinyTransparent = backShinyTransparent;
		this.backTransparent = backTransparent;
		this.frontDefault = frontDefault;
		this.frontShiny = frontShiny;
		this.frontShinyTransparent = frontShinyTransparent;
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

	public String getBackShinyTransparent() {
		return backShinyTransparent;
	}

	public void setBackShinyTransparent(String backShinyTransparent) {
		this.backShinyTransparent = backShinyTransparent;
	}

	public String getBackTransparent() {
		return backTransparent;
	}

	public void setBackTransparent(String backTransparent) {
		this.backTransparent = backTransparent;
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

	public String getFrontShinyTransparent() {
		return frontShinyTransparent;
	}

	public void setFrontShinyTransparent(String frontShinyTransparent) {
		this.frontShinyTransparent = frontShinyTransparent;
	}

	public String getFrontTransparent() {
		return frontTransparent;
	}

	public void setFrontTransparent(String frontTransparent) {
		this.frontTransparent = frontTransparent;
	}

}
