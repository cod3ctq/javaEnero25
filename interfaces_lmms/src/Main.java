//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //interfaz=interfaces?
        //(visual) (abstracto)
        //Empleado e = new Empleado();
        //clases abstractas no pueden instanciarse

        Policia poli = new Policia();
        medicoGeneral mg = new medicoGeneral();

        poli.trabajar();
        mg.trabajar();

    }
}