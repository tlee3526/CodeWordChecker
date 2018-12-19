public class CodeWordChecker
{
    private int min;
    private int max;
    private String not;
    private codeWordChecker(int min, int max, String not)
    {
        this.min = min;
        this.max = max;
        this.not = not;
    }
    public codeWordChecker(String not)
    {
        this.not = not;
        this.min = 6;
        this.max = 20;
    }
    public boolean isvalid(String check)
    {
        
    }
}
