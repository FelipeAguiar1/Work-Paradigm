package sistema;

import java.util.ArrayList;

public class Imovel extends Porta {
    String corIm;
    ArrayList<Porta> portas = new ArrayList();

    public Imovel(String corIm, boolean aberta, String cor) {
        super(aberta, cor);
        this.corIm = corIm;
    }

    public String getCorIm() {
        return this.corIm;
    }

    public void setCorIm(String corIm) {
        this.corIm = corIm;
    }
    
    public void pintarImovel(String s) {
        this.setCorIm(s);
        System.out.println("Cor alterada para " + s);
    }
    
    public void adicionarPortas(Porta p) {
        portas.add(p);
        System.out.println("Porta adicionada!");
    }
    
}
