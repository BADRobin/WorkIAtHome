package oleg.bryl.begin.a.hello;

import java.util.Scanner;

public class Controller extends Model{


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


}
