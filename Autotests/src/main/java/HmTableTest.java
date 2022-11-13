import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HmTableTest {

    WebDriver driver;
    WebElement tableElement;




    public HmTableTest(WebElement tableElement, WebDriver driver) {
        this.tableElement = tableElement;
        this.driver = driver;
    }

    public List<WebElement> getRowsH() {
        List<WebElement> rows = tableElement.findElements(By.xpath("//table[@data-tablesearch-id='0']//tr"));
        rows.remove(0);
        return rows;
    }

    public List<WebElement> getHeadingsH() {
        WebElement headingsRow = tableElement.findElement(By.xpath("//thead[@class='stickToTop']//tr[1]"));
        List<WebElement> headingsCols = headingsRow.findElements(By.xpath("//thead[@class='stickToTop']//tr[1]/th"));
        return headingsCols;
    }

    public List<List<WebElement>> getRowsWithColsH() {
        List<WebElement> rows = getRowsH();
        List<List<WebElement>> rowsWithCols = new ArrayList<List<WebElement>>();
        for (WebElement row : rows) {
            List<WebElement> rowWithCols = row.findElements(By.xpath("//table[@data-tablesearch-id='0']//tr/td"));
            rowsWithCols.add(rowWithCols);
        }
        return rowsWithCols;
    }

    public List<Map<String, WebElement>> getRowsWithColsByHeadingsH() {
        List<List<WebElement>> rowsWithCols = getRowsWithColsH();
        List<Map<String, WebElement>> rowsWithColsByHeadings = new ArrayList<Map<String, WebElement>>();
        Map<String, WebElement> rowByHeadings;
        List<WebElement> headingCols = getHeadingsH();
        for (List<WebElement> row : rowsWithCols) {
            rowByHeadings = new HashMap<String, WebElement>();
            for (int i = 0; i < headingCols.size(); i++) {
                String heading = headingCols.get(i).getText();
                WebElement cell = row.get(i);
                rowByHeadings.put(heading, cell);
            }
            rowsWithColsByHeadings.add(rowByHeadings);
        }
        return rowsWithColsByHeadings;
    }

    public String getValueFromCellH(int rowNumber, int colNumber) {
        List<List<WebElement>> rowsWithCols = getRowsWithColsH();
        WebElement cell = rowsWithCols.get(rowNumber - 1).get(colNumber - 1);
        return cell.getText();
    }


    public String getValueFromCellH(int rowNumber, String colName) {
        List<Map<String, WebElement>> rowsWithColsByHeadings = getRowsWithColsByHeadingsH();
        return rowsWithColsByHeadings.get(rowNumber - 1).get(colName).getText();
    }
}
