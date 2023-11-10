package Command;

public class TurnOffCommand implements Command{
    

    private Televisao televisao;

    public TurnOffCommand(Televisao televisao){
        this.televisao = televisao;
    }
    public void execute(){
        televisao.turnOff();
    }
    public void undo(){
        televisao.turnOn();
    }
}
