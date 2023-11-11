package pokemonSearch.items;

public class Generation1Item {
	
	@JsonProperty("red-blue")
	private RedBlueItem redBlue;
	private YellowItem yellow;
	
	public Generation1Item() {
		super();
	}
	
	public Generation1Item(RedBlueItem redBlue, YellowItem yellow) {
		super();
		this.redBlue = redBlue;
		this.yellow = yellow;
	}

	public RedBlueItem getRedBlue() {
		return redBlue;
	}

	public void setRedBlue(RedBlueItem redBlue) {
		this.redBlue = redBlue;
	}

	public YellowItem getYellow() {
		return yellow;
	}

	public void setYellow(YellowItem yellow) {
		this.yellow = yellow;
	}

}
