package Command;

public class TurnOnCommand implements Command{
    

    private Televisao televisao;

    public TurnOnCommand(Televisao televisao){
        this.televisao = televisao;
    }
    public void execute(){
        televisao.turnOn();
    }
    public void undo(){
        this.televisao.turnOff();
    }
}
