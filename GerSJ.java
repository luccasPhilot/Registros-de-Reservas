//Luccas Philot Goncalves RA: 2525879
import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GerSJ {
    private SalaoJogos salaoJ;
    private List<SalaoJogos> bdSalaoJ;
    private static GerSJ SJUnic;
    private GerSJ(){
        bdSalaoJ = new ArrayList<SalaoJogos>();
    }
    //Método singleton
    public static GerSJ geraGerSJ(){
        if(SJUnic == null){
            SJUnic = new GerSJ();
        }
        return SJUnic;
    }
    
    public List<SalaoJogos> getBdSJ(){
            return bdSalaoJ;
    }
    
    public SalaoJogos consResSJ(SalaoJogos salaoJ){
		for(int i = 0; i < bdSalaoJ.size(); i++){
			if(salaoJ.getCpf() == bdSalaoJ.get(i).getCpf()){
				return bdSalaoJ.get(i);
			}
		}
		return null;
	}
    
    public SalaoJogos insSJ(SalaoJogos salaoJ){
		if(consResSJ(salaoJ)== null){
			bdSalaoJ.add(salaoJ);
			return salaoJ;
		}
		else{
			return null;
		}
	}
    
    public SalaoJogos delSJCpf(SalaoJogos salaoJ){
                SalaoJogos salaoJ1 = consResSJ(salaoJ);
            	if(salaoJ1 != null){
                    bdSalaoJ.remove(salaoJ1);
                    return null;
		}
		else{
                    return salaoJ;
		}
		
	}

	public SalaoJogos atualizaSJCpf(SalaoJogos salaoJ){
		for(int i = 0; i < bdSalaoJ.size(); i++){
			if(salaoJ.getCpf() == bdSalaoJ.get(i).getCpf()){
				salaoJ = bdSalaoJ.get(i);
                                String data = JOptionPane.showInputDialog(
                                    null,
                                    "Informe a NOVA DATA",
                                    "NOVA DATA",
                                    3
                                );
                                salaoJ.setData(data);
                                
                                String duracao = JOptionPane.showInputDialog(
                                    null,
                                    "Informe a NOVA duração",
                                    "NOVA DURACAO",
                                    3
                                );
                                salaoJ.setDuracao(Integer.parseInt(duracao));
                                
				bdSalaoJ.set(i, salaoJ);  
                                return bdSalaoJ.get(i);
			}
		}
                return null;
	}
}
