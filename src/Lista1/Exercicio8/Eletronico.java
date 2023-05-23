
package Lista1.Exercicio8;

/**
 *
 * @author ariadne
 */
public class Eletronico {
    private String nome;
    private int codigoModelo;

    public Eletronico(String nome, int codigoModelo) {
        this.nome = nome;
        this.codigoModelo = codigoModelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoModelo() {
        return codigoModelo;
    }

    public void setCodigoModelo(int codigoModelo) {
        this.codigoModelo = codigoModelo;
    }
}
