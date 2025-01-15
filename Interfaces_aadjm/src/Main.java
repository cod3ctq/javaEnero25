public class Main {
    public static void main(String[] args) {

        // Interfaz == Interfaces?, no es lo mismo
        // (visual)    (abstracto)

        //Empleado e = new Empleado();
        // Las clases abstractas NO pueden instaciarse

        //Policia poli = new Policia();
        //MedicoGeneral mg = new MedicoGeneral();

        //poli.trabajar();
        //poli.setNombre("Alex");
        //mg.trabajar();

        Fisico fis = new Fisico();

        fis.setNombre("Juan");
        fis.impartir();
        System.out.println(fis.getNombre());


    }
}