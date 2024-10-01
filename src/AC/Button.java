package AC;

public class Button {
    ICommand command;

    public Button(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

    public void undo() {
        command.undo();
    }
}
