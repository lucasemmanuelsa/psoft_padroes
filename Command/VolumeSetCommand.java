package Command;

public class VolumeSetCommand implements Command{
    
    private Televisao televisao;
    private int volume;
    private int volumeAnterior;

    public VolumeSetCommand(Televisao televisao, int volume){
        this.televisao = televisao;
        this.volume = volume;
    }
    public void execute(){
        volumeAnterior = televisao.getVolume();
        televisao.setVolume(volume);
        System.out.println("Volume colocado para: " + volume);
    
    }

    public void undo(){
        televisao.setVolume(volumeAnterior);
        System.out.println("Volume colocado para: " + volumeAnterior);
    }

}
