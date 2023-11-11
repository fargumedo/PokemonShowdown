package pokemonSearch.items;

public class AbilitiesItem {
	
	private AbilityItem ability;
	@JsonProperty("is_hidden")
	private boolean isHidden;
	private int slot;
	
	public AbilitiesItem() {
		super();
	}
	
	public AbilitiesItem(AbilityItem ability, boolean isHidden, int slot) {
		super();
		this.ability = ability;
		this.isHidden = isHidden;
		this.slot = slot;
	}

	public AbilityItem getAbility() {
		return ability;
	}

	public void setAbility(AbilityItem ability) {
		this.ability = ability;
	}

	public boolean isHidden() {
		return isHidden;
	}

	public void setHidden(boolean isHidden) {
		this.isHidden = isHidden;
	}

	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

}
