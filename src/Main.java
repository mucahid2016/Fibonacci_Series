import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, n1 = 0, n2 = 1, n3 ;

        System.out.print("N değerini giriniz: ");
        n = input.nextInt();

        for (int i = 2; i <= n; i++){
            n3 = n1 + n2;
            System.out.println(n1+" + "+n2+" = "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
