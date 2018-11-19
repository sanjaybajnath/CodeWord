public class CodeWordChecker implements StringChecker{
    private int num1;
    private int num2;
    private String word;

    public CodeWordChecker(String word){
        this.num1 = 6;
        this.num2 = 20;
        this.word = word;
    }
    public CodeWordChecker(int num1, int num2, String word){
        this.num1 = num1;
        this.num2 = num2;
        this.word = word;
    }

    public boolean isValid(String str){
        if(str.length()>=num1 && str.length()<=num2&&str.indexOf(word)==-1){
            return true;
        }
        return false;
    }
}
