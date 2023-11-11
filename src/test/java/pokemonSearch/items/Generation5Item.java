package pokemonSearch.items;

public class Generation5Item {
	
	@JsonProperty("black-white")
	private BlackWhiteItem blackWhite;
	
	public Generation5Item() {
		super();
	}
	
	public Generation5Item(BlackWhiteItem blackWhite) {
		super();
		this.blackWhite = blackWhite;
	}

	public BlackWhiteItem getBlackWhite() {
		return blackWhite;
	}

	public void setBlackWhite(BlackWhiteItem blackWhite) {
		this.blackWhite = blackWhite;
	}

}
