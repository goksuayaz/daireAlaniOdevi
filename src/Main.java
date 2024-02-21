import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double r;
        int a;
        final double pi = 3.14;

        System.out.print("Yarıçapı Giriniz : ");
        r = inp.nextDouble();

        System.out.print("Merkez Açısının Ölçüsünü Giriniz : ");
        a = inp.nextInt();

        double daireAlani = ((pi * (r * r) * a) / 360);
        System.out.println("Daire Alani " + daireAlani);
    }
}