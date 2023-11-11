package pokemonSearch.items;

public class RedBlueItem {
	
	@JsonProperty("back_default")
	private String backDefault;
	@JsonProperty("back_gray")
	private String backGray;
	@JsonProperty("back_transparent")
	private String backTransparent;
	@JsonProperty("front_default")
	private String frontDefault;
	@JsonProperty("front_gray")
	private String frontGray;
	@JsonProperty("front_transparent")
	private String frontTransparent;
	
	public RedBlueItem() {
		super();
	}
	
	public RedBlueItem(String backDefault, String backGray, String backTransparent, String frontDefault, String frontGray, 
			String frontTransparent) {
		super();
		this.backDefault = backDefault;
		this.backGray = backGray;
		this.backTransparent = backTransparent;
		this.frontDefault = frontDefault;
		this.frontGray = frontGray;
		this.frontTransparent = frontTransparent;
	}

	public String getBackDefault() {
		return backDefault;
	}

	public void setBackDefault(String backDefault) {
		this.backDefault = backDefault;
	}

	public String getBackGray() {
		return backGray;
	}

	public void setBackGray(String backGray) {
		this.backGray = backGray;
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

	public String getFrontGray() {
		return frontGray;
	}

	public void setFrontGray(String frontGray) {
		this.frontGray = frontGray;
	}

	public String getFrontTransparent() {
		return frontTransparent;
	}

	public void setFrontTransparent(String frontTransparent) {
		this.frontTransparent = frontTransparent;
	}

}
