public class Teste {
    public static void main(String[] args) {
        System.out.println("===========Teste Construtor padrão com default aplicado=============");
        Documento doc = new Documento();
        doc.disp();
        doc.publica();
        doc.disp();
        doc.publica();
        doc.disp();


        System.out.println("================Teste passando estado no construtor==============");
        Estado estado = new Rascunho();
        Documento doc2 = new Documento(estado);
        doc2.disp();
        doc2.publica();
        doc2.disp();
        doc2.publica();
        doc2.disp();

        System.out.println("================Teste passando estado (Revisao já) no construtor==============");
        Estado estado2 = new Revisao();
        Documento doc3 = new Documento(estado2);
        doc3.disp();
        doc3.publica();
        doc3.disp();
        doc3.publica();
        doc3.disp();
    }
}
