package pokemonSearch.response;

import pokemonSearch.items.*;
import java.util.ArrayList;

public class PokemonSearchResponse {
	
	private ArrayList<AbilitiesItem> abilitiesItem = new ArrayList<AbilitiesItem>();
	@JsonProperty("base_experience")
	private int baseExperience;
	private ArrayList<FormsItem> forms = new ArrayList<FormsItem>();
	@JsonProperty("game_indices")
	private ArrayList<GameIndicesItem> gameIndices = new ArrayList<GameIndicesItem>();
	private int height;
	@JsonProperty("held_items")
	private ArrayList<HeldItem> heldItems = new ArrayList<HeldItem>();
	private int id;
	@JsonProperty("is_default")
	private boolean isDefault;
	@JsonProperty("location_area_encounters")
	private String locationAreaEncounters;
	private ArrayList<MovesItem> moves = new ArrayList<MovesItem>();
	private String name;
	private String order;
	@JsonProperty("past_abilities")
	private ArrayList<PastAbilitiesItem> pastAbilities = new ArrayList<PastAbilitiesItem>();
	@JsonProperty("past_types")
	private ArrayList<PastTypesItem> pastTypes = new ArrayList<PastTypesItem>();
	private SpeciesItem species;
	private SpritesItem sprites;
	private ArrayList<StatsItem> stats = new ArrayList<StatsItem>();
	private ArrayList<TypesItem> types = new ArrayList<TypesItem>();
	private int weight;
	
	public PokemonSearchResponse() {
		super();
	}
	
	public PokemonSearchResponse(ArrayList<AbilitiesItem> abilities, int baseExperience, ArrayList<FormsItem> forms, ArrayList<GameIndicesItem> gameIndices, 
			int height, ArrayList<HeldItem> heldItems, int id, boolean isDefault, String locationAreaEncounters, ArrayList<MovesItem> moves, 
			String name, String order, ArrayList<PastAbilitiesItem> pastAbilities, ArrayList<PastTypesItem> pastTypes, SpeciesItem species, 
			SpritesItem sprites, ArrayList<StatsItem> stats, ArrayList<TypesItem> types, int weight) {
		super();
		this.abilitiesItem = abilities;
		this.baseExperience = baseExperience;
		this.forms = forms;
		this.gameIndices = gameIndices;
		this.height = height;
		this.heldItems = heldItems;
		this.id = id;
		this.isDefault = isDefault;
		this.locationAreaEncounters = locationAreaEncounters;
		this.moves = moves;
		this.name = name;
		this.order = order;
		this.pastAbilities = pastAbilities;
		this.pastTypes = pastTypes;
		this.species = species;
		this.sprites = sprites;
		this.stats = stats;
		this.types = types;
		this.weight = weight;
	}

	public ArrayList<AbilitiesItem> getAbilitiesItem() {
		return abilitiesItem;
	}

	public void setAbilitiesItem(ArrayList<AbilitiesItem> abilitiesItem) {
		this.abilitiesItem = abilitiesItem;
	}

	public int getBaseExperience() {
		return baseExperience;
	}

	public void setBaseExperience(int baseExperience) {
		this.baseExperience = baseExperience;
	}

	public ArrayList<FormsItem> getForms() {
		return forms;
	}

	public void setForms(ArrayList<FormsItem> forms) {
		this.forms = forms;
	}

	public ArrayList<GameIndicesItem> getGameIndices() {
		return gameIndices;
	}

	public void setGameIndices(ArrayList<GameIndicesItem> gameIndices) {
		this.gameIndices = gameIndices;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public ArrayList<HeldItem> getHeldItems() {
		return heldItems;
	}

	public void setHeldItems(ArrayList<HeldItem> heldItems) {
		this.heldItems = heldItems;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getLocationAreaEncounters() {
		return locationAreaEncounters;
	}

	public void setLocationAreaEncounters(String locationAreaEncounters) {
		this.locationAreaEncounters = locationAreaEncounters;
	}

	public ArrayList<MovesItem> getMoves() {
		return moves;
	}

	public void setMoves(ArrayList<MovesItem> moves) {
		this.moves = moves;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public ArrayList<PastAbilitiesItem> getPastAbilities() {
		return pastAbilities;
	}

	public void setPastAbilities(ArrayList<PastAbilitiesItem> pastAbilities) {
		this.pastAbilities = pastAbilities;
	}

	public ArrayList<PastTypesItem> getPastTypes() {
		return pastTypes;
	}

	public void setPastTypes(ArrayList<PastTypesItem> pastTypes) {
		this.pastTypes = pastTypes;
	}

	public SpeciesItem getSpecies() {
		return species;
	}

	public void setSpecies(SpeciesItem species) {
		this.species = species;
	}

	public SpritesItem getSprites() {
		return sprites;
	}

	public void setSprites(SpritesItem sprites) {
		this.sprites = sprites;
	}

	public ArrayList<StatsItem> getStats() {
		return stats;
	}

	public void setStats(ArrayList<StatsItem> stats) {
		this.stats = stats;
	}

	public ArrayList<TypesItem> getTypes() {
		return types;
	}

	public void setTypes(ArrayList<TypesItem> types) {
		this.types = types;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
