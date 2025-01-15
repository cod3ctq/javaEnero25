public class Main {
    public static void main(String[] args) {


        Celular c1 =new Celular();
        c1.LLamar("5525275054");
        //c1.mandarMensaje("5525275054","Hola a todos");

        //En las clases, si no se agrega explicitamente un constructor
        //Java le otorga el vacio por default
        Smartphone sm = new Smartphone();
        sm.LLamar("5525275054");
        sm.mandarMensaje("5525275055","Hola a todos");
        /*
        Abtraccion: a la sintetizacion de aquellas cosas relevantes para el modelo.
        Es una clase: es una plantilla
        GET: y SET:  Son los mecanismos para establecer y recuperar valores hacia y desde los objetos
        Herencia: Sirve para absorver los atributos y metodos de una clase padre a una clase hija
        Sobreescritura: redefinir la logica de un metodo ya existente
        la *sobrecarga* de metodos se refiere a la distinta cantidad orden y tipos de los argumentos dados a un metodo

         */

    }
}