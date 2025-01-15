import java.util.Scanner;

// Constructor Hija
public class Smartphone extends Celular{

    // Parte 1: Reutilizacion y absorcion de codigo
    // Parte 2: Especializacion del modelo

    String so;
    // Camara cam; // mpx, iso, res, disF, aper
    // Procesador procesador; // #nuc, frec, fabricante, cache

    public Smartphone(){

    }

    public Smartphone(String marca, String modelo, String color, String materiales, String so) {

        // El "super" es la llamada al constructor Padre

        super(marca, modelo, color, materiales);
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

    // Sobreescritura: Comportamiento de la forma 2:

    @Override // <--- Indica la sobreescritura
    public void llamar(String numero){

        // La sobreescritura es la modificacion de la logica
        // que actua al interior del metodo

        //System.out.println("Llamando al numero: " + numero);

        Scanner sc = new Scanner(System.in);
        System.out.println("Llamar por medio de:");
        System.out.println("1 Red del operador");
        System.out.println("2 Whatsapp");
        System.out.println("3 Telegram");
        System.out.println("4 Messenger");
        System.out.println("Selecciona una opcion");
        int seleccion = sc.nextInt();
        switch(seleccion){
            case 1:
                System.out.println("Llamando por red del operador al: " + numero);
                break;
            case 2:
                System.out.println("Llamando por Whatsapp al: " + numero);
                break;
            case 3:
                System.out.println("Llamando por Telegram al: " + numero);
                break;
            case 4:
                System.out.println("Llamando por Messenger al: " + numero);
                break;
        }
    }

    @Override
    public void mandarMensaje(String numero, String mensaje){
        //System.out.println("Enviando ... : " + mensaje + " al numero: " + numero);

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la opción deseada");
        System.out.println("Mandar mensaje por medio de:");
        System.out.println("1 Red del operador");
        System.out.println("2 Whatsapp");
        System.out.println("3 Telegram");
        System.out.println("4 Messenger");
        System.out.println("5 Instagram");
        int seleccion = sc.nextInt();

        switch (seleccion){
            case 1:
                System.out.println("Enviando por red del operador al número " + numero
                        + " el mensaje:");
                System.out.println(mensaje);
                break;
            case 2:
                System.out.println("Enviando por Whatsapp al número " + numero
                        + " el mensaje:");
                System.out.println(mensaje);
                break;
            case 3:
                System.out.println("Enviando por Telegram al número " + numero
                        + " el mensaje:");
                System.out.println(mensaje);
                break;
            case 4:
                System.out.println("Enviando por Messenger al número " + numero
                        + " el mensaje:");
                System.out.println(mensaje);
                break;
            case 5:
                System.out.println("Enviando por Instagram al número " + numero
                        + " el mensaje:");
                System.out.println(mensaje);
                break;
        }
    }


}
