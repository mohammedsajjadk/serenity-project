package com.gettingstarted.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class MyFirstTest {
	@Managed
    WebDriver driver;

	@Title("This is my first Serenity method")
    @Test
    public void navigateToGooglePage() {
        driver.navigate().to("https://www.google.com/");
    }
}
