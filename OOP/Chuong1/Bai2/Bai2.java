package OOP.Chuong1.Bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều dài: ");
        double chieuDai = sc.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double chieuRong = sc.nextDouble();

        double chuVi = (chieuDai + chieuRong) * 2;
        double dienTich = chieuDai * chieuRong;

        System.out.printf("Chu vi hình chữ nhật: " + chuVi);
        System.out.printf("Diện tích hình chữ nhật: " + dienTich);

        sc.close();
    }
}