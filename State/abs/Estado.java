public abstract class Estado {

    private Documento doc;

    public void publica(){
        //nao faz nd
    }

    public void setDoc(Documento doc){
        this.doc = doc;
    }

    public Documento getDoc(){
        return this.doc;
    }
}
