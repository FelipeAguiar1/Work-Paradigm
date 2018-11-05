package sistema;

import java.util.ArrayList;

public class Edificio extends Imovel {
    int totalAndares;
    ArrayList<Porta> p1 = new ArrayList();

    public Edificio(int totalAndares, String corIm, boolean aberta, String cor) {
        super(corIm, aberta, cor);
        this.totalAndares = totalAndares;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public void adicionarAndar() {
        this.setTotalAndares(this.getTotalAndares() + 1);
        System.out.println("Andar criado!");
    }
    
    public void totalAndares() {
        System.out.println("Total de andares: " + this.getTotalAndares());
    }
}
