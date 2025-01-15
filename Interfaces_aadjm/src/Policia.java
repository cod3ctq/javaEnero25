// Implementar varias interfaces permite simular la multiherencia

public class Policia extends Empleado implements ISeguridad,IMedicina{

    @Override // Sobreescritura
    public void trabajar() {
        System.out.println("Vigilar, perseguir ladrones");
    }

    @Override
    public void disparar() {

    }

    @Override
    public void defensaPersonal() {

    }

    @Override
    public void manejar() {

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
