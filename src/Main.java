import AC.AirConditioner;
import AC.Button;
import AC.TurnOffCommand;
import AC.TurnOnCommand;

public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        TurnOffCommand turnOffCommand = new TurnOffCommand(ac);
        TurnOnCommand turnOnCommand = new TurnOnCommand(ac);
        Button turnOnButton = new Button(turnOnCommand);
        turnOnButton.pressButton();
        turnOnButton.undo();
    }
}