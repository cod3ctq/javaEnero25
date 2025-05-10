public class Main {
    public static void main(String[] args) {
        Celular c1 = new Celular();
        c1.llamar("098765432");
        //c1.mandarMensaje("123456789","hola");
        //En las clases, si no se agrega explicitamente un constructor
        //Java le otorga el vacio por default
        Smartphone sm = new Smartphone();
        sm.llamar("398798792");
        Object[] valores = new Object[10];
        valores[0] = "kshbvksjd";
        valores[2] = 243;
        valores[3] = false;
        valores[4] = 'X';
    }
}