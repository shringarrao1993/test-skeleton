package pages.first_test;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import variable_interfaces.Path;

//Defines the xpath of various page objects used in FirstTestFunctions class
public class FirstTestPage extends PageObject {

    final static Logger LOG = LoggerFactory.getLogger(FirstTestPage.class);

    @FindBys({@FindBy(xpath= Path.FirstTestHome.googleInputItem)})
    public WebElement googleInputItem;

    @FindBys({@FindBy(xpath= Path.FirstTestHome.bingInputItem)})
    public WebElement bingInputItem;

    @FindBys({@FindBy(xpath= Path.FirstTestHome.ecosiaInputItem)})
    public WebElement ecosiaInputItem;

}
