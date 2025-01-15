public class MedicoGeneral extends Empleado implements IMedicina {

    // Las clases se Heredan //
    // Las interfaces se Implementan //

    String cedula;

    @Override
    public void trabajar() {
        System.out.println("Consultas, recetas, diagnosticos, paracetamol");
    }

    @Override
    public void inyectar() {

    }

    @Override
    public void sacarSangre() {

    }

    @Override
    public void aplicarRFC() {

    }

    @Override
    public void tomarPresion() {

    }

    @Override
    public void suturar() {

    }
}
