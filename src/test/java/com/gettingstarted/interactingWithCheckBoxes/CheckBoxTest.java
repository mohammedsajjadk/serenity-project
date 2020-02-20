package com.gettingstarted.interactingWithCheckBoxes;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckBoxTest {

    @Managed
    WebDriver driver;

    CheckBoxPage checkBoxPage;

    @Test
    public void tc1() {
        checkBoxPage.checkBoxTest();
    }
}
