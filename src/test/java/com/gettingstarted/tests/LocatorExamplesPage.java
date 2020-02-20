package com.gettingstarted.tests;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
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

    public void serenity_clickOnLink() {
        open(); // this will open the url provided in serenity.properties
//        WebElementFacade link = find(By.cssSelector("//a[href='/abtest']"));
//        WebElementFacade link = findBy("//a[@href='/abtest']");
        WebElementFacade link = $("//a[@href='/abtest']");
//        link.getWrappedElement();
        link.click();
    }

    public void serenity_grabAllLinks() {
        List<WebElementFacade> links = findAll(By.tagName("a"));
        for (WebElement link : links) {
            System.out.println(link.getText());
        }
    }
}