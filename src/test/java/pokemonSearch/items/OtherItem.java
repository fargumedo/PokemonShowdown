package pokemonSearch.items;

public class OtherItem {
	
	@JsonProperty("dream_world")
	private DreamWorldItem dreamWorldItem;
	private HomeItem homeItem;
	@JsonProperty("official-artwork")
	private OfficialArtworkItem officialArtworkItem;
	
	public OtherItem() {
		super();
	}
	
	public OtherItem(DreamWorldItem dreamWorldItem, HomeItem homeItem, OfficialArtworkItem officialArtworkItem) {
		super();
		this.dreamWorldItem = dreamWorldItem;
		this.homeItem = homeItem;
		this.officialArtworkItem = officialArtworkItem;
	}

	public DreamWorldItem getDreamWorld() {
		return dreamWorldItem;
	}

	public void setDreamWorld(DreamWorldItem dreamWorldItem) {
		this.dreamWorldItem = dreamWorldItem;
	}

	public HomeItem getHome() {
		return homeItem;
	}

	public void setHome(HomeItem homeItem) {
		this.homeItem = homeItem;
	}

	public OfficialArtworkItem getOfficialArtwork() {
		return officialArtworkItem;
	}

	public void setOfficialArtwork(OfficialArtworkItem officialArtworkItem) {
		this.officialArtworkItem = officialArtworkItem;
	}

}
