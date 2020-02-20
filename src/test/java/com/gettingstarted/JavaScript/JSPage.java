package com.gettingstarted.JavaScript;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class JSPage extends PageObject {

    public void executeJS() {
        open();

        evaluateJavascript("alert('This is alert')");
        getAlert().accept(); // accepting the alert box

        // Identifying element using JS
        evaluateJavascript("document.querySelector(\"a[href='/abtest']\").click()");

        // Similar like above
        WebElement abLink = (WebElement) evaluateJavascript("return document.querySelector(\"a[href='/abtest']\")");
        abLink.click();

        // Printing all the links using JS
        List<WebElement> links = (List<WebElement>) evaluateJavascript("return document.getElementsByTagName(\"a\");");
        links.forEach(e -> System.out.println(e.getText()));
    }
}
