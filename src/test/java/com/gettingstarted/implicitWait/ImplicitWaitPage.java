package com.gettingstarted.implicitWait;

    import net.serenitybdd.core.pages.PageObject;
    import net.thucydides.core.annotations.DefaultUrl;

    import java.util.concurrent.TimeUnit;

@DefaultUrl("/dynamic_loading/2")
class ImplicitWaitPage extends PageObject {

    public void implicitWait() {
        open();
        try {
//            setImplicitTimeout(8, TimeUnit.SECONDS);
        } finally {
            resetImplicitTimeout(); // Will reset it to the implicitly wait mentioned in serenity.properties or else
            // 2 seconds
        }
    }

}