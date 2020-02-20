package com.gettingstarted.interactingWithRadioButtons;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webelements.RadioButtonGroup;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButtonsPage extends PageObject {
    @FindBy(name = "gender")
    private List<WebElement> radioButtons; //note it is web element

    public void radioButtonTest() {
        //Notice that there is no @DefaultUrl bcos we are navigating to different url
        getDriver().get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");

        // Method 1 --> inRadioButtonGroup method (pass the name of the group)
        inRadioButtonGroup("gender").selectByValue("Female");
        System.out.println(inRadioButtonGroup("gender").getSelectedValue().get()); //Female

        // Method 2 --> RadioButtonGroup class where you need to pass List of WebElement
        RadioButtonGroup group = new RadioButtonGroup(radioButtons); // we need to pass webelement
        group.selectByValue("Male");
        System.out.println(group.getSelectedValue().get()); //Male
    }
}
