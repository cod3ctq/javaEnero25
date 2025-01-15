public class celurar {

    String marca;
    String modelo;
    String color;
    String materiales;
    public celurar(){

    }

    public celurar(String marca, String modelo, String color, String materiales) {
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
        return "celurar{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", materiales='" + materiales + '\'' +
                '}';
    }

    //comportamiento de la clase
    //llamar
    //sms
    //tomar foto****
    //una clase puede atquirir comportamiento de 3 maneras
    //1. metodos nativos
    //2. metodos heredados (comunmente se sobrescriben)
    //3. metodos implementados (traidos de interfaces)



    //1
    public  void llamar(String numero){
        System.out.println("Lamamando al numero: "+numero);
    }
    public void mandarMensaje(String numero, String mensaje){
        System.out.println("Enviando... : "+mensaje+" al numero: "+numero );

    }




}
