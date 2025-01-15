public class MedicoGeneral extends Empleado implements IMedicina{

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
    public void aplicarRCP() {

    }

    @Override
    public void tomarPresion() {

    }

    @Override
    public void suturar() {

    }
}
