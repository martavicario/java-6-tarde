public class Libro {
    private String isbn;
    private String titulo;
    private int numeroPaginas;
    private String autor;
    private boolean prestado;

    public Libro() {
        this.isbn = "";
        this.titulo = "";
        this.numeroPaginas = 0;
        this.autor = "";
        this.prestado = false;
    }

    public Libro(String isbn, String titulo, int numeroPaginas, String autor, boolean prestado) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.prestado = prestado;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void prestar() {
        if (prestado) {
            System.out.println("No se puede prestar el libro. Ya está prestado.");
        } else {
            prestado = true;
            System.out.println("Libro prestado con éxito.");
        }
    }

    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("Libro devuelto con éxito.");
        } else {
            System.out.println("El libro no está prestado.");
        }
    }

    public double imprimir(double costePorPagina) {
        return numeroPaginas * costePorPagina;
    }

    @Override
    public String toString() {
        if (prestado) {
            return "El libro (" + isbn + ") con título " + titulo + " y autor " + autor +
                   " tiene " + numeroPaginas + " páginas y está prestado";
        } else {
            return "El libro (" + isbn + ") con título " + titulo + " y autor " + autor +
                   " tiene " + numeroPaginas + " páginas y no está prestado";
        }
    }
}
