package com.gettingstarted.explicitWait;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ExplicitWaitTest {
    @Managed
    WebDriver driver;

    private ExplicitWaitPage page;

    @Test
    public void tc1() {
        page.explicitWaitExamples();
    }
}