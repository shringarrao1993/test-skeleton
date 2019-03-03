package utility;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Wait extends PageObject{

    FluentWait<WebDriver> wait;

    public Wait(WebDriver driver) {
        super(driver);
        this.wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(1000))
                .withMessage("Fluent Wait - 30 second timeout / 1 second polling")
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
    }

    public WebElement waitUntilElementIsPresent(final By locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public WebElement waitUntilElementIsVisible(final By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitUntilElementIsClickable(final By locator){
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void clickUntilSuccessful(WebElement element){
        boolean action = false;
        while(!action){
            try {
                element.click();
                action = true;
            }catch (Exception e){

            }
        }
    }

    public WebElement waitUntilElementIsClickable(WebElement element){
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public Boolean waitUntilElementIsInvisible(final By locator){
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public WebElement waitUntilElementIsVisible(WebElement element){
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilElementIsNotPresent(final By locator){
        while(getDriver().findElements(locator).size() > 0){
            waitABit(1000);
        }
    }

    public void waitFor(long milliseconds){
        waitABit(milliseconds);
    }

    public void until(final By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        waitABit(2000);
    }

    public void untilTextIsPresentInElement(WebElement webElement, String text){
        wait.until(ExpectedConditions.textToBePresentInElement(webElement, text));
    }

}
