
public abstract class Bombero{

    String nombre;
    String ciudad;
    String rango;
    int edad;
    double sueldo;
    public Bombero(){

    }

    public Bombero(String nombre, String ciudad, String rango, int edad, double sueldo) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.rango = rango;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Bombero{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", rango='" + rango + '\'' +
                ", edad=" + edad +
                ", sueldo=" + sueldo +
                '}';
    }

    public abstract void apagarIncendio();

}
