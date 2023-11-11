package pokemonSearch.items;

public class IconsItem2 {
	
	@JsonProperty("front_default")
	private String frontDefault;
	@JsonProperty("front_female")
	private String front_female;
	
	public IconsItem2() {
		super();
	}
	
	public IconsItem2(String frontDefault, String front_female) {
		super();
		this.frontDefault = frontDefault;
		this.front_female = front_female;
	}

	public String getFrontDefault() {
		return frontDefault;
	}

	public void setFrontDefault(String frontDefault) {
		this.frontDefault = frontDefault;
	}

	public String getFront_female() {
		return front_female;
	}

	public void setFront_female(String front_female) {
		this.front_female = front_female;
	}

}
