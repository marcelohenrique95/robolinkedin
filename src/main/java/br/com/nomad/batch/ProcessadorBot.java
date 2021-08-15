package br.com.nomad.batch;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("br.com.nomad.batch")
@SpringBootApplication
public class ProcessadorBot implements CommandLineRunner {

	@Value("${tempo.intervaloAntesDeExecutar}")
	private long intervaloDeTempoAntesdeExecutar;
	@Value("${tempo.intervaloDeCadaExecucao}")
	private long intervaloDeTempoEntreCadaExecucao;
	@Value("${tempo.contarEm}")
	private String contarEm;
	public static WebDriver driver;
	public static WebDriverWait aWebDriverWait;
	public static Robot robot;

	@Autowired
	BotNomad botNomad;

	public void initConfig() {
		if (contarEm != null && contarEm.equals("minutos")) {
			intervaloDeTempoEntreCadaExecucao = TimeUnit.MINUTES.toMillis(intervaloDeTempoEntreCadaExecucao);
			intervaloDeTempoAntesdeExecutar = TimeUnit.MINUTES.toMillis(intervaloDeTempoAntesdeExecutar);
		} else {
			intervaloDeTempoEntreCadaExecucao = TimeUnit.HOURS.toMillis(intervaloDeTempoEntreCadaExecucao);
			intervaloDeTempoAntesdeExecutar = TimeUnit.HOURS.toMillis(intervaloDeTempoAntesdeExecutar);
		}
	}

	public static void main(String[] args) throws AWTException, IOException {

		try {
			SpringApplication.run(ProcessadorBot.class, args);
			loadDriverChrome();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void loadDriverChrome() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IURK\\Documents\\Projetos-Auctus\\chromedriver.exe");

		System.out.println("Abrindo navegador...");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Abrindo Linkedin...");
		driver.get("https://www.linkedin.com/login/pt");
		driver.findElement(By.id("username")).sendKeys("marcelohenrique8061@gmail.com" + Keys.TAB);
		driver.findElement(By.id("password")).sendKeys("mama14789" + Keys.TAB);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		openProfile();

	}

	public static void openProfile() throws Exception {
		System.out.println("Abrindo primeiro perfil encontrado...");
		driver.findElement(By.xpath("//a[contains(@href, 'miniProfileUrn')]")).click();
		Thread.sleep(6000);
		System.out.println("Abrindo informações de contato...");
//		driver.get("https://www.linkedin.com/in/alexcollareda");
		driver.findElement(By.xpath("//a[contains(@href, 'detail/contact-info')]")).click();
		saveCsv();
	}
	

	public static void saveCsv() throws Exception {
		String emailFind = driver.findElement(By.xpath("//section[@class='pv-contact-info__contact-type ci-email']")).getAttribute("href");
		System.out.println("Print E-MAIL" + emailFind);

		if (existsElement(emailFind)) {
			System.out.println("Salvando email em CSV");

		} else {
			System.out.println("Não tem email disponível.");
		}

	}

	private static boolean existsElement(String email) {
		boolean exists = false;
		if(email != null) {
			exists = true;
		}
		return exists;
	}

	@Override
	public void run(String... args) {
		this.initConfig();

	}

}
