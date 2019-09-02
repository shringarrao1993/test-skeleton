package first_test;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Defines the xpath of various page objects used in FirstTestFunctions class
public class LandingPage extends PageObject {

    final static Logger LOG = LoggerFactory.getLogger(LandingPage.class);

    @FindBys({@FindBy(xpath= Path.LandingPage.googleInputItem)})
    public WebElement googleInputItem;

    @FindBys({@FindBy(xpath= Path.LandingPage.bingInputItem)})
    public WebElement bingInputItem;

    @FindBys({@FindBy(xpath= Path.LandingPage.ecosiaInputItem)})
    public WebElement ecosiaInputItem;

}
