package pokemonSearch.items;

import java.util.ArrayList;

public class HeldItem {
	
	private Item item;
	@JsonProperty("version_details")
	private ArrayList<VersionDetails> versionDetails = new ArrayList<VersionDetails>();
	
	public HeldItem() {
		super();
	}
	
	public HeldItem(Item item, ArrayList<VersionDetails> versionDetails) {
		super();
		this.item = item;
		this.versionDetails = versionDetails;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public ArrayList<VersionDetails> getVersionDetails() {
		return versionDetails;
	}

	public void setVersionDetails(ArrayList<VersionDetails> versionDetails) {
		this.versionDetails = versionDetails;
	}

}
