/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Lista1.Exercicio11;

/**
 *
 * @author ariad
 */
public interface Contatos {
    public boolean buscarContatosTelefone(AgendaContatos oContato);
    public String buscarContatosNome();
    public void cadastrarContato(AgendaContatos oContato) throws AgendaContatosException;
    public void removerContato();
}
