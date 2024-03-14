//Luccas Philot Goncalves RA: 2525879
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerSF {
    
    private SalaoFestas salaoF;
    private List<SalaoFestas> bdSalaoF;
    private static GerSF SFUnic;
    
    public static GerSF geraGerSF(){
        if(SFUnic == null){
            SFUnic = new GerSF();
        }
        return SFUnic;
    }
    
    private GerSF(){
        bdSalaoF = new ArrayList<SalaoFestas>();
    }
    
    public List<SalaoFestas> getBdSF(){
            return bdSalaoF;
    }
    
    public SalaoFestas consResSF(SalaoFestas salaoF){
		for(int i = 0; i < bdSalaoF.size(); i++){
			if(salaoF.getCpf() == bdSalaoF.get(i).getCpf()){
				return bdSalaoF.get(i);
			}
		}
		return null;
	}
    
    public SalaoFestas insSF(SalaoFestas salaoF){
		if(consResSF(salaoF)== null){
			bdSalaoF.add(salaoF);
			return salaoF;
		}
		else{
			return null;
		}
	}
    
    public SalaoFestas delSFCpf(SalaoFestas salaoF){
                SalaoFestas salaoF1 = consResSF(salaoF);
            	if(salaoF1 != null){
                    bdSalaoF.remove(salaoF1);
                    return null;
		}
		else{
                    return salaoF;
		}
		
	}

    public SalaoFestas atualizaSFCpf(SalaoFestas salaoF){
		for(int i = 0; i < bdSalaoF.size(); i++){
			if(salaoF.getCpf() == bdSalaoF.get(i).getCpf()){
				salaoF = bdSalaoF.get(i);
                                String data = JOptionPane.showInputDialog(
                                    null,
                                    "Informe a NOVA DATA",
                                    "NOVA DATA",
                                    3
                                );
                                salaoF.setData(data);
                                
                                String duracao = JOptionPane.showInputDialog(
                                    null,
                                    "Informe a NOVA duração",
                                    "NOVA DURACAO",
                                    3
                                );
                                salaoF.setDuracao(Integer.parseInt(duracao));
                                
				bdSalaoF.set(i, salaoF);  
                                return bdSalaoF.get(i);
			}
		}
                return null;
	}
}
