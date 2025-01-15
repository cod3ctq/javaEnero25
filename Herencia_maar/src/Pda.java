public class Pda extends Celular {
    String lectorQR;
    String lectorCodigoBarras;

    public Pda() {
    }

    public Pda(String marca, String modelo, String color, String materiales, String lectorQR,
               String lectorCodigoBarras) {
        super(marca, modelo, color, materiales);
        this.lectorQR = lectorQR;
        this.lectorCodigoBarras = lectorCodigoBarras;
    }

    public String getLectorCodigoBarras() {
        return lectorCodigoBarras;
    }

    public void setLectorCodigoBarras(String lectorCodigoBarras) {
        this.lectorCodigoBarras = lectorCodigoBarras;
    }

    public String getLectorQR() {
        return lectorQR;
    }

    public void setLectorQR(String lectorQR) {
        this.lectorQR = lectorQR;
    }

    @Override
    public String toString() {
        return "Pda{" +
                "lectorQR='" + lectorQR + '\'' +
                ", lectorCodigoBarras='" + lectorCodigoBarras + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", materiales='" + materiales + '\'' +
                '}';
    }
}
