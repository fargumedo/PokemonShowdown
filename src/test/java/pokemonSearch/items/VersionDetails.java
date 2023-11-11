package pokemonSearch.items;

public class VersionDetails {
	
	private int rarity;
	private VersionItem2 version;
	
	public VersionDetails() {
		super();
	}
	
	public VersionDetails(int rarity, VersionItem2 version) {
		super();
		this.rarity = rarity;
		this.version = version;
	}

	public int getRarity() {
		return rarity;
	}

	public void setRarity(int rarity) {
		this.rarity = rarity;
	}

	public VersionItem2 getVersion() {
		return version;
	}

	public void setVersion(VersionItem2 version) {
		this.version = version;
	}

}
