
package Lista1.Exercicio3;

/**
 *
 * @author ariadne
 */
public abstract class Conta {
    private String nome;
    private String dataNascimento;
    private int cpf;
    
    public void criaConta(String nome, String dataNascimento, int cpf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        
    }           
}
