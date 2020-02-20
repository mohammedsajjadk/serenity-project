package com.gettingstarted.explicitWait;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

@DefaultUrl("/dynamic_loading/2")
public class ExplicitWaitPage extends PageObject {

    @FindBy(css = "#start > button")
    private WebElementFacade startButton;

    public void explicitWaitExamples() {
        open();

        // METHOD 1 - waitUntilClickable()
        startButton.waitUntilClickable().click();

        // METHOD 2 - withTimeoutOf - you can give wait time here (it is deprecated though)
        startButton.withTimeoutOf(10, TimeUnit.SECONDS).click();

        // METHOD 3 - waitFor - there are so many waitFor methods
        //waitFor with WebElementFacade
        waitFor(startButton).click();

        //waitFor title to appear then wait for element then click
        waitForTitleToAppear("The Internet").waitFor(startButton).click();

        //waitFor specific text to appear
        waitForTextToAppear("Dynamically Loaded Page Elements").waitFor(startButton).click();

        //you can check multiple text
        waitForAllTextToAppear("Dynamically Loaded Page Elements",
            "Example 2: Element rendered after the fact").waitFor(startButton).click();

        waitFor(startButton).click(); // this is just to click the button
        //waitFor specific element to disappear. Can use in case of Ajax where after a element is disappeared,
        //some other element appears and then we also use findBy here and get the text
        String s = waitForAbsenceOf("#loading/img").findBy("(//h4)[2]").getText();
        System.out.println(s);

        // If you want to have customization then use ExpectedConditions inside waitFor
        // (below won't work I just wrote for example)
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("testing123"))).clickOn(startButton);

        // To get the explicit wait timeout set globally or default
        System.out.println(getWaitForTimeout().toString());
    }
}
