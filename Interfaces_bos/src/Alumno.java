public abstract class Alumno{

    String nombre;
    String grado;
    String grupo;
    String semestre;

    public Alumno(){

    }

    public Alumno(String nombre, String grado, String grupo, String semestre) {
        this.nombre = nombre;
        this.grado = grado;
        this.grupo = grupo;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", grado='" + grado + '\'' +
                ", grupo='" + grupo + '\'' +
                ", semestre='" + semestre + '\'' +
                '}';
    }
    public abstract void Graduar();

}
