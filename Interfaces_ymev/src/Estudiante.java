public abstract class Estudiante {

    String numeroDeControl;
    String especialidad;
    String materia;
    int calificacion;

    public Estudiante() {
    }

    public Estudiante(String numeroDeControl, String especialidad, String materia, int calificacion) {
        this.numeroDeControl = numeroDeControl;
        this.especialidad = especialidad;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public String getNumeroDeControl() {
        return numeroDeControl;
    }

    public void setNumeroDeControl(String numeroDeControl) {
        this.numeroDeControl = numeroDeControl;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "numeroDeControl='" + numeroDeControl + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", materia='" + materia + '\'' +
                ", calificacion=" + calificacion +
                '}';
    }

    public void Estudiar() {

    }
}
