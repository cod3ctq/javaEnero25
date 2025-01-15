package com.base;

import java.util.Scanner;

public class Smartphone extends Celular {

    //parte 1: Reutilizacion y absorcion de codigo
    //parte 2: Especializacion del modelo

    String so;
    //Camara cam; // atributos de la camara
    //Procesador procesador;

    public Smartphone(){
//Forma incorrecta para mandar a traer un atributo directo
        //this.marca="Sony";
 //forma correcta pra mandara a traer atributo es usar
 //getter and setters
 this.setMarca("sony");
 this.getMarca();

    }
    public Smartphone(String marca, String modelo, String color, String materiales, String so) {
        super(marca, modelo, color, materiales);
        this.so = so;
    } //"super" es la llamada de constructor padre

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "so='" + getSo() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", color='" + getColor() + '\'' +
                ", materiales='" + getMateriales() + '\'' +
                '}';
    }

    //sobreescritura: comportamiento de la forma 2
       /*la sobreescritura es la modificacion de la logica
         que actua al interior del metodo
         */

    @Override //<----- indica la sobreescritura
    //Es necesario que lo agregues para que sepan
    //que se esta sobreescribiendo

    public void llamar(String numero){
        Scanner sc = new Scanner(System.in);
        System.out.println("Llamar por medio de :");
        System.out.println("1. Red del operador:");
        System.out.println("2: whatsapp");
        System.out.println("3:Telegram");
        System.out.println("4:Messenger");
        System.out.println("Selecciona una opcion");

        int seleccion = sc.nextInt();
        switch (seleccion) {
            case 1:
                System.out.println("Llamando por Red al Operador: " + numero);
                break;
            case 2:
                System.out.println("Llamando por Whatsapp: " + numero);
                break;
            case 3:
                System.out.println("Llamando por Telegram: " + numero);
                break;
            case 4:
                System.out.println("Llamando por Messenger: " + numero);
                break;

        }

        }
        @Override
    public void mandarMensaje(String numero, String mensaje){
      Scanner sc=new Scanner(System.in);
        System.out.println("Mandar mensaje por medio de :");
        System.out.println("1.SMS del sistema:");
        System.out.println("2: whatsapp");
        System.out.println("3:Telegram");
        System.out.println("4:Messenger");
        System.out.println("Selecciona una opcion");

    int seleccion =sc.nextInt();
        switch (seleccion) {
            case 1:
                System.out.println("Mandar Mensaje por SMS: " + numero);
                System.out.println(mensaje);
                break;
            case 2:
                System.out.println("Mandar Mensaje por Whatsapp: " + numero);
                System.out.println(mensaje);

                break;
            case 3:
                System.out.println("Mandar Mensaje por Telegram: " + numero);
                System.out.println(mensaje);

                break;
            case 4:
                System.out.println("Mandar Mensaje por Messenger: " + numero);
                System.out.println(mensaje);
                break;

        }

    }

    }

