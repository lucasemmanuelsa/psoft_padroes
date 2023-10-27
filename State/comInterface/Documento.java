public class Documento {
    private Estado estado;


    public Documento(Estado estado){
        this.estado = estado;
        estado.setDoc(this);
    }

    public Documento(){
        this.estado = new Rascunho();
        estado.setDoc(this);
    }

    public void publica(){
        this.estado.publica();
    }

    public void setEstado(Estado estado){
        this.estado = estado;
    };

    public Estado getEstado(){
        return this.estado;
    }
    public void disp(){
        if(this.estado instanceof Publicado){
            System.out.println("Publicado");
        }
        else{
            if(this.estado instanceof Rascunho){
                System.out.println("Rascunho");
            }else{
                System.out.println("Revisão");
            }
            
        }
    }
}
