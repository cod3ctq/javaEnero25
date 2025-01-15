public class Main {
    public static void main(String[] args) {

        // Interfaz == interfaces ?
        // (visual)    (Abtracto)
        // Empleado e =new Empleado ();
        //Las clases abstractas NO pueden instanciarse
         Policia poli = new Policia();
         MedicoGeneral mg = new MedicoGeneral();

         poli.trabajar();
         mg.trabajar();

        }

    }
