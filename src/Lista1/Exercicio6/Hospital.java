
package Lista1.Exercicio6;
import java.util.ArrayList;


/**
 *
 * @author ariadne
 */
public class Hospital extends Instituicao {
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private int quantidadeMateriaisHospitalares;
    private String tipoMaterialHospitalar;
    private ArrayList<Hospital> oHospital = new ArrayList();
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Hospital(String nome, String endereco, int telefone, int cnpj) {
        super(nome, endereco, telefone, cnpj);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Métodos">
    public void setMateriaisHospitalaresExistentes(String tipoMaterial, int quantidadeMateriaisHospitalares) {
        this.quantidadeMateriaisHospitalares = quantidadeMateriaisHospitalares;
        this.tipoMaterialHospitalar = tipoMaterial;
        oHospital.add(this);
    }
    
    public boolean buscaTipoMaterialHospitalar(String tipoMaterial) {
        boolean materialHospitalarEncontrado = false;
        for(Hospital hospital : oHospital) {
            if(hospital.tipoMaterialHospitalar.equalsIgnoreCase(tipoMaterial)) {
                materialHospitalarEncontrado = true;
            }
        }
        return materialHospitalarEncontrado;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters">
    public int getQuantidadeMateriaisHospitalares() {
        return quantidadeMateriaisHospitalares;
    }

    public String getTipoMaterialHospitalar() {
        return tipoMaterialHospitalar;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Setters">
    public void setTipoMaterialHospitalar(String tipoMaterialHospitalar) {
        this.tipoMaterialHospitalar = tipoMaterialHospitalar;
    }
    
    public void setQuantidadeMateriaisHospitalares(int quantidadeMateriaisHospitalares) {
        this.quantidadeMateriaisHospitalares = quantidadeMateriaisHospitalares;
    }
    //</editor-fold>
}
