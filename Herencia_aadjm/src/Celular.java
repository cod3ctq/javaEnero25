// Clase heredada de Object

// Padre
public class Celular {

    String marca;
    String modelo;
    String color;
    String materiales;

    public Celular(){

    }

    public Celular(String marca, String modelo, String color, String materiales) {
        super(); // de Object
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.materiales = materiales;
    }

    // La sobrecarga de metodos se refiere a la distinta cantidad, orden y tipos de
    // los argumentos dados a un metodo

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", materiales='" + materiales + '\'' +
                '}';
    }

    // Comportamiento de la clase
    // LLamar
    // SMS
    // Tomar fotos

    // Una clase puede adquirir comportamiento de 3 maneras:
    /*
    1 Metodos nativos
    2 Metodos heredados (comunmente se sobreescriben)
    3 Metodos implementados (traidos de interfaces)
     */

    //1
    public void llamar(String numero){
        System.out.println("Llamando al numero: " + numero);
    }

    public void mandarMensaje(String numero, String mensaje){
        System.out.println("Enviando ... : " + mensaje + " al numero: " + numero);
    }

}
