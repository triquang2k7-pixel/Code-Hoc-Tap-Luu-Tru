
package OOP.Chuong5.LuyenTap;

import java.util.Scanner;

public class HinhTron extends HinhHoc {

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
    @Override
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
    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    // Tinh chu vi
    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    // Xuat
    @Override
    public void xuat() {
        System.out.println("Hinh tron");
        System.out.println("Ban kinh: " + banKinh);
    }
}
