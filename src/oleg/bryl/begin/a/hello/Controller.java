package oleg.bryl.begin.a.hello;

import java.util.Scanner;

public class Controller {
    String HELLO = "Hello";
    String WORLD = "world!";

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        model.setValue(inputStrValueWithScanner(scanner));

        view.printMassageAndInt(View.OUR_TEXT, model.getValue());


    }

    public String inputStrValueWithScanner(Scanner scanner) {
        StringBuilder stringBuilder = new StringBuilder();
        view.printMassage(View.INPUT_FIRST_WORD);
        while (!scanner.hasNext(HELLO)) {
            view.printMassage(View.WRONG_INPUT_WORD_DATA + View.INPUT_FIRST_WORD);
            scanner.next();
        }
        stringBuilder.append(scanner.next());
        stringBuilder.append(" ");
        view.printMassage(View.INPUT_SECOND_WORD);
        while (!scanner.hasNext(WORLD)) {
            view.printMassage(View.WRONG_INPUT_WORD_DATA + View.INPUT_FIRST_WORD);
            scanner.next();
        }
        stringBuilder.append(scanner.next());
        return stringBuilder.toString();

    }
}
