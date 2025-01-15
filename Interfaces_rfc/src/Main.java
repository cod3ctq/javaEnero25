public class Main {
    public static void main(String[] args) {
        // interfaz == interfaces ?
        // (visual)  (abstracto)
        //Emepleao e = new Empleado ();
        //Las clases abstractas NO pueden instanciarse

        Policia poli = new Policia();
        MedicoGeneral mg = new MedicoGeneral();
        Bombero bombe = new Bombero();

        poli.trabajar();
        mg.trabajar();
        bombe.trabajar();

    }
}