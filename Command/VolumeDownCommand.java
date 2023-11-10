package Command;

public class VolumeDownCommand implements Command{
    private Televisao televisao;

    public VolumeDownCommand(Televisao televisao){
        this.televisao = televisao;
    }
    public void execute(){
        televisao.volumeDown();
    }
    public void undo(){
        televisao.volumeUp();
    }
}
