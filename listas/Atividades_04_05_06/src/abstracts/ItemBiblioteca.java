package abstracts;

public abstract class ItemBiblioteca {
    private String codigo;
    private String titulo;
    private boolean disponivel;

    public void ItemBilbioteca ( String codigo, String titulo, boolean disponivel ) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.disponivel = disponivel;
    }
}
