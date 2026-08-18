package abstracts;

public abstract class Usuario {
    private String nome;
    private int quantidadeEnprestada;

    public void Usuario ( String nome, int quantidadeEmprestada ) {
        this.nome = nome;
        this.quantidadeEnprestada = quantidadeEmprestada;
    }
}
