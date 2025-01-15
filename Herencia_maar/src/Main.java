public class Main {
    public static void main(String[] args) {

        Celular c1 = new Celular();
//        c1.llamada("11111111");
//        c1.mensaje("11111111","hola");

        //en las clases donde no se define un constructor, Java agrega un constructor vacio por default
        Smartphone sm = new Smartphone();
//        sm.llamada("11111111");
//        sm.mensaje("11111111", "hola");

        Pda pd = new Pda();

    }
}

//en java solo existe la herencia simple
//una clase puede ser heredada por una o más clases (una superclase puede tener varias subclases)

//todas las clases heredan de object

//no existe la multiherencia

//una subclase no puede tener varias superclases

