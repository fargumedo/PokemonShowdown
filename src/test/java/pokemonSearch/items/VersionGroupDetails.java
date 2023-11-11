package pokemonSearch.items;

public class VersionGroupDetails {
	
	@JsonProperty("level_learned_at")
	private int levelLearnedAt;
	@JsonProperty("move_learn_method")
	private MoveLearnMethod moveLearnMethod;
	@JsonProperty("version_group")
	private VersionGroup versionGroup;
	
	public VersionGroupDetails() {
		super();
	}
	
	public VersionGroupDetails(int levelLearnedAt, MoveLearnMethod moveLearnMethod, VersionGroup versionGroup) {
		super();
		this.levelLearnedAt = levelLearnedAt;
		this.moveLearnMethod = moveLearnMethod;
		this.versionGroup = versionGroup; 
	}

	public int getLevelLearnedAt() {
		return levelLearnedAt;
	}

	public void setLevelLearnedAt(int levelLearnedAt) {
		this.levelLearnedAt = levelLearnedAt;
	}

	public MoveLearnMethod getMoveLearnMethod() {
		return moveLearnMethod;
	}

	public void setMoveLearnMethod(MoveLearnMethod moveLearnMethod) {
		this.moveLearnMethod = moveLearnMethod;
	}

	public VersionGroup getVersionGroup() {
		return versionGroup;
	}

	public void setVersionGroup(VersionGroup versionGroup) {
		this.versionGroup = versionGroup;
	}

}
