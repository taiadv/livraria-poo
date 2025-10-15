package Model;

import java.util.List;
import Interface.Vendavel;


public class Livro extends Produto implements Vendavel {
    private List<Autor> autores; // associação (muitos autores)
    private Editora editora;     // composição (um livro tem uma editora)

    public Livro(String titulo, double preco, List<Autor> autores, Editora editora) {
        super(titulo, preco);
        this.autores = autores;
        this.editora = editora;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    @Override
    public double calcularPreco() {
        return getPreco(); // usa método da classe mãe Produto
    }

    @Override
    public String toString() {
        return "Livro: " + getTitulo() + " | Preço: R$" + calcularPreco() +
               " | Editora: " + editora.getNome() +
               " | Autores: " + autores.stream().map(Autor::getNome).toList();
    }
}
