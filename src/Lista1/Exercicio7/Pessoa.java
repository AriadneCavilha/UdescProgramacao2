
package Lista1.Exercicio7;

import java.util.ArrayList;

/**
 *
 * @author ariadne
 */
public class Pessoa {
    private String nome;
    private String sexo;
    private ArrayList<Pessoa> oPessoa = new ArrayList(); 
    
    Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }
    
    protected void armazenaPessoa() {
        oPessoa.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public ArrayList<Pessoa> getoPessoa() {
        return oPessoa;
    }
    
    
}
