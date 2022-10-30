import java.net.SocketOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int kdvOran;
        double fiyat,toplam,kdv;
        Scanner input = new Scanner(System.in);
        System.out.println("Ürün fiyatı giriniz : ");
        fiyat = input.nextDouble();
        kdvOran = fiyat>0 && fiyat<1000 ? 18 : 8;
        kdv=(fiyat*kdvOran)*0.01;
        toplam=fiyat+kdv;
        System.out.println("Kdv Oranı :" + kdvOran);
        System.out.println("Kdv miktarı :" + kdv);
        System.out.println("Kdv dahil fiyat :" + toplam);

    }
}