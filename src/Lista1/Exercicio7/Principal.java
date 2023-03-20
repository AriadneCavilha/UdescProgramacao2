
package Lista1.Exercicio7;

/**
 *
 * @author ariadne
 */

/*
A palavra super é utilizada para fazer referência a métodos ou atributos da super classe, a classe na qual estamos herdando.
*/
public class Principal {
    public static void main(String[] args) {
        PessoaFisica oPessoaFisica = new PessoaFisica("Teste", "Feminino", 231312312);
        System.out.println(oPessoaFisica.getNome());
        
        String nome = "Teste"; 
        
        if(oPessoaFisica.buscaPessoa(nome)) {
            System.out.println("Pessoa Encontrada");
        }
        else {
            System.out.println("Pessoa não encontrada");
        }
    }
}
