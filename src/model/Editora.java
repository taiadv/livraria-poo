package model;

// Classe que representa uma Editora, com nome e CNPJ (identificação fiscal)
public class Editora {
    
    // Atributos privados para encapsular os dados da editora
    private String nome;
    private String cnpj;

    // Construtor para inicializar os atributos nome e cnpj da editora
    public Editora(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    // Getter para obter o nome da editora
    public String getNome() {
        return nome;
    }

    // Setter para alterar o nome da editora
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para obter o CNPJ da editora
    public String getCnpj() {
        return cnpj;
    }

    // Setter para alterar o CNPJ da editora
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Método toString para representar a editora em formato legível
    @Override
    public String toString() {
        // Retorna o nome da editora e o CNPJ formatado
        return nome + " (CNPJ: " + cnpj + ")";
    }
}
