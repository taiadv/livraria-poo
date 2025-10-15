package Service;

import Model.Livro;
import java.util.ArrayList;
import java.util.List;

public class CadastroDeLivros {
    private List<Livro> livros;

    public CadastroDeLivros() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> listarLivros() {
        return livros;
    }
}
