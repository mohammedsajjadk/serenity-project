package com.gettingstarted.JSAlerts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class AlertsTest {
    @Managed
    WebDriver driver;

    private AlertsPage page;

    @Test
    public void tc1() {
        page.handlingAlert();
    }
}