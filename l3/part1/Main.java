//
public class Main
{
    static String text = "test(test)test";
    static String chars = "()";

    public static void main(String[] args)
    {
        Executor prog = new Executor();
        prog.Execute(text, chars);

        prog.delCharsFromStr();
        prog.getWordsCountFromStr();
    }
}