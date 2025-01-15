/*
 1. metodos nativos
 2. metodos heredados (comunmente se sobreescriben)
 3. metodos implementados (traidos de interfaces)

 getter y setter son mecanismos para establecer y recuperar valores hacia y desde los objetos

 herencia nos sirve para absorber metodos y atributos de una superclase a una subclase

 sobreeescritura nos sirve para redifinir la logica de un metodo existente

 sobrecarga se refiere a la distinta cantidad, orden y tipos de los argumentos dados a un metodo

 abstraccion se refiere a la sintetizacion de aquellas cosas relevantes para el modelo
 */

public class Celular {
    String marca;
    String modelo;
    String color;
    String materiales;

    public Celular() {
    }

    //un metodo constructor es el mecanismo utilizado para inicializar los valores de una clase
    public Celular(String marca, String modelo, String color, String materiales) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.materiales = materiales;
    }

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
    //comportamiento de la clase
    //llamar
    //sms
    //tomar fotos ***
    //una clase puede adquirir comportamiento de 3 maneras


    public void llamada(String numeroCel){
        System.out.println("Llamando al numero: " + numeroCel);
    }

    public void mensaje(String numeroCel, String mensaje){
        System.out.println("Enviando("+ mensaje + ") al numero: "+ numeroCel);
    }
}

