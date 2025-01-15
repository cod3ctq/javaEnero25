import java.util.Scanner;

public class Smartphone extends Celular {
    //Parte 1 : Reutilizacion y abstraccion de codigo a traves de (extends)
    //Parte 2 : Especializacion del modelo
    // so = sistema operativo
    String so;
    public Smartphone()
    {

    }

    public Smartphone(String marca, String modelo, String color, String materiales, String so) {
        super(marca, modelo, color, materiales); //Es la llamada al constructor de la clase padre padre
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
    //Se puede sobre escribir o sobre escritura, comportamiento de la forma 2
    @Override // indica sobre escritura, en este ejemplo hace mas accciones que el metodo de la clase anterior don de solo decia llamando
    public void llamar (String numero)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Llamar por medio de: ");
        System.out.println("1.-Red del Operador ");
        System.out.println("2.-Whatsapp");
        System.out.println("3.-Telegram");
        System.out.println("4.-Messenger");
        System.out.println("Selecciona una opcion");
        int seleccion = sc.nextInt();
        switch (seleccion)
        {
            case 1:
                System.out.println("Llamando por red del Operador al : "+numero);
                break;
            case 2:
                System.out.println("Llamando por Whatsapp al : "+numero);
                break;
            case 3:
                System.out.println("Llamando por Telegram al : "+numero);
                break;
            case 4:
                System.out.println("Llamando por Messenger al : "+numero);
                break;
        }
    }
    //La sobreescritura es la modificacion de la logica que actual al interior del metodo
    @Override
    public void mandarMensaje(String numero, String mensaje)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mandar mensae en : ");
        System.out.println("1.-Mensaje texto ");
        System.out.println("2.-Whatsapp");
        System.out.println("3.-Telegram");
        System.out.println("4.-Messenger");
        System.out.println("Selecciona una opcion");
        int seleccion = sc.nextInt();
        System.out.println("Tienes saldo 1= si , diferente numero = no");
        int saldo = sc.nextInt();
        if (saldo==1){
        switch (seleccion) {
            case 1:
                System.out.println("Mandando mensaje por Operador al : " + numero+" : "+mensaje);
                break;
            case 2:
                System.out.println("Mandando mensaje por Whatsapp al : " + numero+" : "+mensaje);
                break;
            case 3:
                System.out.println("Mandando mensaje por Telegram al : " + numero+" : "+mensaje);
                break;
            case 4:
                System.out.println("Mandando mensaje por Messenger al : " + numero+" : "+mensaje);
                break;
        }
        }else {
            System.out.println("Saldo agotado");
        }

    }
}
