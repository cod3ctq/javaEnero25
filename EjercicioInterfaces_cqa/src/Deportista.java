public abstract class Deportista {

    double peso;
    double altura;
    int edad;
    String numeroCompetidor;
public Deportista()
{

}

    public Deportista(double peso, double altura, int edad, String numeroCompetidor) {
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.numeroCompetidor = numeroCompetidor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumeroCompetidor() {
        return numeroCompetidor;
    }

    public void setNumeroCompetidor(String numeroCompetidor) {
        this.numeroCompetidor = numeroCompetidor;
    }

    @Override
    public String toString() {
        return "Deportista{" +
                "peso=" + peso +
                ", altura=" + altura +
                ", edad=" + edad +
                ", numeroCompetidor='" + numeroCompetidor + '\'' +
                '}';
    }

    public abstract void sexo();

}
