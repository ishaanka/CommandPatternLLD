package AC;

public class TurnOnCommand implements ICommand {
    AirConditioner ac;

    public TurnOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    public void execute() {
        ac.turnOn();
    }

    public void redo() {
        ac.turnOn();
    }

    public void undo() {
        ac.turnOff();
    }
}
