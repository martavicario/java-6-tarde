public interface Listable<T> {
    int posicion(T elemento);
    boolean aniadir(T elemento);
    int tamanio();
    boolean eliminar(T elemento);
    void listar();
    void vaciar();
}
