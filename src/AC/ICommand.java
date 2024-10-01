package AC;

public interface ICommand {
    public void execute();
    public void redo();
    public void undo();
}
