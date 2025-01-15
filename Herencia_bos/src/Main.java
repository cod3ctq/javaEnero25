import com.base.Celular;
import com.base.Smartphone;

public class Main {
    public static void main(String[] args){

        Celular c1 = new Celular();


        //c1.llamar("098765432");
        //c1.mandarMensaje("123456789", "hola");

        //En java las clases , si no se agrega explicitamente
        //java le otOrga el vacio por default

        Smartphone sm=new Smartphone();
        //sm.llamar("398798792");
        sm.mandarMensaje("398798792", "Hola como te va");



    }
}
