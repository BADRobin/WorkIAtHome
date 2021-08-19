package oleg.bryl.begin.a.hello;

public class Main {

    public static void main(String[] args) {
//Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
//        run
        controller.processUser();
    }

}
