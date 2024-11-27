import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2, choice;

        double result = 0;

        System.out.print("Birinci sayıyı giriniz => ");
        n1 = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz => ");
        n2 = scan.nextInt();

        System.out.print("""
                Toplama => 1
                Çıkarma => 2
                Çarpma  => 3
                Bölme   => 4
                """);
        System.out.print("İşlem seçiniz => ");
        choice = scan.nextInt();

        switch (choice){
            case 1:

                result = n1 + n2;

                break;

            case 2:

                result = n1 - n2;

                break;

            case 3:

                result = n1 * n2;

                break;

            case 4:
                if (n2 != 0)result = (double) n1 / n2;
                else System.out.println("Bir sayının 0'a bölümü tanımsızdır.");
                break;

            default:
                System.out.print("Hatalı seçim !!");
                break;

        }

        System.out.print("Sonuç => " + result);

    }
}
