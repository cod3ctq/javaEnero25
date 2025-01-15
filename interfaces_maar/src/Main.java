public class Main {
    public static void main(String[] args) {

        // interfaz == interfaces ?
        // (visual)    (abstracto)

        //Empleado e = new Empleado();
        //las clases abstractas NO pueden instanciarse
        Policia poli = new Policia();
        MedicoGeneral mg = new MedicoGeneral();

        poli.trabajar();
        mg.trabajar();
    }
}