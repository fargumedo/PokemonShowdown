package pokemonSearch.items;

public class VersionsItem {
	
	@JsonProperty("generation-i")
	private Generation1Item generation1;
	@JsonProperty("generation-ii")
	private Generation2Item generation2;
	@JsonProperty("generation-iii")
	private Generation3Item generation3;
	@JsonProperty("generation-iv")
	private Generation4Item generation4;
	@JsonProperty("generation-v")
	private Generation5Item generation5;
	@JsonProperty("generation-vi")
	private Generation6Item generation6;
	@JsonProperty("generation-vii")
	private Generation7Item generation7;
	@JsonProperty("generation-viii")
	private Generation8Item generation8;
	
	public VersionsItem() {
		super();
	}
	
	public VersionsItem(Generation1Item generation1, Generation2Item generation2, Generation3Item generation3, Generation4Item generation4, 
			Generation5Item generation5, Generation6Item generation6, Generation7Item generation7, Generation8Item generation8) {
		super();
		this.generation1 = generation1;
		this.generation2 = generation2;
		this.generation3 = generation3;
		this.generation4 = generation4;
		this.generation5 = generation5;
		this.generation6 = generation6;
		this.generation7 = generation7;
		this.generation8 = generation8;
	}

	public Generation1Item getGeneration1() {
		return generation1;
	}

	public void setGeneration1(Generation1Item generation1) {
		this.generation1 = generation1;
	}

	public Generation2Item getGeneration2() {
		return generation2;
	}

	public void setGeneration2(Generation2Item generation2) {
		this.generation2 = generation2;
	}

	public Generation3Item getGeneration3() {
		return generation3;
	}

	public void setGeneration3(Generation3Item generation3) {
		this.generation3 = generation3;
	}

	public Generation4Item getGeneration4() {
		return generation4;
	}

	public void setGeneration4(Generation4Item generation4) {
		this.generation4 = generation4;
	}

	public Generation5Item getGeneration5() {
		return generation5;
	}

	public void setGeneration5(Generation5Item generation5) {
		this.generation5 = generation5;
	}

	public Generation6Item getGeneration6() {
		return generation6;
	}

	public void setGeneration6(Generation6Item generation6) {
		this.generation6 = generation6;
	}

	public Generation7Item getGeneration7() {
		return generation7;
	}

	public void setGeneration7(Generation7Item generation7) {
		this.generation7 = generation7;
	}

	public Generation8Item getGeneration8() {
		return generation8;
	}

	public void setGeneration8(Generation8Item generation8) {
		this.generation8 = generation8;
	}

}
