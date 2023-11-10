import java.util.Arrays;
import java.util.Scanner;
//Girilen sayiya yakın en büyük ve en küçük sayıları gösteren program"
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 33, 55, 6, 16, 4, 22};
        System.out.print("Bir sayi giriniz: ");
        int input = sc.nextInt();
        System.out.println();
        System.out.println("Dizi :" + Arrays.toString(arr));
        System.out.println("Girilen sayi: " + input);

        int enYakinKucuk=Integer.MIN_VALUE;
        int enYakinBuyuk=Integer.MAX_VALUE;
        for (int eleman:arr) {
            if (eleman<input && eleman>enYakinKucuk){
                enYakinKucuk=eleman;
            } else if (eleman>input && eleman<enYakinBuyuk){
                enYakinBuyuk=eleman;
            }
        }
        System.out.println("Girilen sayidan kucuk en yakin sayi: " + enYakinKucuk);
        System.out.println("Girilen sayidan buyuk en yakin sayi: " + enYakinBuyuk);
    }
}