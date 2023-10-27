public class Revisao implements Estado{

    private Documento doc;

    public void setDoc(Documento doc){
        this.doc = doc;
    }

    public void publica(){
        Estado estado = new Publicado();
        estado.setDoc(this.doc);
        this.doc.setEstado(estado);
    }
}
