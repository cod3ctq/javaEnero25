public class IngenieriaBioquimica extends Estudiante implements IBioquimica{

   int calificacion;

 public IngenieriaBioquimica() {

 }

 public IngenieriaBioquimica(String numeroDeControl, String especialidad, String materia, int calificacion, String calificacion1) {
  super(numeroDeControl, especialidad, materia, calificacion);
  this.calificacion = calificacion;
 }

 @Override
 public int getCalificacion() {
  return calificacion;
 }

 public void setCalificacion(int calificacion) {
  this.calificacion = calificacion;
 }

 @Override
 public String toString() {
  return "IngenieriaBioquimica{" +
          "calificacion='" + calificacion + '\'' +
          ", numeroDeControl='" + numeroDeControl + '\'' +
          ", especialidad='" + especialidad + '\'' +
          ", materia='" + materia + '\'' +
          ", calificacion=" + calificacion +
          '}';
 }

 @Override
    public void Estudiar() {System.out.println("Analizar,Entregar tareas, Experimentar");

    }

    @Override
    public void Experimentar() {

    }

    @Override
    public void Analizar() {

    }

    @Override
    public void Muestreo() {

    }
}
