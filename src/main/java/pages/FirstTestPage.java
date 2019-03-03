package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utility.Wait;
import variableInterfaces.Constant;
import variableInterfaces.Path;
import variableInterfaces.URL;

public class FirstTestPage extends PageObject {

    private Wait wait;
    Constant constant;

    final static Logger LOG = LoggerFactory.getLogger(FirstTestPage.class);

    @FindBys({@FindBy(xpath= Path.FirstTestHome.googleInputItem)})
    WebElement googleInputItem;

    @FindBys({@FindBy(xpath= Path.FirstTestHome.bingInputItem)})
    WebElement bingInputItem;

    @FindBys({@FindBy(xpath= Path.FirstTestHome.ecosiaInputItem)})
    WebElement ecosiaInputItem;

    public  void clickInputItem(){
        if (constant.searchEngine.equalsIgnoreCase("google")){
            wait.waitUntilElementIsClickable(googleInputItem).click();
        }else if (constant.searchEngine.equalsIgnoreCase("bing")){
            wait.waitUntilElementIsClickable(bingInputItem).click();
        }else if (constant.searchEngine.equalsIgnoreCase("ecosia")){
            wait.waitUntilElementIsClickable(ecosiaInputItem).click();
        }
    }

    public void setInputItem(String value){
        if (constant.searchEngine.equalsIgnoreCase("google")){
            wait.waitUntilElementIsVisible(googleInputItem).sendKeys(value);
        }else if (constant.searchEngine.equalsIgnoreCase("bing")){
            wait.waitUntilElementIsVisible(bingInputItem).sendKeys(value);
        }else if (constant.searchEngine.equalsIgnoreCase("ecosia")){
            wait.waitUntilElementIsVisible(ecosiaInputItem).sendKeys(value);
        }
    }
}
