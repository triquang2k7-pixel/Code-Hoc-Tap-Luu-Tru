package OOP.Chuong4.Bai1;

import java.util.Scanner;

public class Nguoi {
    // Thuoc tinh
    private String soDinhDanh;
    private String hoTen;
    private int namSinh;
    private String diaChi;
    private NoiSinh noiSinh;

    // Constructor khong tham so
    public Nguoi() {
        soDinhDanh = "";
        hoTen = "";
        namSinh = 0;
        diaChi = "";
        noiSinh = new NoiSinh();
    }

    // Constructor co tham so
    public Nguoi(String soDinhDanh, String hoTen, int namSinh,
                 String diaChi, NoiSinh noiSinh) {
        this.soDinhDanh = soDinhDanh;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.noiSinh = noiSinh;
    }

    // Get
    public String getSoDinhDanh() {
        return soDinhDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public NoiSinh getNoiSinh() {
        return noiSinh;
    }

    // Set
    public void setSoDinhDanh(String soDinhDanh) {
        this.soDinhDanh = soDinhDanh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setNoiSinh(NoiSinh noiSinh) {
        this.noiSinh = noiSinh;
    }

    // Nhap
    public void nhap(Scanner sc) {
        System.out.print("Nhap so dinh danh: ");
        soDinhDanh = sc.nextLine();

        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();

        System.out.print("Nhap nam sinh: ");
        namSinh = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();

        System.out.println("--- Nhap noi sinh ---");
        noiSinh = new NoiSinh();
        noiSinh.nhap(sc);
    }

    // Xuat
    public void xuat() {
        System.out.println("So dinh danh: " + soDinhDanh);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Dia chi: " + diaChi);

        System.out.println("--- Noi sinh ---");
        noiSinh.xuat();
    }
}