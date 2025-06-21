package com.nithin.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.nithin.driver.Driver;

public final class LoginPageTest extends BaseTests {

	private LoginPageTest() {

	}

	@Test
	public void test1() {
//		Driver.initDriver();

		Driver.driver.findElement(By.name("q")).sendKeys("Ball", Keys.ENTER);

	}

}
