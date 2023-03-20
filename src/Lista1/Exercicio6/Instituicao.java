
package Lista1.Exercicio6;

/**
 *
 * @author ariadne
 */
public abstract class Instituicao {
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private String nome;
    private String endereco;
    private int telefone;
    private int cnpj;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Instituicao(String nome, String endereco, int telefone, int cnpj) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cnpj = cnpj;
    }
    //</editor-fold>

    
    
    //<editor-fold defaultstate="collapsed" desc="Setters">
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
        
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters">
    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }
    //</editor-fold> 
}
