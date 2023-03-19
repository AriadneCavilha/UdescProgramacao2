/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.Exercicio2;

/**
 *
 * @author ariadne
 */
public class Estudante {
    private static String nome;
    private static int telefone;
    
    /**
     *
     * @param nome
     * @param telefone
     */
    public static void criaContaEstudante(String nome, int telefone) {
        Estudante.nome =  nome;
        Estudante.telefone = telefone;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Estudante.nome = nome;
    }

    public static int getTelefone() {
        return telefone;
    }

    public static void setTelefone(int telefone) {
        Estudante.telefone = telefone;
    }
    
    
}
