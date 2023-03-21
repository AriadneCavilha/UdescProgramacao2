
package Lista1.Exercicio2;

/**
 *
 * @author ariadne
 */

/*
Explique o que são modificadores de escopo em Java e demonstre o uso dos
modificadores através de um exemplo.
*/

/*
O modificador de escopo ele determina a quem pertece um determinado método ou atributo, se ele pertence a classe em si ou a um objeto. Ou seja, caso 
um atributo ou método for estático, ele vai poder ser acessado de qualquer lugar por qualquer classe, sem a necessidade de instânciar um objeto, ou seja,
ele não pertence ao objeto em si mas sim a classe, ele facilita quando outras classes vão necessitar daquele método e também para que não seja necessário
ficar instanciando o tempo todo o método. Isso serve também para os atributos, caso queira utilizar um atributo estático. 
Garantir que o valor seja o mesmo em todas as intâncias
*/
public class Principal {
    public static void main(String[] args) {
        Estudante.criaContaEstudante("Teste", 312312);
        System.out.println(Estudante.getNome());
    }
}
