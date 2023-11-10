package Command;

public class Televisao {

    private int volume;

    public Televisao(){
        this.volume = 0;
    }

    public void turnOn(){
        System.out.println("Tv ligada");
    }

    public void turnOff(){
        System.out.println("Tv desligada");
    }

    public void volumeUp(){
        if(volume == 100){
            System.out.println("Já está no máximo");
            return;
        }
        volume++;
        System.out.println("volume aumentado para: " + volume);
    }

    public void volumeDown(){
        if(volume == 0){
            System.out.println("Já está no mínimo");
            return;
        }
        volume--;
        System.out.println("volume diminuido para: " + volume);
    }

}
