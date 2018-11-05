package sistema;

import java.util.*;

public class Sistema {
    
    public static void main(String[] args) {
        /*
        Porta p1 = new Porta(true, "verde");
        System.out.println(p1);
        Casa c1 = new Casa("verde", true, "azul");
        System.out.println(c1);
        c1.abrirTodasPortas();
        c1.pintarCasa("preta");
*/      
        int op, cont = 0, cont_1 = 0, op1;
        String boo, boo2;
        
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Qual imovel deseja criar?");
        System.out.println("Casa (press 1)");
        System.out.println("Edificio (press2)");
        op = ent.nextInt();
        
        while (cont==0) {
            switch (op) {
                case 1:
                    System.out.println("Operações:");
                    System.out.println("Cor da casa:");
                    boo = ent.next();
                    System.out.println("Cor da porta:");
                    boo2 = ent.next();
                    Casa c1 = new Casa(boo, false, boo2);
                    System.out.println("Operação realizada!");
                    System.out.println(c1);
                    while (cont_1==0) {
                        System.out.println("Operações adicionais: ");
                        System.out.println("Pintar casa (press 1)");
                        System.out.println("Adicionar porta (press 2)");
                        System.out.println("Abrir portas (press 3)");
                        op1 = ent.nextInt();
                        if (op1==1) {
                            c1.pintar(boo);
                        }
                    }
            }
        }
            
    }
    
}
