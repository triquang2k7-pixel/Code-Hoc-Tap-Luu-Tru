package OOP.Chuong1.Bai3;

import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập bán kính hình tròn: ");
        double r = sc.nextDouble();

        double chuVi = 2 * Math.PI * r;
        double dienTich = Math.PI * r * r;

        System.out.printf("Chu vi hình tròn: " + chuVi);
        System.out.printf("Diện tích hình tròn: " + dienTich);

        sc.close();
    }
}