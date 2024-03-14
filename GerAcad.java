//Luccas Philot Goncalves RA: 2525879
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerAcad {
    
    private Academia acad;
    private List<Academia> bdAcad;
    private static GerAcad gaUnic;
    
                
    private GerAcad(){
        bdAcad = new ArrayList<Academia>();
    }
    
    //Método singleton
    public static GerAcad geraGerAcad(){
        if(gaUnic == null){
            gaUnic = new GerAcad();
        }
        return gaUnic;
    }
    
    public List<Academia> getBdAcad(){
            return bdAcad;
    }
    
    
    
    public Academia consResAcad(Academia acad){
		for(int i = 0; i < bdAcad.size(); i++){
			if(acad.getCpf() == bdAcad.get(i).getCpf()){
				return bdAcad.get(i);
			}
		}
		return null;
	}
    
    public Academia insAcad(Academia acad){
		if(consResAcad(acad)== null){
			bdAcad.add(acad);
			return acad;
		}
		else{
			return null;
		}
	}
    
    public Academia delAcadCpf(Academia acad){
                Academia acad1 = consResAcad(acad);
            	if(acad1 != null){
                    bdAcad.remove(acad1);
                    return null;
		}
		else{
                    return acad;
		}
	}

    public Academia atualizaAcadCpf(Academia acad){
        for(int i = 0; i < bdAcad.size(); i++){
            if(acad.getCpf() == bdAcad.get(i).getCpf()){
                acad = bdAcad.get(i);
                String data = JOptionPane.showInputDialog(
                    null,
                    "Informe a NOVA DATA",
                    "NOVA DATA",
                    3
                );
                acad.setData(data);
                String duracao = JOptionPane.showInputDialog(
                    null,
                    "Informe a NOVA duração",
                    "NOVA DURACAO",
                    3
                );
                acad.setDuracao(Integer.parseInt(duracao));
                String parceiros = JOptionPane.showInputDialog(
                    null,
                    "Informe a NOVOS Parceiros",
                    "NOVOS PARCEIROS",
                    3
                );
                acad.setParceiros(Integer.parseInt(parceiros));
                bdAcad.set(i, acad);  
                return bdAcad.get(i);
            }
        }
        return null;
    }
}
