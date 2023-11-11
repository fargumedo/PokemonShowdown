package pokemonSearch.items;

import java.util.ArrayList;

public class MovesItem {
	
	private MoveItem move;
	@JsonProperty("version_group_details")
	private ArrayList<VersionGroupDetails> versionGroupDetails = new ArrayList<VersionGroupDetails>();
	
	public MovesItem() {
		super();
	}
	
	public MovesItem(MoveItem move, ArrayList<VersionGroupDetails> versionGroupDetails) {
		super();
		this.move = move;
		this.versionGroupDetails = versionGroupDetails;
	}

	public MoveItem getMove() {
		return move;
	}

	public void setMove(MoveItem move) {
		this.move = move;
	}

	public ArrayList<VersionGroupDetails> getVersionGroupDetails() {
		return versionGroupDetails;
	}

	public void setVersionGroupDetails(ArrayList<VersionGroupDetails> versionGroupDetails) {
		this.versionGroupDetails = versionGroupDetails;
	}

}
