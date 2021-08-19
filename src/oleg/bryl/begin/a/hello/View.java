package oleg.bryl.begin.a.hello;


public class View {

    public static final String INPUT_FIRST_WORD = "Input 'Hello' please = ";
    public static final String INPUT_SECOND_WORD = "Input 'world!' please = ";
    public static final String WRONG_INPUT_WORD_DATA = "Wrong input!!! Do better please -> ";
    public static final String OUR_TEXT = "Text is  = ";

    public static void printMassage(String massage) {
        System.out.println(massage);
    }

    public void printMassageAndInt(String massage, String value) {
        System.out.println(massage + value);
        System.out.println("Congratulations. Hooray!!!");
    }

}
