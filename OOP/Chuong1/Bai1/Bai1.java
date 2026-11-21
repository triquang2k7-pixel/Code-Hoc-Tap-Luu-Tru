package OOP.Chuong1.Bai1;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int b = sc.nextInt();

        System.out.println("Tổng: " + (a + b));
        System.out.println("Hiệu: " + (a - b));
        System.out.println("Tích: " + (a * b));

        if (b != 0) {
            double thuong = (double) a / b;
            System.out.printf("Thương: " + thuong);
        } else {
            System.out.println("Thương: Không thể chia cho 0");
        }

        sc.close();
    }
}