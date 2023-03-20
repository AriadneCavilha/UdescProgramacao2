
package Lista1.Exercicio6;

/**
 *
 * @author ariadne  
 */

/*
Defina polimorfismo e exemplifique seu uso em Java. Seu programa deve:
a. Possuir pelo menos 4 classes, sendo 3 classes de modelo e uma classe principal
apresentando o uso das classes implementadas
b. Fazer uso de classe abstrata
c. Apresentar saídas no console
*/

/*
Polimorfismo é quando utilizamos de uma classe para criar diversos objetos especializados dessa classe, na qual essa classe pai terá diversas formas dependendo
de sua classe filha, por isso é chamada de polimorfismo pois essa classe irá ter diversas formas e maneiras na qual ela possa se comportar. Então basicamente teremos uma classe
pai, que poderá ser abstrata ou não. E que ela que todas as classes que vão herdar terão comportamentos diferentes : exemplo. Classe pai Caneta e as classes filhas podem ser diversos tipos de caneta ou até mesmo algo diferente.
Podemos pensar que a classe pai pode ser Classe Forma, e que as classes que vão herdar podem possuir diversas formas : Circulo, triângulo e um quadrado. Todas essas classes herdam da classe pai, porém possuem comportamentos diferentes comparada umas as outras
E cada uma dessas classes são uma especialização da classe Pai, que nesse caso é a forma.
*/
public class Principal {
    public static void main(String[] args) {
        Hospital oHospital = new Hospital("Hospital", "Endereco", 312312, 312321);
        System.out.println(oHospital.getNome());
        oHospital.setMateriaisHospitalaresExistentes("Luva", 10);
        System.out.println(oHospital.getQuantidadeMateriaisHospitalares());
        System.out.println(oHospital.getTipoMaterialHospitalar());
        
        
        /*
        Exemplo de código que verifica se existe o material hospitalar procurado
        */
        if(oHospital.buscaTipoMaterialHospitalar("Luva")) {
            System.out.println("Material Hospitalar Encontrado");
        }
        else {
            System.out.println("Material Hospitalar Não Encontrado");
        }
        
        
        Escola oEscola = new Escola("Escola", "Endereco", 312321312, 3123123);
        oEscola.adicionaLivroAcervo("Livro", "Autor", 100);
        
        /*
        Exemplo de código que verifica se existe o livro procurado
        */
        if(oEscola.buscaLivrosAcervo("Livro", "Autor")) {
            System.out.println("Livro encontrado no Acervo");
        }
        else {
            System.out.println("Livro não encontrado no Acervo");
        }
    }
  
}
