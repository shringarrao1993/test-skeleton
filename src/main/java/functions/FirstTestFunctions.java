package functions;

import pages.FirstTestPage;
import utility.Wait;
import variableInterfaces.Constant;

//Defines various methods called in the FirstTestSteps class
public class FirstTestFunctions {

    private Wait wait;
    private FirstTestPage firstTestPage;

    public  void clickInputItem(){
        if (Constant.searchEngine.equalsIgnoreCase("google")){
            wait.waitUntilElementIsClickable(firstTestPage.googleInputItem).click();
        }else if (Constant.searchEngine.equalsIgnoreCase("bing")){
            wait.waitUntilElementIsClickable(firstTestPage.bingInputItem).click();
        }else if (Constant.searchEngine.equalsIgnoreCase("ecosia")){
            wait.waitUntilElementIsClickable(firstTestPage.ecosiaInputItem).click();
        }
    }

    public void setInputItem(String value){
        if (Constant.searchEngine.equalsIgnoreCase("google")){
            wait.waitUntilElementIsVisible(firstTestPage.googleInputItem).sendKeys(value);
        }else if (Constant.searchEngine.equalsIgnoreCase("bing")){
            wait.waitUntilElementIsVisible(firstTestPage.bingInputItem).sendKeys(value);
        }else if (Constant.searchEngine.equalsIgnoreCase("ecosia")){
            wait.waitUntilElementIsVisible(firstTestPage.ecosiaInputItem).sendKeys(value);
        }
    }
}
