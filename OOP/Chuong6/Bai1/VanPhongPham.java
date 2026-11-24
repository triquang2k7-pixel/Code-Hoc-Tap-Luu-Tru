package OOP.Chuong6.Bai1;

import java.util.Scanner;

public class VanPhongPham {

    // Thuoc tinh
    private String ma;
    private String ten;
    private int soLuong;
    private double donGia;

    // Constructor khong tham so
    public VanPhongPham() {
        ma = "";
        ten = "";
        soLuong = 0;
        donGia = 0;
    }

    // Constructor co tham so
    public VanPhongPham(String ma, String ten,
                        int soLuong, double donGia) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    // Get
    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    // Set
    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    // Nhap
    public void nhap(Scanner sc) {
        System.out.print("Nhap ma: ");
        ma = sc.nextLine();

        System.out.print("Nhap ten: ");
        ten = sc.nextLine();

        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();

        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();

        sc.nextLine();
    }

    // Xuat
    public void xuat() {
        System.out.println("Ma: " + ma);
        System.out.println("Ten: " + ten);
        System.out.println("So luong: " + soLuong);
        System.out.println("Don gia: " + donGia);
    }
}