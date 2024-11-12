import controller.Controller;
import model.Rules;
import view.View;

public class Main {
    public static void main(String[] args) throws Exception {
        Rules rules = new Rules();
        View view = new View();
        Controller controller = new Controller(rules, view);
        controller.StartGame();
        }
    }
