package com.gettingstarted.actions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

class MouseActionsPage extends PageObject {

    @FindBy(xpath = "//button[contains(text(), 'Click for JS Alert')]")
    private WebElementFacade regularAlertButton;

    public void mouseHoverExample() {
        getDriver().get("https://the-internet.herokuapp.com/hovers");

        WebElementFacade image = findBy("//div[@class='example']//img");

        //We need to use withAction method
        //moving to element
        withAction().moveToElement(image).build().perform();

        //once we hover over, if we need to see if the text appears, then click on the link
        waitForTextToAppear("name: user1").findBy("//a[@href='/users/1").click();
    }

    public void dragAndDropExample() {
        getDriver().get("http://jqueryui.com/droppable/");
        WebElementFacade iframeElement = $("//iframe[@src='/resources/demos/droppable/default.html']");

        getDriver().switchTo().frame(iframeElement);

        withAction().dragAndDrop($("//*[@id='draggable']"), $("//*[@id='droppable']")).build().perform();
    }
}