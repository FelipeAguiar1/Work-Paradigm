package sistema;

public class Porta {
    boolean aberta;
    String cor;
    float x;
    float y;
    float z;

    public Porta(boolean aberta, String cor, float x, float y, float z) {
        this.aberta = aberta;
        this.cor = cor;
        this.x = x;
        this.y = y;
        this.z = z;
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

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
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
            return "A porta esta aberta e contem a cor " + this.getCor();
        }
        else {
            return "A porta esta fechada e contem a cor " + this.getCor();
        }
    }
}
