package pokemonSearch.items;

public class Generation7Item {
	
	private IconsItem icons;
	@JsonProperty("ultra-sun-ultra-moon")
	private UltraSunUltraMoonItem ultraSunUltraMoon;
	
	public Generation7Item() {
		super();
	}
	
	public Generation7Item(IconsItem icons, UltraSunUltraMoonItem ultraSunUltraMoon) {
		super();
		this.icons = icons;
		this.ultraSunUltraMoon = ultraSunUltraMoon;
	}

	public IconsItem getIcons() {
		return icons;
	}

	public void setIcons(IconsItem icons) {
		this.icons = icons;
	}

	public UltraSunUltraMoonItem getUltraSunUltraMoon() {
		return ultraSunUltraMoon;
	}

	public void setUltraSunUltraMoon(UltraSunUltraMoonItem ultraSunUltraMoon) {
		this.ultraSunUltraMoon = ultraSunUltraMoon;
	}

}
