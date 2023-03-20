
package Lista1.Exercicio4;

/**
 *
 * @author ariadne
 */

/*
Explique a diferença entre passagem de parâmetro por valor e passagem de
parâmetro por referência. Qual forma o Java usa nas suas passagens de parâmetros?
Faça um exemplo demonstrando a diferença na passagem de parâmetros para tipos
primitivos e objetos em Java.
*/

/*
Quando a passagem de parâmetro é feita pelo valor, é passada uma cópia da variável (Tipos primitivos)
Quando a passagem de parâmetro é feita por referência, é passada uma referência da própria variável (Tipos Complexos)
Quando não são utilizados tipos primitivos, o que é passado é uma referência do objeto (não é uma cópia da variável e caso você faça uma alteração no objeto, essa alteração vai ser feita diretamente no objeto)
Em termos mais práticos, a passagem por referência não contém o valor em si, mas sim o endereço em memória que representa esse valor
*/
public class Principal {
    public static void main(String[] args) {
       /*
        Aqui foi passado a passagem de parâmetro por valor, onde ele faz uma cópia da variável meuNumero, mas não alterou ela em si, pois ele fez apenas uma cópia, não mudou o valor diretamente
        */
        int meuNumero = 10;
        Numero.mudaNumero(meuNumero);
        System.out.println(meuNumero);
      
        
    }
}
