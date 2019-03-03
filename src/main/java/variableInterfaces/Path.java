package variableInterfaces;

public interface Path {
    public interface FirstTestHome{
        String googleInputItem = "(//input)[3]";
        String bingInputItem = "(//input[contains(@class,'searchbox')])[1]";
        String ecosiaInputItem = "(//input[contains(@placeholder,'plant trees')])[1]";
    }
    public interface FirstTestResult{

    }
}
