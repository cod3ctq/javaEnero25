public class Main {
    public static void main(String[] args) {
Celular c1 = new Celular();
c1.llamar("2227101388");
c1.mandarMensaje("2227101388","Hola mundo");
//En las clases , si no se  agrega explicitamente un constructor
        //Java le otorga el vacio por default
        Smartphone sm = new Smartphone();
   // sm.llamar("2227101388");
    sm.mandarMensaje("2227101388","me puedes llamar");

  /*  Object[] valores = new Object[10]
            valores [0]="jugar";
            valores [2]=1245;
            valores[3]=false;

            */

    }
}
/*
ABSTRACCIOBN: Sintetizacion de aquellas cosas reelevantes para el modelo
es obtener caracteristicas principales para aquel objeto que lo vuelve ese tipo de objetos
 */