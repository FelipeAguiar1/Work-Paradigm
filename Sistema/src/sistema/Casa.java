package sistema;

import java.util.ArrayList;

public class Casa extends Porta {
    String corCasa;
    ArrayList<Porta> portas = new ArrayList();

    public Casa(String corCasa, boolean aberta, String cor, float x, float y, float z) {
        super(aberta, cor, x, y, z);
        adicionarPortas(aberta, cor, x, y, z);
        this.corCasa = corCasa;
    }

    public String getCorCasa() {
        return corCasa;
    }

    public void setCorCasa(String corCasa) {
        this.corCasa = corCasa;
    }
    
    public void pintarCasa(String cor) {
        this.setCorCasa(cor);
        System.out.println("A casa foi pintada da cor " + cor);
    }
    
    public void adicionarPortas(boolean aberta, String cor, float x, float y, float z) {
        Porta p1 = new Porta(aberta, cor, x, y, z);
        Porta p2 = new Porta(aberta, cor, x, y, z);
        Porta p3 = new Porta(aberta, cor, x, y, z);
        portas.add(p1);
        portas.add(p2);
        portas.add(p3);
        System.out.println("Limite de portas estabelecidos: 3");
    }
    
    public void totalDePortas() {
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
    
    public void abrirTodasPortas() {
        int index = 0;
        
        while (index < portas.size()) {
            portas.get(index).setAberta(true);
            index++;
        }
        
        System.out.println("Todas as portas estão abertas!");
    }
    
    public void fecharTodasPortas() {
        int index = 0;
        
        while (index < portas.size()) {
            portas.get(index).setAberta(false);
            index++;
        }
        
        System.out.println("Todas as portas estão fechadas!");
    }
    
    public void pintarPortas(String cor) {
        int index = 0;
        
        while (index < portas.size()) {
            portas.get(index).pintar(cor);
            index++;
        }
        
        System.out.println("As portas foram pintadas!");
    }
    
    
    public String toString() {
        return super.toString() + "\nCasa pintada da cor " + this.getCorCasa();
    }
}
