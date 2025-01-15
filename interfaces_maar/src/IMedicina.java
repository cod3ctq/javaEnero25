//una interface es 100% abstracta
//solo tiene metodos abstractos (no tienen cuerpo)
//todo en ella es 100% publico
//no es un modelo, es un contrato
//siempre que se crea una interfaz se debe colocar una I antes del nombre
//se puede simular una multiherencia al implementar 2 o mas interfaces

public interface IMedicina {

    //metodos abstractos, no tienen cuerpo, solo estan definidos
    void inyectar();
    void sacarSangre();
    void aplicarRCP();
    void tomarPresion();
    void suturar();

}
