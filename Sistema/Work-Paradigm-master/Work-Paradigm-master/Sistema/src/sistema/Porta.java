package sistema;

public class Porta {
    boolean aberta;
    String cor;

    public Porta(boolean aberta, String cor) {
        this.aberta = aberta;
        this.cor = cor;
    }

    public boolean getAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void abre() {
        if (this.getAberta()==false) {
            this.setAberta(true);
            System.out.println("A porta esta aberta!");
        }
        else {
            System.out.println("A porta ja esta aberta!");
        }
    }
    
    public void fecha() {
        if (this.getAberta()==true) {
            this.setAberta(false);
            System.out.println("A porta esta fechada!");
        }
        else {
            System.out.println("A porta ja esta fechada!");
        }
    }
    
    public void pintar(String s) {
        this.setCor(s);
        System.out.println("A porta esta pintada da cor " + s);
    }
    
    public boolean estaAberta() {
        return this.getAberta();
    }
    
    public String toString() {
        if (this.getAberta()==true) {
            return "A porta esta aberta e é da cor " + this.getCor();
        }
        else {
            return "A porta esta fechada e é da cor " + this.getCor();
        }
    }
}
