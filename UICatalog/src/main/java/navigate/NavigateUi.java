package navigate;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;


public class NavigateUi extends CommonAPI {

    public void home()throws InterruptedException{

        List<WebElement> elements = new ArrayList<WebElement>();
        sleep(1);
        //store mobile elements into ArrayList
        elements = ad.findElements(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell"));
        sleep(1);

        for(int i=1; i<elements.size(); i++){
            //click on each elements
            clickByXpath("//XCUIElementTypeCell["+i+"]");
            clickByXpath("//UIAApplication[1]/UIAWindow[2]/UIANavigationBar[1]/UIAButton[1]");
        }
    }
}
