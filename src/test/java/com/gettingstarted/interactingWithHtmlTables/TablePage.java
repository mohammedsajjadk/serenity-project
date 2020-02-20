package com.gettingstarted.interactingWithHtmlTables;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.components.HtmlTable;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import static net.thucydides.core.matchers.BeanMatchers.the;
import static net.thucydides.core.pages.components.HtmlTable.inTable;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.equalTo;

@DefaultUrl("/tables")
public class TablePage extends PageObject {
    @FindBy(how = How.ID, using = "table2")
    protected WebElementFacade table;

    // Read the complete table as a List of Key Value Pairs
    public void readCompleteTable() {
        open();
        List<Map<Object, String>> tb1 = HtmlTable.rowsFrom(table);
        System.out.println(tb1);
    }

    // Read rows which do not have headings
    public void extractWithNoHeadings() {
        open();
        List<Map<Object, String>> tb1 =
            HtmlTable.withColumns("Last Name", "First Name", "Email", "Due").readRowsFrom(table);
        System.out.println(tb1);
    }

    //extracting specific row based on its header and the text - METHOD 1
    public void extractFilteredRowsFromTable() {
        open();
        List<WebElement> rowValues = HtmlTable.filterRows(table, the("Email", endsWith("yahoo.com")));
        rowValues.forEach(e -> System.out.println(e.getText()));
    }

    //extracting specific row based on its header and the text - METHOD 2
    public void extractRowsBasedOnConditions() {
        open();
        inTable(table).getRowElementsWhere(the("First Name", equalTo("Frank"))).stream().forEach(e -> System.out.println(e.getText()));
    }

    //extract all the headings from table
    public void extractHeadings() {
        open();
        List<String> headings = inTable(table).getHeadings();
        headings.forEach(e -> System.out.println(e));
    }

    //extract all rows except heading
    public void extractAllRows() {
        open();
        List<WebElement> headings = inTable(table).getRowElements();
        headings.forEach(e -> System.out.println(e.getText()));
    }

    public void assertOnTableElements() {
        open();
        //METHOD 1 : shouldHaveRowElementsWhere
        inTable(table).shouldHaveRowElementsWhere(the("First Name", equalTo("Frank"))); //Pass

        //METHOD 2 : shouldNotHaveRowElementsWhere
        inTable(table).shouldNotHaveRowElementsWhere(the("First Name", equalTo("Frank"))); //Fail
    }
}
