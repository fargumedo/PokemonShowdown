package pokemonSearch.items;

public class Generation4Item {
	
	@JsonProperty("diamond-pearl")
	private DiamondPearlItem diamondPearl;
	@JsonProperty("heartgold-soulsilver")
	private HeartgoldSoulsilverItem heartgoldSoulsilver;
	private PlatinumItem platinum;
	
	public Generation4Item() {
		super();
	}
	
	public Generation4Item(DiamondPearlItem diamondPearl, HeartgoldSoulsilverItem heartgoldSoulsilver, PlatinumItem platinum) {
		super();
		this.diamondPearl = diamondPearl;
		this.heartgoldSoulsilver = heartgoldSoulsilver;
		this.platinum = platinum;
	}

	public DiamondPearlItem getDiamondPearl() {
		return diamondPearl;
	}

	public void setDiamondPearl(DiamondPearlItem diamondPearl) {
		this.diamondPearl = diamondPearl;
	}

	public HeartgoldSoulsilverItem getHeartgoldSoulsilver() {
		return heartgoldSoulsilver;
	}

	public void setHeartgoldSoulsilver(HeartgoldSoulsilverItem heartgoldSoulsilver) {
		this.heartgoldSoulsilver = heartgoldSoulsilver;
	}

	public PlatinumItem getPlatinum() {
		return platinum;
	}

	public void setPlatinum(PlatinumItem platinum) {
		this.platinum = platinum;
	}

}
