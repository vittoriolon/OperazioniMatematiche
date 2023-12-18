import java.util.Scanner;

public class OperazioniMatematiche {

    public static int somma(int numero1,int numero2){
        int nu1,nu2,som;
        nu1 = numero1;
        nu2 = numero2;
        som = nu1 + nu2;
        return som;

    }

    public static int moltiplicazione(int numero1,int numero2){
        int nu1,nu2,mol;
        nu1 = numero1;
        nu2 = numero2;
        mol = nu1 * nu2;
        return mol;

    }

    public static int divisione(int numero1,int numero2){
        int nu1,nu2,div;
        nu1 = numero1;
        nu2 = numero2;
        div = nu1 / nu2;
        return div;
    }

    public static int modulo(int numero1,int numero2){
        int nu1,nu2,mod;
        nu1 = numero1;
        nu2 = numero2;
        mod = (nu1 % nu2);
        return mod;
    }

    public static void main(String[] args) throws Exception {
        int nu1,nu2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero Numero1:");
        nu1 = scanner.nextInt();
        System.out.println("Inserisci un numero Numero2:");
        nu2 = scanner.nextInt();
        int s = somma(nu1,nu2);
        int m = moltiplicazione(nu1,nu2);
        int d = divisione(nu1,nu2);
        int md = modulo(nu1,nu2);
        System.out.println("Il risultato della somma è" +s);
        System.out.println("Il risultato della moltiplicazione è" +m);
        System.out.println("Il risultato della divisione è" +d);
        System.out.println("Il modulo è" +md);

        scanner.close();
    }
}
