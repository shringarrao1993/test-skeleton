package functions;

import org.openqa.selenium.By;
import pages.FirstTestPage;
import utility.Wait;
import variableInterfaces.Constant;
import variableInterfaces.Path;

//Defines various methods called in the FirstTestSteps class
public class FirstTestFunctions {

    private Wait wait;
    private FirstTestPage firstTestPage;

    public  void clickInputItem(){
        if (Constant.searchEngine.equalsIgnoreCase("google")){
            System.out.println("Search engine is: " + Constant.searchEngine);
            wait.waitUntilElementIsClickable(By.xpath(Path.FirstTestHome.googleInputItem)).click();
        }else if (Constant.searchEngine.equalsIgnoreCase("bing")){
            System.out.println("Search engine is: " + Constant.searchEngine);
            wait.waitUntilElementIsClickable(By.xpath(Path.FirstTestHome.bingInputItem)).click();
        }else if (Constant.searchEngine.equalsIgnoreCase("ecosia")){
            System.out.println("Search engine is: " + Constant.searchEngine);
            wait.waitUntilElementIsClickable(By.xpath(Path.FirstTestHome.ecosiaInputItem)).click();
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
