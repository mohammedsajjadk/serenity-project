package com.gettingstarted.FileUpload;

import java.io.File;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/upload")
class FileUploadPage extends PageObject {

    public void fileUpload() {
        open();
        String filePath = System.getProperty("user.dir") + File.separator + "serenity.properties";
        upload(filePath).to($("#file-upload"));
        $("#file-submit").click();
    }
}