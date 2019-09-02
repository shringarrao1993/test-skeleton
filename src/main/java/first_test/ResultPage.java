package first_test;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

//Defines the xpath of various page objects used in FirstTestFunctions class
public class ResultPage extends PageObject {

    final static Logger LOG = LoggerFactory.getLogger(LandingPage.class);

    @FindBys({@FindBy(xpath= Path.ResultPage.googleResultSearchBar)})
    public WebElement googleResultSearchBar;

    @FindBys({@FindBy(xpath= Path.ResultPage.googleResultTitle)})
    public List<WebElement> googleResultTitles;

    @FindBys({@FindBy(xpath= Path.ResultPage.googleResultBold)})
    public List<WebElement> googleResultBoldWords;

    @FindBys({@FindBy(xpath= Path.ResultPage.bingAndEcosiaResultSearchBar)})
    public WebElement bingAndEcosiaResultSearchBar;

    @FindBys({@FindBy(xpath= Path.ResultPage.bingResultTitle)})
    public List<WebElement> bingResultTitles;

    @FindBys({@FindBy(xpath= Path.ResultPage.bingResultBold)})
    public List<WebElement> bingResultBoldWords;

    @FindBys({@FindBy(xpath= Path.ResultPage.ecosiaResultTitle)})
    public List<WebElement> ecosiaResultTitle;

    @FindBys({@FindBy(xpath= Path.ResultPage.ecosiaResultBold)})
    public List<WebElement> ecosiaResultBold;

}