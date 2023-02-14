import java.sql.PreparedStatement;
import java.util.Scanner;

public class PrimeNumbers {
    static boolean pNumbers(int n,int i){
        if(n <= 2 )
            return (n == 2 ) ? true : false;
        if (n % i == 0 )
            return false;
        if (i * i > n)

            return true;
        return  pNumbers(n,i+1);

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int n =inp.nextInt();

        if (pNumbers(n,2)) {
            System.out.print(n + " " + "Sayısı ASAL bir sayıdır.");
        }else{
            System.out.print(n + " " +"Sayısı ASAL sayı değildir !");
        }

    }
}
