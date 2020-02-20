package com.gettingstarted.JSAlerts;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/javascript_alerts")
class AlertsPage extends PageObject {

    @FindBy(xpath = "//button[contains(text(), 'Click for JS Alert')]")
    private WebElementFacade regularAlertButton;

    @FindBy(xpath = "//button[contains(text(), 'Click for JS Confirm')]")
    private WebElementFacade confirmAlertButton;

    @FindBy(xpath = "//button[contains(text(), 'Click for JS Prompt')]")
    private WebElementFacade promptAlertButton;

    public void handlingAlert() {
        open();

        // Selenium
        /*Alert alert = getDriver().switchTo().alert();
        alert.accept();*/

        // SERENITY WAY -- using getAlert() method
        //Regular Alert
        regularAlertButton.click(); //first let's click the Alert
        System.out.println(getAlert().getText()); // getting the alert text
        getAlert().accept();

        // Confirm Alert
        confirmAlertButton.click();
        getAlert().dismiss(); // clicking cancel button

        promptAlertButton.click();
        getAlert().sendKeys("Hi");
        getAlert().accept();
    }
}