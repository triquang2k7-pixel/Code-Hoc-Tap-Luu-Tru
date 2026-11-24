
package OOP.Chuong5.LuyenTap;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {

    // Thuoc tinh
    private double chieuDai;
    private double chieuRong;

    // Constructor khong tham so
    public HinhChuNhat() {
        chieuDai = 0;
        chieuRong = 0;
    }

    // Constructor co tham so
    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    // Get
    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    // Set
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    // Nhap
    @Override
    public void nhap(Scanner sc) {
        do {
            System.out.print("Nhap chieu dai: ");
            chieuDai = sc.nextDouble();

            if (chieuDai <= 0) {
                System.out.println("Chieu dai phai lon hon 0!");
            }
        } while (chieuDai <= 0);

        do {
            System.out.print("Nhap chieu rong: ");
            chieuRong = sc.nextDouble();

            if (chieuRong <= 0) {
                System.out.println("Chieu rong phai lon hon 0!");
            }
        } while (chieuRong <= 0);
    }

    // Tinh dien tich
    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    // Tinh chu vi
    @Override
    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    // Xuat
    @Override
    public void xuat() {
        System.out.println("Hinh chu nhat");
        System.out.println("Chieu dai: " + chieuDai);
        System.out.println("Chieu rong: " + chieuRong);
    }
}
