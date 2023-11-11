package pokemonSearch.items;

public class Generation6Item {
	
	@JsonProperty("omegaruby-alphasapphire")
	private OmegarubyAlphasapphireItem omegarubyAlphasapphire;
	@JsonProperty("x-y")
	private XYItem xy;
	
	public Generation6Item() {
		super();
	}
	
	public Generation6Item(OmegarubyAlphasapphireItem omegarubyAlphasapphire, XYItem xy) {
		super();
		this.omegarubyAlphasapphire = omegarubyAlphasapphire;
		this.xy = xy;
	}

	public OmegarubyAlphasapphireItem getOmegarubyAlphasapphire() {
		return omegarubyAlphasapphire;
	}

	public void setOmegarubyAlphasapphire(OmegarubyAlphasapphireItem omegarubyAlphasapphire) {
		this.omegarubyAlphasapphire = omegarubyAlphasapphire;
	}

	public XYItem getXy() {
		return xy;
	}

	public void setXy(XYItem xy) {
		this.xy = xy;
	}

}
