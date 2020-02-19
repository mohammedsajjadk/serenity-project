package com.gettingstarted.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LocatorExamplesTest {
    @Managed
    WebDriver driver;

    LocatorExamplesPage page;

    @Test
    public void tc1() {
        page.clickOnLink();
        page.grabAllLinks();
    }
}