public abstract class Vehiculo {

    String fabricante;
    String modelo;
    String añoDeFabricacion;
    String paisDeOrigen;
    String tipoCombustible;
    int pasajeros;

    public Vehiculo() {
    }

    public Vehiculo(int pasajeros, String tipoCombustible, String paisDeOrigen, String añoDeFabricacion, String modelo, String fabricante) {
        this.pasajeros = pasajeros;
        this.tipoCombustible = tipoCombustible;
        this.paisDeOrigen = paisDeOrigen;
        this.añoDeFabricacion = añoDeFabricacion;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAñoDeFabricacion() {
        return añoDeFabricacion;
    }

    public void setAñoDeFabricacion(String añoDeFabricacion) {
        this.añoDeFabricacion = añoDeFabricacion;
    }

    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", añoDeFabricacion='" + añoDeFabricacion + '\'' +
                ", paisDeOrigen='" + paisDeOrigen + '\'' +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", pasajeros=" + pasajeros +
                '}';
    }
    public abstract void desplazarse();
}
