/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.Exercicio3;

/**
 *
 * @author ariad
 */
public class ContaPoupanca extends Conta{
    private String nome;
    
    @Override
    public void criaConta(String nome, String dataNascimento, int cpf) {
        this.nome = nome;
        super.criaConta(nome, dataNascimento, cpf); 
    }

    public String getNome() {
        return nome;
    }
}
