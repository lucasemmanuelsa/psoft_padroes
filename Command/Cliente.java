package Command;

public class Cliente {
    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        ControleRemoto controleRemoto = new ControleRemoto();

        TurnOnCommand turnon = new TurnOnCommand(televisao);
        TurnOffCommand turnoff = new TurnOffCommand(televisao);

    
        VolumeUpCommand volumeUpCommand = new VolumeUpCommand(televisao);
        VolumeDownCommand volumeDownCommand = new VolumeDownCommand(televisao);
        
        controleRemoto.setCommand(turnon);
        controleRemoto.executeCommand();

        controleRemoto.setCommand(turnoff);
        controleRemoto.executeCommand();

        controleRemoto.setCommand(volumeUpCommand);
        controleRemoto.executeCommand();

        controleRemoto.setCommand(volumeDownCommand);
        controleRemoto.executeCommand();

        System.out.println("---------Desfazendo----------");
        controleRemoto.undo();

        controleRemoto.setCommand(turnon);
        controleRemoto.executeCommand();
        System.out.println("---------Desfazendo----------");
        controleRemoto.undo();

        System.out.println("--------Testando volume--------");
        VolumeSetCommand volumeSetCommand = new VolumeSetCommand(televisao, 20);
        controleRemoto.setCommand(volumeSetCommand);
        controleRemoto.executeCommand();

        System.out.println("----------Desfazendo---------");
        controleRemoto.undo();

        controleRemoto.undo();


    }
}
