public class Celular {
    String marca;
    String modelo;
    String color;
    String materiales;

    public Celular(){

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
    //sms
    //toamr fotos ***
    //Una clase puede adquirir comportamiento de 3 maneras:
    /*
    1- Metodos nativos
    2- Metodos heredados (comunmente se sobreescriben)
    3- Metodos Implementados (traidos de interfaces)
     */
    //1
    public void LLamar(String numero){
        System.out.println("Llamando al numero: "+ numero);
    }

    public void mandarMensaje(String numero, String mensaje){
        System.out.println("Enviando. . .: "+ mensaje+ " al numero: "+numero);
    } // es le mecanismo para inicializar los valores de la clase

}
