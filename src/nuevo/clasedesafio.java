package nuevo;

import java.util.Scanner;

public class clasedesafio {
    public static void main(String[] args) {
        System.out.println(piedra());
        System.out.println(primos(7));
        System.out.println(sueldo(45));
        ejercicioc5a articulo;
        articulo =  new ejercicioc5a ("articulo1", 1000, 100);
        System.out.println("precio " + articulo.consultarPrecio());
    }

    public static Integer piedra() {
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("¿Piedra, papel, Tijera o spock?");
        String uno = input.nextLine();
        System.out.println("participante dos: ¿Piedra, papel, Tijera o spock?");
        String dos = input.nextLine();

        if ((uno.equals("Papel") && dos.equals("Piedra")) || (uno.equals("Tijera") && dos.equals("Papel")) || (uno.equals("Piedra") && dos.equals("Tijera")) || (uno.equals("Spock") && dos.equals("Tijera")) || (uno.equals("Spock") && dos.equals("Piedra"))) {
            return 1;
        } else if (uno.equals(dos)) {
            return 0;
        } else {
            return 2;
        }

    }

    public static boolean primos(int n) {

        int contadora = 0;

        int i = 1;
        while(contadora < n){
            i++;
            if(esPrimo(i)){
                    contadora++;
                System.out.println(i);
            }}


        return false; // no entiendo por que debe devolver algo
    }


    public static boolean esDivisible(int numero1,int numero2) {
        if (numero1 % numero2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean esPrimo(int n) {
        for(int i=2;i<n;i++) {
            if(esDivisible(n,i))
                return false;
        }
        return true;
    }


    public  static double sueldo(int n ){

        if(n<40) {
            return n*875;
        } else {
            double sueldoSemanal =  (n-40)*(875*1.5) + (40*875);
            return sueldoSemanal;

        }

    }
}
