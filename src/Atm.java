import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        String userName, password;
        int right = 3, balance = 1500, price;
        Scanner input = new Scanner(System.in);
        int select;
        while (right > 0) {
            System.out.print("Lütfen kullanıcı adınızı giriniz:");
            userName = input.nextLine();
            System.out.print("Lütfen şifrenizi giriniz:");
            password = input.nextLine();

            if (userName.equals("canozcan") && password.equals("123456")) {
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz:");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktar:");
                            price = input.nextInt();
                            balance = balance + price;
                            System.out.println("Yeni Bakiye : " + balance);
                            break;
                        case 2:
                            System.out.print(" Çekmek istediğiniz miktarı giriniz:");
                            price = input.nextInt();
                            if (balance >= price) {
                                balance = balance - price;
                                System.out.println("Yeni Bakiye : " + balance);
                            } else
                                System.out.println("Yetersiz Bakiye");
                            break;
                        case 3:
                            System.out.println(" Mevcut Bakiye: " + balance);
                    }
                } while (select != 4);
                System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");


            } else {
                System.out.println(" Hatalı Şifre Tekrar Deneyiniz");
                right--;
                if (right == 0)
                    System.out.println("Kartınız Bloke olmuştur lütfen banka ile iletişime geçiniz");
                else
                    System.out.println("Kalan hakkınız " + right);
            }
        }
    }
}