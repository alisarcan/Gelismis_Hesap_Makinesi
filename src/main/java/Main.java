import java.util.Scanner;
public class Main {
    static int sum(int a, int b){
        int result = a + b;
        System.out.print("Toplam : " + result);
        return result;
    }

    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;
    }
    static int times(int a, int b){
        int result = a * b;
        System.out.println("Çarpım :" + result);
        return result;
    }
    static int divided(int a, int b){
        if(b == 0){
            System.out.println("İkinci sayı sıfırdan farklı olmalı");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölüm : " + result);
        return result;
    }
    static int power(int a, int b){
        int result =1;
        for (int i = 1;i <= b;i++){
            result *= a;
        }
        return result;
    }
    static int mod(int a,int b){
        return a % b;
    }
    static void calc(int a, int b){
        System.out.println("çevresi" + (2*(a+b)));
        System.out.println(("Alanı" + (a*b)));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        while (true){
            System.out.println(menu);
            System.out.print("Bir İşlem Seçiniz :");
            select = scan.nextInt();
            if (select == 0){
                break;
            }
            System.out.print("İlk sayıyı giriniz : ");
            int a = scan.nextInt();
            System.out.print("İkinci sayıyı giriniz :");
            int b = scan.nextInt();
            switch (select){
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
                    divided(a, b);
                    break;
                case 5:
                    System.out.println("Üs Hesabı :" + power(a,b));
                    break;
                case 6:
                    System.out.println("Mod işlemi" + mod(a,b));
                    break;
                case 7:
                    calc(a, b);
                    break;
                default:
                    System.out.println("Geçerisiz bir İşlem girdiniz");
            }
        }


        System.out.println("Güle Güle");
    }
}
