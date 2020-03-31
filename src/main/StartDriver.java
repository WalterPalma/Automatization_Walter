package main;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartDriver {

	WebDriver driver = null;

	private String dir = "./driver/chromedriver.exe";

	public WebDriver firefoxAccess() {

		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		/* Instância do Driver */
		driver = new FirefoxDriver();
		/* Acessar a Pagina */
		driver.get("http://automationpractice.com/");/* Aqui acesará o host do ambiente */
		driver.manage().window().maximize();
		return driver;
	}

	public WebDriver chromeAccess() {

			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			/* Instância do Driver */
			driver = new ChromeDriver();
			/* Acessar a Pagina */
			driver.get("http://automationpractice.com/");/* Aqui acesará o host do ambiente */
			//driver.manage().window().maximize();
			
		return driver;
	}

}
