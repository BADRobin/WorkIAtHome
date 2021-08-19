package oleg.bryl.begin.a.hello;


import java.util.Scanner;

public class Model{
    String HELLO = "Hello";
    String WORLD = "world!";


    private String value;



    public String getValue() {
        return value;
    }

    public void setValue(String valueText) {
        this.value = valueText;
    }
    public String inputStrValueWithScanner(Scanner scanner) {
        StringBuilder stringBuilder = new StringBuilder();
        View.printMassage(View.INPUT_FIRST_WORD);
        while (!scanner.hasNext(HELLO)) {
            View.printMassage(View.WRONG_INPUT_WORD_DATA + View.INPUT_FIRST_WORD);
            scanner.next();
        }
        stringBuilder.append(scanner.next());
        stringBuilder.append(" ");
        View.printMassage(View.INPUT_SECOND_WORD);
        while (!scanner.hasNext(WORLD)) {
            View.printMassage(View.WRONG_INPUT_WORD_DATA + View.INPUT_FIRST_WORD);
            scanner.next();
        }
        stringBuilder.append(scanner.next());
        return stringBuilder.toString();

    }


}

