package pokemonSearch.items;

public class TypesItem {
	
	private int slot;
	private TypeItem type;
	
	public TypesItem() {
		super();
	}
	
	public TypesItem(int slot, TypeItem type) {
		super();
		this.slot = slot;
		this.type = type;
	}

	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

	public TypeItem getType() {
		return type;
	}

	public void setType(TypeItem type) {
		this.type = type;
	}

}
