package variable_interfaces;

//Defines various xpath variables used in Page object definition in FirstTestPage class
public interface Path {

    public interface FirstTestHome{

        String googleInputItem  = "(//input)[3]";
        String bingInputItem    = "(//input[contains(@class,'searchbox')])[1]";
        String ecosiaInputItem  = "(//input[contains(@placeholder,'plant trees')])[1]";
    }
    public interface FirstTestResult{

    }
}
