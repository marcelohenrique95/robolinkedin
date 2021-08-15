package br.com.nomad.batch;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.TimerTask;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

@Component
public class BotNomad extends TimerTask {

	public static Robot robot;

	public static WebDriver driver;
	public static WebDriverWait aWebDriverWait;

	public static String[] args;

	public void carregarDriverNavegador() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

		System.out.println(BotNomad.class.getName() + ": " + new Date() + " -- Abrindo navegador...");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login/pt");
		driver.findElement(By.id("username")).sendKeys("marcelohenrique8061@gmail.com" + Keys.TAB);
		driver.findElement(By.id("password")).sendKeys("mama14789" + Keys.TAB);
		Thread.sleep(2000);
	}

	public void loginLinkedin() throws Exception {
		robot.mouseMove(124, 500);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
