package org.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Lorsque;
import cucumber.api.java.fr.Soit;

import static org.junit.Assert.*;

public class AnnotationSteps {
	
//	private String login;
//	private String mdp;
	WebDriver driver;
	
	@Soit("un utilisateur enregistré.")
	public void utilisateurConnecte() {

	}

	@Lorsque("je me connecte avec le login {string} et le mot de passe {string}.")
	public void connexion(String login, String mdp) {
		System.setProperty("webdriver.gecko.driver", "src/test/resources/squash/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demo-release.kieker-monitoring.net/jpetstore/actions/Account.action;jsessionid=14l5cpjmmenif158ppkx8hchpd?signonForm=");
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(login);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(mdp);
		driver.findElement(By.name("signon")).click();
	}

	@Alors("le pet store s'affiche.")
	public void le_pet_store_s_affiche() {
		assertTrue(driver.findElement(By.id("WelcomeContent")).getText().contains("Welcome ABC!"));
		driver.quit();
	}

}