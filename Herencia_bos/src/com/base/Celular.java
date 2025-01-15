package com.base;

public class Celular {

    //Encapsulamiento: modificadores de acceso
    //private, public,  protected

    private String marca;
    private String modelo;
    private  String color;
    private String materiales;

    public Celular() {

    }

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
        //SMS
        //Tomar fotos
        //una clase puede adquirir comportamientos de 3 maneras
    /*
    1. metodos nativos
    2. metodos heredados (comunmente se sobreescriben)
    3. Metodos implementados (traidos de interfaces)
     */
        //

    public void llamar(String numero){
    System.out.println("Llamando al numero: " + numero);
    }

    public void mandarMensaje(String numero, String mensaje){
    System.out.println("Enviando ... : " + mensaje + " al numero: " + numero);
    }

}


