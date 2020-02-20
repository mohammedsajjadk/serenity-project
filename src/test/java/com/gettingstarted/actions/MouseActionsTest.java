package com.gettingstarted.actions;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class MouseActionsTest {
    @Managed
    WebDriver driver;

    private MouseActionsPage page;

    @Test
    public void tc1() {

//        page.mouseHoverExample();
        page.dragAndDropExample();
    }
}