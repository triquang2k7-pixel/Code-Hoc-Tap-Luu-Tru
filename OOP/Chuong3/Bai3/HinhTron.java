
package OOP.Chuong3.Bai3;

import java.util.Scanner;

public class HinhTron {
    // Thuoc tinh
    private double banKinh;

    // Constructor khong tham so
    public HinhTron() {
        banKinh = 0;
    }

    // Constructor co tham so
    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    // Get
    public double getBanKinh() {
        return banKinh;
    }

    // Set
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    // Nhap
    public void nhap(Scanner sc) {
        do {
            System.out.print("Nhap ban kinh: ");
            banKinh = sc.nextDouble();

            if (banKinh <= 0) {
                System.out.println("Ban kinh phai lon hon 0!");
            }
        } while (banKinh <= 0);
    }

    // Tinh dien tich
    public double dienTich() {
        return Math.PI * banKinh * banKinh;
    }

    // Tinh chu vi
    public double chuVi() {
        return 2 * Math.PI * banKinh;
    }

    // Xuat
    public void xuat() {
        System.out.println("Ban kinh: " + banKinh);
        System.out.printf("Dien tich: " + dienTich());
        System.out.printf("Chu vi: " + chuVi());
    }
}
