package com.gettingstarted.interactingWithDropDowns;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.components.Dropdown;

@DefaultUrl("/dropdown")
public class DropDownPage extends PageObject {
    @FindBy(id = "dropdown")
    private WebElementFacade dropdownId;

    public void selectByValue() {
        open();
        Dropdown.forWebElement(dropdownId).selectByValue("2"); //Option 2 will be selected
        // To select the value by visible text
        Dropdown.forWebElement(dropdownId).select("Option 1"); //Option 1 will be selected

        // To select the value by visible text use "selectFromDropdown".
        // This is easy compared to above method
        selectFromDropdown(dropdownId, "Option 2"); //Option 2 will be selected

        // To print the selected Label
        System.out.println(getSelectedLabelFrom(dropdownId)); // Option 2
        System.out.println(getSelectedValueFrom(dropdownId)); // 2
    }
}
