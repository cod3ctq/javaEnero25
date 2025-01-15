import java.util.Scanner;

public class Smartphone extends Celular {
    //Parte 1: Reutilizacion y absorcion de codigo
    //Parte 2: Especializacion del modelo


    String so;  //Android   ISO
//    Camara cam; //pixeles, iso, res, dista, aper
//    Procesador procesador; // #nucles,frecuancia, fabricante, cache
//
    public Smartphone(){

    }

    public Smartphone(String marca, String modelo, String color, String materiales, String so) {
        super(marca, modelo, color, materiales); // ES LA LLAMANDA AL CONSTRUCTOR PADRE
        this.so = so;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "so='" + so + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", materiales='" + materiales + '\'' +
                '}';
    }
    //Sobre escritura: Comportamiento de la forma 2
    /*
    La sobre escritura es la modifcacion de la logica
    que actua al interior del metodo.
     */
    @Override //<----- Indica la sobreescritura
    public void LLamar(String numero){
        Scanner sc = new Scanner(System.in);
        System.out.println("LLanada por medio de: ");
        System.out.println("1. Red del operador");
        System.out.println("2. Whatsapp");
        System.out.println("3, Telegram");
        System.out.println("4. Messenger");
        System.out.println("Selecciona una opcion: ");
        int seleccion = sc.nextInt();
        switch (seleccion){
            case 1:
                System.out.println("llamando por Red del Operador al: " + numero);
                break;
            case 2:
                System.out.println("llamando por Whatsapp al: " + numero);
                break;
            case 3:
                System.out.println("llamando por Telegram al: " + numero);
                break;
            case 4:
                System.out.println("llamando por Messenger al: " + numero);
                break;
        }
    }
    @Override
    public void mandarMensaje(String numero, String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mandando mensaje por medio de: ");
        System.out.println("1. Red del operador");
        System.out.println("2. Whatsapp");
        System.out.println("3, Telegram");
        System.out.println("4. Messenger");
        System.out.println("Selecciona una opcion: ");
        int seleccion = sc.nextInt();
        switch (seleccion){
            case 1:
                System.out.println("Mandando mensaje por Red del Operador al: " + numero + " Mensaje: "+ mensaje);
                break;
            case 2:
                System.out.println("Mandando mensaje por Whatsapp al: " + numero + " Mensaje: "+ mensaje);
                break;
            case 3:
                System.out.println("Mandando mensaje por Telegram al: " + numero + " Mensaje: "+ mensaje);
                break;
            case 4:
                System.out.println("Mandando mensaje por Messenger al: " + numero + " Mensaje: "+ mensaje);
                break;
        }

    }
}
