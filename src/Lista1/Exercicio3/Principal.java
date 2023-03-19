
package Lista1.Exercicio3;

/**
 *
 * @author ariadne 
 */

/*
Explique o que são classes abstratas e demonstre seu uso através de um exemplo.
Utilize sobrescrita de métodos
*/

/*
Classes abstratas são classes que não podem ser instanciadas e servem apenas como modelo para outras classes que irão herdar sua classe
Essas classes são importantes quando queremos criar apenas que outras classes possam criar um objjeto apartir de sua instanciação 
*/

public class Principal {
    public static void main(String[] args) {
        ContaPoupanca oConta = new ContaPoupanca();
        oConta.criaConta("Conta", "321", 323214323);
        System.out.println(oConta.getNome());
    }
}
