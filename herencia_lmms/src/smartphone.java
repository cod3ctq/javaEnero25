import java.util.Scanner;

public class smartphone extends celurar {
    //parte 1: reutilizacion y absorcion de codigo
    //parte 2: especializacion del modelo
    String so;
    //camara cam;
    //procesador procesador;
    public smartphone(){

    }

    public smartphone(String marca, String modelo, String color, String materiales, String so) {
        super(marca, modelo, color, materiales); // super: llamada al contructor de la clase padre
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
        return "smartphone{" +
                "so='" + so + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", materiales='" + materiales + '\'' +
                '}';
    }

    //sobrescritura: comportamiento de la forma dos
    @Override
    public  void llamar(String numero){ //la sobrescritura es la modificacion de la logica que actua al interior del metodo
        Scanner sc = new Scanner(System.in);
        System.out.println("Llamar por medio de : ");
        System.out.println("1: Red operador");
        System.out.println("2: WhatsApp");
        System.out.println("3: Telegram");
        System.out.println("4: Messenger");
        System.out.println("Selecciona una opcion");
        int selecciona = sc.nextInt();
        switch (selecciona){
            case 1:
                System.out.println("Llamar por red de operadora al: " +numero);
                break;
            case 2:
                System.out.println("Llamar por WhatsAppa al: "+numero);
                break;
            case 3:
                System.out.println("Llamar a telegram al al:"+numero);
                break;
            case 4:
                System.out.println("Lllamar por messenger al: "+numero);
                break;
        }
    }
    @Override
    public void mandarMensaje (String numero,String mensaje){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Mandar mensaje por medio de : ");
        System.out.println("1: Red operador");
        System.out.println("2: WhatsApp");
        System.out.println("3: Telegram");
        System.out.println("4: Messenger");
        System.out.println("Selecciona una opcion");
        int seleccion2 = sc1.nextInt();
        switch (seleccion2){
            case 1:
                System.out.println("Numero: " +numero+"Mensaje: "+mensaje);
                break;
            case 2:
                System.out.println("Numero WhatsApp "+numero+"Mandar mensaje por WhatsAppa a: "+mensaje);
                break;
            case 3:
                System.out.println("Numero Telegram: "+numero+"Mandar mensaje a telegram a : "+mensaje);
                break;
            case 4:
                System.out.println("Contacto: "+numero+"Mandar mensaje por Messenger a: "+mensaje);
                break;
        }
    }
}
