/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.Exercicio6;

import java.util.ArrayList;

/**
 *
 * @author ariadne  
 */
public class Escola extends Instituicao {
    private String nomeLivro;
    private String nomeAutor;
    private int numeroPaginas;
    private ArrayList<Escola> listaLivrosEscola = new ArrayList();
    
    public Escola(String nome, String endereco, int telefone, int cnpj) {
        super(nome, endereco, telefone, cnpj);
    }
    
    public void adicionaLivroAcervo(String nomeLivro, String nomeAutor, int numeroPaginas) {
        this.nomeLivro = nomeLivro;
        this.nomeAutor = nomeAutor;
        this.numeroPaginas = numeroPaginas;
        listaLivrosEscola.add(this);
    }
    
    public boolean buscaLivrosAcervo(String nomeLivro, String nomeAutor) {
        boolean livroEncontrado = false;
        for(Escola livrosEscola : listaLivrosEscola) {
            if(livrosEscola.nomeLivro.equalsIgnoreCase(nomeLivro) && livrosEscola.nomeAutor.equalsIgnoreCase(nomeAutor)) {
                livroEncontrado = true;
                return livroEncontrado;
            }
        }
        return livroEncontrado;
    }
}
