package com.gettingstarted.FileUpload;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class FileUploadTest {
    @Managed
    WebDriver driver;

    private FileUploadPage page;

    @Test
    public void tc1() {
        page.fileUpload();
    }
}