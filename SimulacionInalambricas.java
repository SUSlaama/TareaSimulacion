import java.util.Scanner;

public class SimulacionInalambricas {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        int can;
        double pot = 55;
        int por = 0;
        int pt = 100;

        System.out.println("Indique la cantidad de cristas: ");
        can = leer.nextInt();

        System.out.println("Cálculos intermedios:");
        for (int i = 1; i <= can; i++) {
            por = por + 10;
            pt = pt - por;
            pot = (pt * pot) / 100;
            System.out.println("La potencia con " + i + " cristal(es) a 1 metro es de " + pot);
        }

        System.out.println("La potencia final de " + can + " cristales a 1 metro es de " + pot);
    }
}