//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Futbolista fut = new Futbolista();
        Waterpolo watp = new Waterpolo();
        //Aqui ya no es necesario escribir codigo para escribir el metodo de poli o mg ya que el metodo anteriormente ya indica escribir algo
        //fut.sexo();
        //watp.sexo();
        System.out.println("Los datos del competidor de futbol es : "+fut+" Y los hombres son  ");
        fut.sexo();
        System.out.println("Los datos del competidor de Waterpolo es : "+watp+"Y las mujeres son ");
        watp.sexo();


    }
}