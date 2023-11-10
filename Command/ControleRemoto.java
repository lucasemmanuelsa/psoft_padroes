package Command;

public class ControleRemoto{

    private Command command;
    private HistoricoComando historico;

    public void setCommand(Command command){
        this.command = command;
        this.historico = new HistoricoComando();
    }

    public void executeCommand(){
        this.command.execute();
        this.historico.push(command);
    }

    public void undo(){
        command = this.historico.pop();
        command.undo();
    }
}