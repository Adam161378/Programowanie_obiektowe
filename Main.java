import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    przeszukiwanieZWartownikiem szukanie = new przeszukiwanieZWartownikiem();
    final int n = 50;
    int tablica[] = new int[n + 1];
    szukanie.wypelnijTablice(tablica, n);

    Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą do wyszukania (1-100): ");
        int szukana = scanner.nextInt();

        int indeks = szukanie.przeszukajZWartownikiem(tablica, n, szukana);
        System.out.println("\nZawartość tablicy: ");
        szukanie.wyswietlTablice(tablica, n);

        if(indeks == n){
            System.out.println("Szukanej wartości ( " + szukana + " )nie ma w tablicy");
        }else{
            System.out.println("Szukana wartość znajduje się pod indeksem: " + indeks);
        }

        }
    }
