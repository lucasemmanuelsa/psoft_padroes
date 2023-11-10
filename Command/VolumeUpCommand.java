package Command;

public class VolumeUpCommand implements Command{

    private Televisao televisao;

    public VolumeUpCommand(Televisao televisao){
        this.televisao = televisao;
    }
    public void execute(){
        televisao.volumeUp();
    }
    
    public void undo(){
        televisao.volumeDown();
    }
}
