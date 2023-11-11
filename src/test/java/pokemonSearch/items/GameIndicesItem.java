package pokemonSearch.items;

public class GameIndicesItem {
	
	@JsonProperty("game_index")
	private int gameIndex;
	private VersionItem item;
	
	public GameIndicesItem() {
		super();
	}
	
	public GameIndicesItem(int gameIndex, VersionItem item) {
		super();
		this.gameIndex = gameIndex;
		this.item = item;
	}

	public int getGameIndex() {
		return gameIndex;
	}

	public void setGameIndex(int gameIndex) {
		this.gameIndex = gameIndex;
	}

	public VersionItem getItem() {
		return item;
	}

	public void setItem(VersionItem item) {
		this.item = item;
	}

}
