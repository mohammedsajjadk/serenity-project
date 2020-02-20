package com.gettingstarted.interactingWithEditBox;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class EditBoxTest {

    @Managed
    WebDriver driver;

    EditBoxPage editBoxPage;

    @Test
    public void tc1() {
        editBoxPage.editBoxTest();
    }
}
