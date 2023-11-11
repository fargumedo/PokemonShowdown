package pokemonSearch.items;

public class StatsItem {
	
	@JsonProperty("base_stat")
	private int baseStat;
	private int effort;
	private StatItem stat;
	
	public StatsItem() {
		super();
	}
	
	public StatsItem(int baseStat, int effort, StatItem stat) {
		super();
		this.baseStat = baseStat;
		this.effort = effort;
		this.stat = stat;
	}

	public int getBaseStat() {
		return baseStat;
	}

	public void setBaseStat(int baseStat) {
		this.baseStat = baseStat;
	}

	public int getEffort() {
		return effort;
	}

	public void setEffort(int effort) {
		this.effort = effort;
	}

	public StatItem getStat() {
		return stat;
	}

	public void setStat(StatItem stat) {
		this.stat = stat;
	}

}
