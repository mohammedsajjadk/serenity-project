package com.gettingstarted.tests;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LocatorExamplesPage extends PageObject {

    public void clickOnLink() {
        open(); // this will open the url provided in serenity.properties
        WebElement link = getDriver().findElement(By.xpath("//a[@href='/abtest']"));
        link.click();
    }

    public void grabAllLinks() {
        List<WebElement> links = getDriver().findElements(By.tagName("a"));
        for (WebElement link : links) {
            System.out.println(link.getText());
        }
    }
}
