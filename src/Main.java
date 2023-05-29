import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r,pi=3.14,alan,cevre,acı,dilimAlanı;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Dairenin yaricapini giriniz : ");
        r=input.nextDouble();
        System.out.println("Lutfen Dairenin Merkez Açı Ölçüsünü Giriniz : ");

        acı = input.nextDouble();
        alan = r*r*pi;
        cevre = 2*pi*r;

        dilimAlanı = (pi*(r*r)*acı)/360;


        System.out.println("Dairenin Alani : "+alan);
        System.out.println("Dairenin Cevresi : "+cevre);
        System.out.println("Daire Diliminin Alanı : "+dilimAlanı);




    }
}