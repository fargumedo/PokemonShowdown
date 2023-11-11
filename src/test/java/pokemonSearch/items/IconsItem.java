package pokemonSearch.items;

public class IconsItem {
	
	@JsonProperty("front_default")
	private String frontDefault;
	@JsonProperty("front_female")
	private String frontFemale;
	
	public IconsItem() {
		super();
	}
	
	public IconsItem(String frontDefault, String frontFemale) {
		super();
		this.frontDefault = frontDefault;
		this.frontFemale = frontFemale;
	}

	public String getFrontDefault() {
		return frontDefault;
	}

	public void setFrontDefault(String frontDefault) {
		this.frontDefault = frontDefault;
	}

	public String getFrontFemale() {
		return frontFemale;
	}

	public void setFrontFemale(String frontFemale) {
		this.frontFemale = frontFemale;
	}

}
