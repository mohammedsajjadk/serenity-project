package com.gettingstarted.interactingWithCheckBoxes;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.webelements.Checkbox;

@DefaultUrl("/checkboxes")
public class CheckBoxPage extends PageObject {
    @FindBy(xpath = "//input[@type='checkbox'][1]")
    private WebElementFacade checkbox1;

    @FindBy(xpath = "//input[@type='checkbox'][2]")
    private WebElementFacade checkbox2;

    public void checkBoxTest() {
        open();
        // METHOD 1 --> USING Checkbox class
        Checkbox checkbox = new Checkbox(checkbox1); // you need to provide webElement
        // setChecked(true) --> selects the checkbox (if already checked, then no action)
        // setChecked(false) --> unselect the checkbox
        checkbox.setChecked(true);
        // isChecked --> returns true or false
        System.out.println(checkbox.isChecked());

        // METHOD 2 --> USING setCheckBox method
        setCheckbox(checkbox1, true); //takes webElement and boolean value
    }
}