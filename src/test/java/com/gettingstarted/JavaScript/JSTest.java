package com.gettingstarted.JavaScript;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class JSTest {
    @Managed
    WebDriver driver;

    private JSPage page;

    @Test
    public void tc1() {
        page.executeJS();
    }
}