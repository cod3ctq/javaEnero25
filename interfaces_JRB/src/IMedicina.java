
/*
* Una iterface es 100% abtracta
* Solo contiene metodos abtractos
* No es un modelo, es un contrato
* Todo de ella es 100% publico
 */
public interface IMedicina {
    //Metodos abstractos: no tiene cuerpo, solo esta definido.
    void inyectar ();
    void sacarSangre();
    void aplicarRCP();
    void tomarPresion();
    void suturar();

}
