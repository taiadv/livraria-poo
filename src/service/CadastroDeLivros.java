package service;  
// Define que essa classe está dentro do pacote "service", ajudando a organizar o código

import model.Livro;  
// Importa a classe Livro, que está no pacote model, para usar aqui

import java.util.ArrayList;  
import java.util.List;  
// Importa as classes para trabalhar com listas (coleções) de objetos

public class CadastroDeLivros {  
    // Define a classe pública CadastroDeLivros que vai gerenciar livros

    private List<Livro> livros;  
    // Declara uma lista privada para guardar os livros cadastrados

    public CadastroDeLivros() {  
        livros = new ArrayList<>();  
        // Construtor: quando criar um CadastroDeLivros, inicializa a lista vazia de livros
    }

    public void adicionarLivro(Livro livro) {  
        livros.add(livro);  
        // Método público para adicionar um livro na lista
    }

    public List<Livro> listarLivros() {  
        return livros;  
        // Método público para retornar a lista atual de livros cadastrados
    }
}
