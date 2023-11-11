package pokemonSearch.items;

public class Generation3Item {
	
	private EmeraldItem emerald;
	@JsonProperty("firered-leafgreen")
	private FireredLeafgreenItem fireredLeafgreen;
	@JsonProperty("ruby-sapphire")
	private RubySapphireItem rubySapphire;
	
	public Generation3Item() {
		super();
	}
	
	public Generation3Item(EmeraldItem emerald, FireredLeafgreenItem fireredLeafgreen, RubySapphireItem rubySapphire) {
		super();
		this.emerald = emerald;
		this.fireredLeafgreen = fireredLeafgreen;
		this.rubySapphire = rubySapphire;
	}

	public EmeraldItem getEmerald() {
		return emerald;
	}

	public void setEmerald(EmeraldItem emerald) {
		this.emerald = emerald;
	}

	public FireredLeafgreenItem getFireredLeafgreen() {
		return fireredLeafgreen;
	}

	public void setFireredLeafgreen(FireredLeafgreenItem fireredLeafgreen) {
		this.fireredLeafgreen = fireredLeafgreen;
	}

	public RubySapphireItem getRubySapphire() {
		return rubySapphire;
	}

	public void setRubySapphire(RubySapphireItem rubySapphire) {
		this.rubySapphire = rubySapphire;
	}

}
