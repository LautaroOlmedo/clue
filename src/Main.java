import controller.Controller;
import model.Rules;
import view.GameFrame;

public class Main {
    public static void main(String[] args) throws Exception {
        Rules rules = new Rules();
        GameFrame gameFrame = new GameFrame();
        Controller controller = new Controller(rules, gameFrame);
        controller.StartGame();
        }
    }
