public class Rascunho implements Estado {

    private Documento doc;

    public void setDoc(Documento doc){
        this.doc = doc;
    }

    public void publica(){
        Estado estado = new Revisao();
        estado.setDoc(this.doc);
        this.doc.setEstado(estado);
    }
}
