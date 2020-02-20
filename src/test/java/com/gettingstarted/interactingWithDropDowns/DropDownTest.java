package com.gettingstarted.interactingWithDropDowns;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class DropDownTest {

    @Managed
    WebDriver driver;

    DropDownPage dropDownPage;

    @Test
    public void tc1() {
        dropDownPage.selectByValue();
    }
}
