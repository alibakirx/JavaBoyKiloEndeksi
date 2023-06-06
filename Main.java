import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double boy, kilo,boyKiloEndeksi;


        Scanner input = new Scanner(System.in);
        System.out.printf("Boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();


        System.out.printf("Kilonuzu kilogram cinsinden giriniz");
        kilo = input.nextDouble();

        boyKiloEndeksi = kilo / (boy * boy);

        System.out.printf("Boy Kilo Endeksiniz: %,.3f", boyKiloEndeksi);

    }
}