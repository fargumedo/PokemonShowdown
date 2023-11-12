package pokemon.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import pokemon.stepDefinitions.JsonExtraction;

public class PokemonSearchFirefox {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Browser Drivers\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://dex.pokemonshowdown.com/");
		driver.manage().window().maximize();
		
		//SEARCH POKEMON BY NAME
		WebElement search = driver.findElement(By.xpath("//*[@name='q']"));
		search.sendKeys("Ditto");
		
		//EXTRACT OF POKEMON ABILITIES AND STATS
		WebElement pokeDesc = driver.findElement(By.xpath("//a[@data-entry='pokemon|Ditto']//descendant::span[@class='col pokemonnamecol']"));
		pokeDesc.click();
		
		WebElement pokemonName = driver.findElement(By.xpath("//body/div[3]/div[1]/h1[1]/a[1]"));
		String pokeName = pokemonName.getText();	
		System.out.println(pokeName);
		
		WebElement pokeHP = driver.findElement(By.xpath("//td[@class='stat']"));
		String pokeHealth = pokeHP.getText();
		int pokeHP2 = Integer.parseInt(pokeHealth);
		System.out.println(pokeHP2);
		
		WebElement pokeAttack = driver.findElement(By.xpath("//tbody/tr[2]/td[1]"));
		String pokePower = pokeAttack.getText();
		int pokeAtt = Integer.parseInt(pokePower);
		System.out.println(pokeAtt);
		
		WebElement pokeDefense = driver.findElement(By.xpath("//tbody/tr[4]/td[1]"));
		String pokeThoughness = pokeDefense.getText();
		int pokeDef = Integer.parseInt(pokeThoughness);
		System.out.println(pokeDef);
		
		WebElement pokeSpAtk = driver.findElement(By.xpath("//tbody/tr[5]/td[1]"));
		String pokeSpAttack = pokeSpAtk.getText();
		int pokeSpecialAtt = Integer.parseInt(pokeSpAttack);
		System.out.println(pokeSpecialAtt);
		
		WebElement pokeSpDef = driver.findElement(By.xpath("//tbody/tr[6]/td[1]"));
		String pokeSpDefense = pokeSpDef.getText();
		int pokeSpecialDef = Integer.parseInt(pokeSpDefense);
		System.out.println(pokeSpecialDef);
		
		WebElement pokeSpeed = driver.findElement(By.xpath("//tbody/tr[7]/td[1]"));
		String pokeVel = pokeSpeed.getText();
		int pokeSpd = Integer.parseInt(pokeVel);
		System.out.println(pokeSpd);
		
		WebElement pokeAbility1 = driver.findElement(By.cssSelector("dd[class='imgentry']>a[data-target='push']"));
		String pokeH1 = pokeAbility1.getText();
		System.out.println(pokeH1);
		
		WebElement pokeAbility2 = driver.findElement(By.cssSelector("div.pfx-panel:nth-child(3) div.pfx-body.dexentry dl.abilityentry:nth-child(7) dd.imgentry:nth-child(2) a:nth-child(2) > em:nth-child(1)"));
		String pokeH2 = pokeAbility2.getText();
		System.out.println(pokeH2);
		
		//ABILITIES AND STATS VALIDATION AGAINST API
		
		JsonExtraction pokemon = new JsonExtraction(pokeName, pokeHP2, pokeAtt, pokeDef, pokeSpecialAtt, pokeSpecialDef, 
				pokeSpd, pokeH1, pokeH2);
		
		int hpPK = pokemon.PokemonHP();
		
	}

}
