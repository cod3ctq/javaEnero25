//clase abstracta
public abstract class Empleado{

    String nombre;
    String area;
    String puesto;
    double sueldo;
    String nss;

    public Empleado(){

    }
    public Empleado(String nombre, String area, String puesto, double sueldo, String nss) {
        this.nombre = nombre;
        this.area = area;
        this.puesto = puesto;
        this.sueldo = sueldo;
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", area='" + area + '\'' +
                ", puesto='" + puesto + '\'' +
                ", sueldo=" + sueldo +
                ", nss='" + nss + '\'' +
                '}';
    }
    //comportamiento
    //metodo abstracto (sin cuerpo)
    //Sin cuerpo, define que tienes que hace, pero no el como
    public abstract void trabajar();
    //abstract sirve para detectar componentes abstractos



}