
package Lista1.Exercicio1;

/*
Explique o que são modificadores de visibilidade em Java e demonstre o uso dos
modificadores através de um exemplo.
*/


 /*
Os modificadores de visibilidade são modificadores que tem por função mostrar atributos e métodos apenas em apenas algumas classes ou em todas, sempre dependendo
do seu modificador de visibilidade
Existem 4 modificadores de visibilidade : Private, Protected, Public e Default na qual serão todos demonstrados no código abaixo
1. Com o Public você consegue ter acesso em qualquer classe apenas mudar o que quiser, sem que tenha nenhum tipo de proteção. Ele é o menos utilizado
2. O Private só pode apenas ser acessado na classe criada, não podendo ter acesso em outras classes, por isso que eu não posso apenas chamar o atributo Cpf da outra classe e mudar o seu valor, pois ele é um atributo privado
eu só posso mudar esse atributo com o método setNome, que é um método público
*/
public class Principal {
    public static void main(String[] args) {
        Pessoa oPessoa = new Pessoa();
        
        /*
        * Modificando o atributo nome, que é um atributo público
        */
        oPessoa.nome = "Ariadne";
        System.out.println(oPessoa.getNome());
        
        /*
        Modificando o atributo cpf com o método Cpf pois o meu atributo cpf é privado, então não posso chamar diretamente o atributo que está privado
        só posso modificar o atributo utilizando um método público 
        */
        oPessoa.setCpf(1213213);
        System.out.println(oPessoa.getCpf());
        
        /*
        O protected eu posso utilizar em classes que estendem aquela classe ou quando há uma outra classe que está no mesmo pacote da classe que eu criei
        dai eu posso chamar aquele atributo ou método
        */
        oPessoa.nomeMae = "Mãe";
        System.out.println(oPessoa.getNomeMae());
        
        /*
        O default se possui um comportamento semelhante ao Protected porém ele você não consegue ter acesso ao atributo ou método quando estende uma classe,
        mas sim apenas quando as classes estão no mesmo pacote 
        */
        
        oPessoa.nomeRua = "Rua";
        System.out.println(oPessoa.getNomeRua());
       
    }
 
}
