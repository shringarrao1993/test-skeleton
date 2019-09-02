package first_test;

//Defines various xpath variables used in Page object definition in LandingPage class
public interface Path{

    interface LandingPage{
        String googleInputItem  = "(//input)[3]";
        String bingInputItem    = "(//input[contains(@class,'searchbox')])[1]";
        String ecosiaInputItem  = "(//input[contains(@placeholder,'plant trees')])[1]";
    }

    interface ResultPage {
        String googleResultSearchBar = "//input[@title='Suche']";
        String googleResultTitle = "//h1[.='Suchergebnisse']//ancestor::div[1]//div[@class='ellip']";
        String googleResultBold = "//h1[.='Suchergebnisse']//ancestor::div[1]//em";

        String bingAndEcosiaResultSearchBar = "(//input[@type='search'])[1]";
        String bingResultTitle = "//main[@aria-label='Search Results']//ol[contains(@id,'results')]//h2//a[1]";
        String bingResultBold = "//main[@aria-label='Search Results']//ol[contains(@id,'results')]//p//strong";

        String ecosiaResultTitle = "//div[@class='result-firstline-title']//a";
        String ecosiaResultBold = "//p[@class='result-snippet']//b";
    }
}
