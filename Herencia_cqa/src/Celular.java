public class Celular {

    String marca ;
    String modelo;
    String color;
    String materiales;
    public  Celular()
    {

    }

    public Celular(String marca, String modelo, String color, String materiales)//****La sobrecarga es definir 2 metodos con el mismo nombre realizando acciones diferentes
    {
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
    //Comportamiento de la clase
    //El Ojeto puede llamar (celular)
    //El Objeto puede enviar SMS
    //El Objeto puede tomar fotos ****
    //Una clase puede adquirir comportamiento de 3 maneras
    //***1- Metodos nativos****
    //***2- Metodos heredados (comunmente se sobreescribn)
    //***3- Metodos implementados (traidos de interfaces)
    public void llamar (String numero)
    {
        System.out.println("Llamando a : "+numero);
    }
    public void mandarMensaje(String numero, String mensaje)
    {
        System.out.println("Enviando a ---: "+mensaje+" al numero "+numero);
    }

}
