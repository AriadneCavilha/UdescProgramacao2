
package Lista1.Exercicio7;

/**
 *
 * @author ariadne
 */
public class PessoaFisica extends Pessoa {
    private int cpf;
    
    public PessoaFisica(String nome, String sexo, int cpf) {
        super(nome, sexo);
        this.cpf = cpf;
        super.armazenaPessoa();
    }
    
    public boolean buscaPessoa(String nome) {
        boolean encontrouPessoa = false;
        for(Pessoa oPessoa: super.getoPessoa()) {
            if(oPessoa.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return encontrouPessoa;
    }
}
