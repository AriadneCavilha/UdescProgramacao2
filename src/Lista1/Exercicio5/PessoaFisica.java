
package Lista1.Exercicio5;

/**
 *
 * @author ariadne
 */
public class PessoaFisica extends Pessoa{
    private boolean pessoaFisica;
    
    public PessoaFisica(String nome) {
        super(nome);
    }
    
    @Override
    public String criaPessoa(String nome) {
        this.pessoaFisica = true;
        return nome;
    }

    public boolean isPessoaFisica() {
        return pessoaFisica;
    }
    
    
}
