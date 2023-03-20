
package Lista1.Exercicio5;

/**
 *
 * @author ariadne
 */

/*
Diferencie sobrecarga de métodos de sobrescrita de métodos. Em seguida, apresente
um exemplo em Java que faça uso das 2 abordagens.
*/

/*
Sobrecarga de métodos é utilizada para criar diversos métodos com o mesmo nome em uma classe, porém com outros parâmetros e outros retornos, ela é utilizada quando queremos
ter vários métodos que possuem a mesma funcionalidade, mas queremos diferentes retornos 
Já a sobrescrita de métodos é utilizada quando queremos sobrescrever um método da classe pai, na classe filha. Sendo assim, quando queremos utilizar o mesmo método mas queremos
usar um tipo de referente de retorno, nós utilizamos a sobrescrita de método
*/

public class Principal {
    public static void main(String[] args) {
        Pessoa oPessoa = new Pessoa("Pessoa");
        PessoaFisica oPessoaFisica = new PessoaFisica("PessoaFisica");
        
        /*
        Sobrecarga de métodos, diversos métodos com o mesmo nome, mesma funcionalidade porém com um retorno diferente e parametrização diferente
        */
             
        oPessoa.calcula(1, 2);
        oPessoa.calcula(1, 3);
        oPessoa.calcula("1", "2");
        
        System.out.println(oPessoa.calcula(1, 2));
        System.out.println(oPessoa.calcula(1.2, 2.2));
        System.out.println(oPessoa.calcula("1", "2"));
        
        /*
        Sobrescrita de método, que eu adicionei no método criaPessoa, o atributo pessoaFisica, identificando se é uma pessoa física ou não, porém o método da classe pai não foi alterado, ele apenas foi sobrescrito na classe filha
        */
        
        oPessoaFisica.criaPessoa("Ariadne");
        System.out.println(oPessoaFisica.isPessoaFisica());
        
    }
}
