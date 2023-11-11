package pokemonSearch.items;

public class Generation2Item {
	
	private CrystalItem crystal;
	private GoldItem gold;
	private SilverItem silver;
	
	public Generation2Item() {
		super();
	}
	
	public Generation2Item(CrystalItem crystal, GoldItem gold, SilverItem silver) {
		super();
		this.crystal = crystal;
		this.gold = gold;
		this.silver = silver;
	}

	public CrystalItem getCrystal() {
		return crystal;
	}

	public void setCrystal(CrystalItem crystal) {
		this.crystal = crystal;
	}

	public GoldItem getGold() {
		return gold;
	}

	public void setGold(GoldItem gold) {
		this.gold = gold;
	}

	public SilverItem getSilver() {
		return silver;
	}

	public void setSilver(SilverItem silver) {
		this.silver = silver;
	}

}
