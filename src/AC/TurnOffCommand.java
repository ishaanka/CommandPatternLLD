package AC;

public class TurnOffCommand implements ICommand {
    AirConditioner ac;

    public TurnOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    public void execute() {
        ac.turnOff();
    }

    public void redo() {
        ac.turnOff();
    }

    public void undo() {
        ac.turnOn();
    }

}
