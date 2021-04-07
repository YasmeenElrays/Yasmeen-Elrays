package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase{
    public SearchPage(WebDriver driver) {
        super(driver);
        scroll = (JavascriptExecutor)driver;
    }
    @FindBy(xpath = "//input[@class=\"gLFyf gsfi\"]")
    WebElement searchField;
    @FindBy(xpath = "//div[contains(@class,'IsZv')][contains(.,'Instabug')]")
    public WebElement searchResult;
    @FindBy(xpath = "//div[@class=\"sbtc\"][contains(.,\"testing\")]")
    public WebElement MatchedWords;
    @FindBy(xpath = "//a[@href=\"https://www.cdc.gov/coronavirus/2019-ncov/symptoms-testing/testing.html\"]")
    WebElement clickOnSearchResults;
    @FindBy(xpath = "//input[@class=\"gLFyf gsfi\"][@value=\"Testing\"]")
    public WebElement TextBoxData;
    @FindBy(xpath = "//div[@class=\"clear-button XoaYSb\"][@role=\"button\"]")
    public WebElement clearIcon;
    @FindBy(id="result-stats")
    public WebElement numberOfSearchResultsDisplayed;
    @FindBy(xpath = "//input[@class=\"gLFyf gsfi\"][@value=\"Testing\"]")
    public WebElement SearchTextTry;




    public void SearchResults(){
        searchField.sendKeys("InstaBug");
        searchField.sendKeys(Keys.ENTER);
        searchField.clear();
    }
    public void SuggestedWords(){
        searchField.sendKeys("Testing");
    }
    public void searchTestBox(){
        searchField.sendKeys(Keys.ENTER);
        clickOnSearchResults.click();
        driver.navigate().back();
    }
    public void ClearIconFunctionality(){
        clearIcon.click();
    }

}
