import java.util.Scanner;

public class Smartphone extends Celular{
    //parte 1: reutilizacion y absorcion de codigo
    //parte 2: especializacion del modelo

    String so;

    public Smartphone(){
    }

    public Smartphone(String marca, String modelo, String color, String materiales, String so) {
        super(marca, modelo, color, materiales); //super (llamada al constructor de la clase padre)
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

    //sobreescritura: comportamiento de la forma 2
    @Override // <----- Indica sobreescritura
    public void llamada(String numeroCel){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Llamar por medio de:
                1.Red del operador
                2.WhatsApp
                3.Telegram
                4.Messenger
                Selecciona una opción""");
        int seleccion = sc.nextInt();
        switch (seleccion){
            case 1:
                System.out.println("Llamando por Red del operador al: "+numeroCel);
                break;
            case 2:
                System.out.println("Llamando por WhatsApp al: "+numeroCel);
                break;
            case 3:
                System.out.println("Llamando por Telegram al: "+numeroCel);
                break;
            case 4:
                System.out.println("Llamando por Messenger al: "+numeroCel);
                break;
            default:
                System.out.println("ERROR: Selecciona una opción válida!");
        }
    }

    //la sobreescritura es la modificacion de la logica que actua al interior de un metodo

    @Override
    public void mensaje(String numeroCel, String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Enviar mensaje por medio de:
                1.Red del operador
                2.WhatsApp
                3.Telegram
                4.Messenger
                Selecciona una opción""");
        int seleccion = sc.nextInt();
        switch (seleccion){
            case 1:
                System.out.println("Enviando (" + mensaje + ") por Red del operador al: "+numeroCel);
                break;
            case 2:
                System.out.println("Enviando (" + mensaje + ") por WhatsApp al: "+numeroCel);
                break;
            case 3:
                System.out.println("Enviando (" + mensaje + ") por Telegram al: "+numeroCel);
                break;
            case 4:
                System.out.println("Enviando (" + mensaje + ") al: "+numeroCel);
                break;
            default:
                System.out.println("ERROR: Selecciona una opción válida!");
        }
    }
}
