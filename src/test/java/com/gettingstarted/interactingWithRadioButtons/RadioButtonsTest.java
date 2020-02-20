package com.gettingstarted.interactingWithRadioButtons;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RadioButtonsTest {

    @Managed
    WebDriver driver;

    RadioButtonsPage radioButtonsPage;

    @Test
    public void tc1() {
        radioButtonsPage.radioButtonTest();
    }
}
