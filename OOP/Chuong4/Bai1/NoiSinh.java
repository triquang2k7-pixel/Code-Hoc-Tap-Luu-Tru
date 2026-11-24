package OOP.Chuong4.Bai1;

import java.util.Scanner;

public class NoiSinh {
    // Thuoc tinh
    private String phuong;
    private String quan;
    private String tinhThanh;

    // Constructor khong tham so
    public NoiSinh() {
        phuong = "";
        quan = "";
        tinhThanh = "";
    }

    // Constructor co tham so
    public NoiSinh(String phuong, String quan, String tinhThanh) {
        this.phuong = phuong;
        this.quan = quan;
        this.tinhThanh = tinhThanh;
    }

    // Get
    public String getPhuong() {
        return phuong;
    }

    public String getQuan() {
        return quan;
    }

    public String getTinhThanh() {
        return tinhThanh;
    }

    // Set
    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public void setTinhThanh(String tinhThanh) {
        this.tinhThanh = tinhThanh;
    }

    // Nhap
    public void nhap(Scanner sc) {
        System.out.print("Nhap phuong: ");
        phuong = sc.nextLine();

        System.out.print("Nhap quan: ");
        quan = sc.nextLine();

        System.out.print("Nhap tinh thanh: ");
        tinhThanh = sc.nextLine();
    }

    // Xuat
    public void xuat() {
        System.out.println("Phuong: " + phuong);
        System.out.println("Quan: " + quan);
        System.out.println("Tinh thanh: " + tinhThanh);
    }
}