package Command;

import java.util.LinkedList;

public class HistoricoComando {
    private LinkedList<Command> comandos;

    public HistoricoComando(){
        this.comandos = new LinkedList<>();
    }

    public Command pop(){
        return this.comandos.pop();
    }
    public void push(Command command){
        this.comandos.add(command);
    }
}
