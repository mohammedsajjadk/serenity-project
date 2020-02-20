package com.gettingstarted.implicitWait;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ImplicitWaitTest {
    @Managed
    WebDriver driver;

    private ImplicitWaitPage page;

    @Test
    public void tc1() {
        page.implicitWait();
    }
}