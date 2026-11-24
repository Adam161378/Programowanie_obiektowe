import java.util.Random;

public class przeszukiwanieZWartownikiem {

    public static void wypelnijTablice(int[] tablica, int n) {
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            tablica[i] = random.nextInt(100) + 1;
        }
    }

    public static int wyswietlTablice(int[] tablica, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(tablica[i]);
            if(i < n - 1){
                System.out.println(", ");
            }
        }
        System.out.println();
        return n;
    }

    public static int przeszukajZWartownikiem(int[] tablica, int n, int szukana){
        tablica[n] = szukana;
        int i = 0;
        while(tablica[i] != szukana){
            i++;
        }
        return i;
    }
}