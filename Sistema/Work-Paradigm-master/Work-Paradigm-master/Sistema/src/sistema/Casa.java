package sistema;

//import java.util.ArrayList;

public class Casa extends Imovel {

    public Casa(String corIm, boolean aberta, String cor) {
        super(corIm, aberta, cor);
    }
    
    public void totaldePortas() {
        System.out.println("Total de portas: " + portas.size());
    }
    
    public int portasAbertas() {
        int index = 0;
        int cont = 0;
        
        while (index < portas.size()) {
            if (portas.get(index).getAberta()==true) {
                cont++;
            }
            index++;
        }
        
        return cont;
    }
}
