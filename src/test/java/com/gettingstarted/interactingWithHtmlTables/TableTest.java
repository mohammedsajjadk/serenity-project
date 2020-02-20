package com.gettingstarted.interactingWithHtmlTables;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class TableTest {

    @Managed
    WebDriver driver;

    TablePage tablePage;

    @Test
    public void tc1() {
//        tablePage.readCompleteTable();
//        tablePage.extractFilteredRowsFromTable();
//        tablePage.extractRowsBasedOnConditions();
//        tablePage.extractHeadings();
//        tablePage.extractAllRows();
        tablePage.assertOnTableElements();
    }
}