public abstract class Profesor {

    String nombre;
    double salario;
    String materia;

    public Profesor(){

    }

    public Profesor(String nombre, double salario, String materia) {
        this.nombre = nombre;
        this.salario = salario;
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", materia='" + materia + '\'' +
                '}';
    }

    public abstract void impartir();

}
