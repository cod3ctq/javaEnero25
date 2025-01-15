public class Main {
    public static void main(String[] args) {

        Celular c1 = new Celular();
        //c1.llamar("12344");
        //c1.mandarMensaje("12345343","hola");

        // En la clase, si no se agrega explicitamente un constructor
        // Java le otorga el vacio por default

        Smartphone sm = new Smartphone();

        // sm.getSo();

        //sm.llamar("462355");

        sm.mandarMensaje("234637362","Hola");

        // Object es la base de todos los demás objetos,
        // no hay una algo abajo de eso

        Object[] valores = new Object[10];

        valores[0] = "Hola";
        valores[1] = 25363;
        valores[2] = 'x';
        valores[3] = true;
        valores[4] = 10.78;

    }
}