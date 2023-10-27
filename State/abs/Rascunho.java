public class Rascunho extends Estado {


    public void publica(){
        Estado estado = new Revisao();
        estado.setDoc(super.getDoc());
        super.getDoc().setEstado(estado);
    }
}
