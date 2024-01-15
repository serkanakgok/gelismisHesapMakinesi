import java.util.Scanner;

public class gelisminHesaplama {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("\nToplam: " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.print("\nÇıkarma: " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.print("\nÇarpım: " + result);
        return result;
    }

    static double devide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        double result = a / b;
        System.out.print("\nBölüm: " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.print("\nÜs hesabı: " + result);
        return result;
    }

    static void fact(int a, int b) {
        int result = 1;
        if (a < b && a > 0) {
            for (int i = a; i <= b; i++) {
                result *= i;
            }
            System.out.println("\nİki sayı arası faktöriyel: " + result);

        } else {
            System.out.println("ilk sayıyı ikincisinden küçük ve pozitif giriniz");
        }
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void square(int a, int b) {
        System.out.println("\nÇevresi = " + (2 * (a + b)));
        System.out.print("Alanı = " + (a * b));
    }


    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int select;

        String list = "1 - Toplama işlemi\n"
                + "2 - Çıkarma işlemi\n"
                + "3 - Çarpma işlemi\n"
                + "4 - Bölme işlemi\n"
                + "5 - Üslü sayı hesaplama\n"
                + "6 - Faktöriyel\n"
                + "7 - Mod alma\n"
                + "8 - Dikdörtgen alan ve çevre hesabı\n"
                + "0 - Çıkış yap";

        while (true) {
            System.out.println(list);
            System.out.print("\nBir şlem seçiniz: ");
            select = data.nextInt();

            if (select == 0) {
                System.out.println("Çıkış yapıldı.");
                break;
            }

            System.out.print("\nİlk sayı: ");
            int a = data.nextInt();
            System.out.print("İkinci sayı: ");
            int b = data.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;

                case 2:
                    minus(a, b);
                    break;

                case 3:
                    times(a, b);
                    break;

                case 4:
                    if (devide(a, b) == 0) {
                        System.out.println("İkinci sayıyı 0'dan farklı giriniz.");
                    }
                    break;

                case 5:
                    power(a, b);
                    break;

                case 6:
                    fact(a, b);
                    break;

                case 7:
                    System.out.println("Mod sonucu: " + mod(a, b));
                    break;

                case 8:
                    square(a, b);
                    break;

                default:
                    System.out.println("Geçersiz bir değer girdiniz.");
                    break;
            }

            break;
        }
    }
}
