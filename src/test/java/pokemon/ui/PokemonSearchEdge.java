package pokemon.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PokemonSearchEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Browser Drivers\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();

		driver.get("https://dex.pokemonshowdown.com/");
		driver.manage().window().maximize();

		// SEARCH POKEMON BY NAME
		WebElement search = driver.findElement(By.xpath("//*[@name='q']"));
		search.sendKeys("Ditto");

		// EXTRACT OF POKEMON ABILITIES AND STATS
		WebElement pokeDesc = driver.findElement(
				By.xpath("//a[@data-entry='pokemon|Ditto']//descendant::span[@class='col pokemonnamecol']"));
		pokeDesc.click();

		WebElement pokeHP = driver.findElement(By.xpath("//td[@class='stat']"));
		String pokeHealth = pokeHP.getText();
		System.out.println(pokeHealth);

		WebElement pokeAttack = driver.findElement(By.xpath("//tbody/tr[2]/td[1]"));
		String pokePower = pokeAttack.getText();
		System.out.println(pokePower);

		WebElement pokeDefense = driver.findElement(By.xpath("//tbody/tr[4]/td[1]"));
		String pokeThoughness = pokeDefense.getText();
		System.out.println(pokeThoughness);

		WebElement pokeSpAtk = driver.findElement(By.xpath("//tbody/tr[5]/td[1]"));
		String pokeSpAttack = pokeSpAtk.getText();
		System.out.println(pokeSpAttack);

		WebElement pokeSpDef = driver.findElement(By.xpath("//tbody/tr[6]/td[1]"));
		String pokeSpDefense = pokeSpDef.getText();
		System.out.println(pokeSpDefense);

		WebElement pokeSpeed = driver.findElement(By.xpath("//tbody/tr[7]/td[1]"));
		String pokeVel = pokeSpeed.getText();
		System.out.println(pokeVel);

//		WebElement pokeAbility = driver.findElement(By.xpath("//em[contains(text(),'Imposter')]"));
		WebElement pokeAbility1 = driver.findElement(By.cssSelector("dd[class='imgentry']>a[data-target='push']"));
		String pokeH1 = pokeAbility1.getText();
		System.out.println(pokeH1);

		WebElement pokeAbility2 = driver
				.findElement(By.cssSelector("dd[class='imgentry']>a[data-target='push']+a[xpath='1']"));
		String pokeH2 = pokeAbility2.getText();
		System.out.println(pokeH2);

		// ABILITIES AND STATS VALIDATION AGAINST API

	}

}
