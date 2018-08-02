package vn.codegym;
import java.util.Scanner;

public class MoneyConvert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rate = 23000;
        double usd;
        double money_convert;

        System.out.print("Nhập vào số USD cần đổi: ");
        usd = scan.nextDouble();

        money_convert = usd * rate;

        System.out.println("Số tiền sau khi đổi "+usd + "USD thành VNĐ là:" + money_convert +"VNĐ");

    }
}
