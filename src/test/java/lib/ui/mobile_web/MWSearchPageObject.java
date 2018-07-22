package lib.ui.mobile_web;

import lib.ui.SearchPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWSearchPageObject extends SearchPageObject
{
    static {
        SEARCH_INIT_ELEMENT = "";
        SEARCH_INPUT = "";
        SEACH_CANCEL_BUTTON = "";
        SEARCH_RESULT_BY_SUBSTRING_TPL = "";
        SEARCH_RESULT_ELEMENT = "";
        SEARCH_EMPTY_RESULT_ELEMENT = "";
    }

    public MWSearchPageObject(RemoteWebDriver driver)
    {
        super(driver);
    }
}
