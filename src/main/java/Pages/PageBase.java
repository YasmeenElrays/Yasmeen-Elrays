package Pages;

import DriverBase.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase extends Base {
    public JavascriptExecutor scroll;

    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
    public void ScrollDown() {
        scroll.executeScript("window.scrollBy(0,350)");
    }

    public void ScrollUp() {
        scroll.executeScript("window.scrollBy(0,-350)");
    }

}


