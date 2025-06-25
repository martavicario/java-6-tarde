public class Lista<T> implements Listable<T> {
    private T[] elementos;
    private int numElementos;

    @SuppressWarnings("unchecked")
    public Lista(int tamano) {
        if (tamano <= 0) {
            throw new IllegalArgumentException("El tamaño debe ser positivo.");
        }
        elementos = (T[]) new Object[tamano]; 
        numElementos = 0;
    }

    @Override
    public int posicion(T elemento) {
        for (int i = 0; i < numElementos; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean aniadir(T elemento) {
        if (numElementos >= elementos.length) return false; 
        if (posicion(elemento) != -1) return false; 

        elementos[numElementos] = elemento;
        numElementos++;
        return true;
    }

    @Override
    public int tamanio() {
        return numElementos;
    }

    @Override
    public boolean eliminar(T elemento) {
        int pos = posicion(elemento);
        if (pos == -1) return false;

        for (int i = pos; i < numElementos - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        elementos[numElementos - 1] = null;
        numElementos--;
        return true;
    }

    @Override
    public void listar() {
        if (numElementos == 0) {
            System.out.println("Lista vacía.");
            return;
        }
        for (int i = 0; i < numElementos; i++) {
            System.out.println((i + 1) + ". " + elementos[i]);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public void vaciar() {
        elementos = (T[]) new Object[elementos.length];
        numElementos = 0;
    }
}
