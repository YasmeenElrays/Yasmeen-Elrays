package Tests;

import DriverBase.Base;
import Pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SearchTCs extends Base {
    @Test(priority = 1, description = "Check if Search results displayed should be relevant to search keyword")
    public void CheckSearchResults(){
        SearchPage SearchPageObj=new SearchPage(driver);
        SearchPageObj.SearchResults();
        //assert if the search result contains the text "instabug" that user entered
        Assert.assertTrue(SearchPageObj.searchResult.isDisplayed());
    }
    @Test(priority = 2,description = "Check if user start typing word in textbox ,The suggested words that displayed matches typed keyword")
    public void CheckMatchedWordsDisplayed(){
        SearchPage SearchPageObj=new SearchPage(driver);
        SearchPageObj.SuggestedWords();
        //assert if the suggested Words displayed matches the text entered
        Assert.assertTrue(SearchPageObj.MatchedWords.isDisplayed());
}
    @Test(priority = 3,description =" check  When user clicks on any link from result and navigates back, then Search Text entered should be maintained")
    public void CheckIfSearchTextBoxRestoreTextEntered(){
        SearchPage SearchPageObj=new SearchPage(driver);
        SearchPageObj.searchTestBox();
        //assert if the text the user Entered in Search TextBox is Still displayed If user click on Any search results And Back
        Assert.assertTrue(SearchPageObj.TextBoxData.isDisplayed());
        //assert if Total number of search records/results should be displayed on page
        Assert.assertTrue(SearchPageObj.numberOfSearchResultsDisplayed.isDisplayed());
    }
    @Test(priority = 4,description = "All search keyword should get cleared on clicking Reset button")
    public void CheckClearButtonFunctionality() {
        SearchPage SearchPageObj = new SearchPage(driver);
        SearchPageObj.ClearIconFunctionality();

    }

    }





