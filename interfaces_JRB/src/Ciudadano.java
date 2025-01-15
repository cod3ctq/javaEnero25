public abstract class Ciudadano {
    String nombre;
    String curp;
    String actaNacimiento;
    public Ciudadano(){

    }

    public Ciudadano(String nombre, String curp, String actaNacimiento) {
        this.nombre = nombre;
        curp = curp;
        this.actaNacimiento = actaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        curp = curp;
    }

    public String getActaNacimiento() {
        return actaNacimiento;
    }

    public void setActaNacimiento(String actaNacimiento) {
        this.actaNacimiento = actaNacimiento;
    }

    @Override
    public String toString() {
        return "Ciudadano{" +
                "nombre='" + nombre + '\'' +
                ", curp='" + curp + '\'' +
                ", actaNacimiento='" + actaNacimiento + '\'' +
                '}';
    }
    public abstract void servicioMilitar();
}
