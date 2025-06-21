package com.nithin.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	private static WebDriver driver;

	public static void initDriver() {
		if (Objects.isNull(driver)) {
			driver = new ChromeDriver();
			DriverManager.setDriver(driver);
			DriverManager.getDriver().get("https://www.google.com/");
			DriverManager.getDriver().manage().window().maximize();
		}

	}

	public static void quitDriver() {
		if (Objects.nonNull(driver)) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}

	}

}
