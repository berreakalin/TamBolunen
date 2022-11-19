import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, toplam=0, sayi=0, ort=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        k=inp.nextInt();

        for (int i = 0; i<=k; i++) {
            if (i%3==0 && i%4==0 ) {
                System.out.println(i);
                toplam += i;
                sayi ++;
            }
        }
        ort = toplam/sayi;
        System.out.println("Ortalama "+ort);
    }
}