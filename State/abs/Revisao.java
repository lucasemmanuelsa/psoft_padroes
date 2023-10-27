public class Revisao extends Estado{


    public void publica(){
        Estado estado = new Publicado();
        estado.setDoc(super.getDoc());
        super.getDoc().setEstado(estado);
    }
}
