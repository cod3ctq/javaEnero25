import java.sql.SQLOutput;
import java.util.Scanner;

public class Smartphone extends Celular{
    //Parte 1: Reutilizacion y absorcion de codigo
    //Parte 2: Especializacion del modelo
    String so;
    //Camara cam;  //mpx, iso, res, distF, aper
    //Procesador procesador;  //#nuc, frec, fabricante, cache
    public Smartphone(){

    }
    public Smartphone(String marca, String modelo, String color, String materiales, String so) {
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

    //Sobreescritura: Comportamiento de la forma 2
    @Override //<-- indica la sobreescritura
    public void llamar(String numero){
        Scanner sc = new Scanner(System.in);
        System.out.println("Llamar por medio de :");
        System.out.println("1:Red del operador");
        System.out.println("2:Whatsapp");
        System.out.println("3:Telegram");
        System.out.println("4:Messenger");
        System.out.println("Selecciona una opcion");
        int seleccion = sc.nextInt();
        switch(seleccion){
            case 1:
                System.out.println("Llamando por Red del Operador al: "+numero);
                break;
            case 2:
                System.out.println("Llamando por Whatsapp al: "+numero);
                break;
            case 3:
                System.out.println("Llamando por Telegram al: "+numero);
                break;
            case 4:
                System.out.println("Llamando por Messenger al: "+numero);
                break;
        }
    }






}
