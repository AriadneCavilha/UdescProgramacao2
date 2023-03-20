
package Lista1.Exercicio5;

/**
 *
 * @author ariadne
 */
public class Pessoa {
    private String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }
    
    public String criaPessoa(String nome) {
        return nome;
    }
    
    
    public int calcula(int a, int b) {
       return a+b; 
    }
    
    public String calcula(String a, String b) {
        return a+b;
    }
    
    public double calcula(double a, double b) {
        return a+b;
    }
}
