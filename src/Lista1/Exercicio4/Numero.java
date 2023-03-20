
package Lista1.Exercicio4;

/**
 *
 * @author ariadne
 */
public class Numero {
    private static int numero;
    
    public static void mudaNumero(int numero) {
       numero = 2; 
    }
    
    public static void mudaNumeroReferencia(int numero) {
        Numero.numero = 26;
    }

    public static int getNumero() {
        return numero;
    }
    
}
