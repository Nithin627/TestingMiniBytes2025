package com.nithin.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.nithin.driver.Driver;

public final class HomePageTest extends BaseTests {

	private HomePageTest() {

	}

	@Test
	public void test2() {

		Driver.driver.findElement(By.name("q")).sendKeys("Pen", Keys.ENTER);

	}

}
