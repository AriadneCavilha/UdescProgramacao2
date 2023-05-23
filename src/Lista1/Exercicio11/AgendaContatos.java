/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.Exercicio11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ariad
 */
public class AgendaContatos implements Contatos{
    List<AgendaContatos> contatos = new ArrayList();
    private int telefone;
    private String nome;

    public AgendaContatos(int telefone, String nome) {
        this.telefone = telefone;
        this.nome = nome;
    }
    
    public List<AgendaContatos> getContatos() {
        return contatos;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getNome() {
        return nome;
    }
    
    @Override
    public String buscarContatosNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cadastrarContato(AgendaContatos oContato){
        contatos.add(oContato);
    }

    @Override
    public void removerContato() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean buscarContatosTelefone(AgendaContatos oContato) {
        for(AgendaContatos objetoContato: contatos) {
            if(objetoContato.getTelefone() == oContato.getTelefone()) {
                return true;
            }
        }
        
        return false;
    }
    
    
    public static void main(String[] args){
        AgendaContatos oContato1 = new AgendaContatos(123, "Teste");
        oContato1.cadastrarContato(oContato1);
        String sTelefoneEncontrado = oContato1.buscarContatosTelefone(oContato1) ? "Telefone encontrado" : "Telefone não encontrado";
        System.out.println(sTelefoneEncontrado);
    }
}
