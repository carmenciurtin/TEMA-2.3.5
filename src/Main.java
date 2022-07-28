import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 2.3.5 b) 1
        System.out.println("Introdu numar1 de la tastatura");
        Scanner scanner = new Scanner(System.in);
        double numar1 = scanner.nextDouble();
        System.out.println("Numar1 introdus de la tastatura este: " + numar1);

        Random rand = new Random();
        int numar2 = rand.nextInt(100) + 1;
        System.out.println("Numar2 generat random intre 1 si 100 este: " + numar2);

        if (numar1 < numar2) {
            System.out.println("Numar1 introdus este mai mic decat " + numar2);
        } else {
            //optional si pentru cazul in care numar1>numar2
            System.out.println("Numar1 introdus este mai mare decat " + numar2);
        }
        // 2.3.5 b) 2
        System.out.println("Introdu un caracter de la tastatura");
        String caracter = scanner.next();
        System.out.println("Caracterul introdus este: " + caracter);
        System.out.println("Introdu numar4 de la tastatura");
        double numar4 = scanner.nextDouble();
        System.out.println("Numarul4 introdus este: " + numar4);
        System.out.println("Introdu numar5 de la tastatura");
        double numar5 = scanner.nextDouble();
        System.out.println("Numarul5 introdus este: " + numar5);
        switch (caracter) {
            case "a": {
                System.out.println("'a': adunare");
                System.out.println(numar4 + numar5);
                break;
            }
            case "s": {
                System.out.println("'s': scadere");
                System.out.println(numar4 - numar5);
                break;
            }
            case "i": {
                System.out.println("'i': inmultire");
                System.out.println(numar4 * numar5);
                break;
            }
            case "p": {
                System.out.println("'p': impartire");
                System.out.println(numar4 / numar5);
                break;
            }
            case "m": {
                System.out.println("'m': modul");
                System.out.println(numar4 % numar5);
                break;
            }
            default: {
                System.out.println("Eroare: Caracterul introdus nu este corect!");
                break;
            }
        }
        // 2.3.5 b) 3
        String[][] salata = new String[3][5];
        salata[0][0] = "rosii";
        salata[0][1] = "castraveti";
        salata[0][2] = "ceapa";
        salata[1][0] = "ulei";
        salata[1][1] = "otet";
        salata[1][2] = "sare";
        salata[1][3] = "piper";
        salata[1][4] = "boia";
        System.out.println("Primul si ultimul element din dimensiunea 1 sunt: ");
        System.out.println(salata[0][0]);
        System.out.println(salata[0][2]);
        System.out.println("Primul si ultimul element din dimensiunea 2 sunt: ");
        System.out.println(salata[1][0]);
        System.out.println(salata[1][4]);

        // 2.3.5 b) 4
        char[] vocale = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 1 ; i < vocale.length; i += 2 ) {
            System.out.println("Caracterul " + i + " din ArrayList este: " + vocale[i]);
        }
        // 2.3.5 b) 5
        double[] numereZecimale = {2, 86.45, 4.5, -35.98};
        for (int j = 0; j < numereZecimale.length; j++) {
            if(numereZecimale [j] == 4.5) {
                System.out.println("Elementul " + j + " din Array este: " + numereZecimale[j]);
            }
            if(numereZecimale [j] > 5){
                System.out.println("Element peste 5 ");
            }
        }

        // 2.3.5 b) 6
        double[] gradeCelsius = {-18, -15.5, 8, 25, 35, 37.5, 40, 50, 100 };
        for (int k = 0; k < gradeCelsius.length; k++) {
            if( k == 2){
                continue;
            }
            if(k == 7) {
                break;
            }
            System.out.println(" Index valid ");
        }

        // 2.3.5 b) 7
        ArrayList <Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(6);
        lista.add(4);
        lista.add(10);
        lista.add(9);
        Integer sumaArrayList = 0;
        int s = 0;
        do {
            sumaArrayList = sumaArrayList + lista.get(s);
            s ++;
        }
        while (s < lista.size()) ;
        System.out.println("Suma celor 5 elemente este egala cu: " + sumaArrayList);

        // 2.3.5 b) 8
        Integer [] zile = {3};
        ArrayList<String> zileSaptamana = new ArrayList<>();
        if(zile.length == 0) {
            System.out.println("Sirul zile este gol");
        } else{
            System.out.println("Sirul zile nu este gol");
        }
        if (zileSaptamana.size() == 0){
            System.out.println("Lista zileSaptamana este goala");
        } else{
            System.out.println("Lista zileSaptamana nu este goala");
        }
    }
}