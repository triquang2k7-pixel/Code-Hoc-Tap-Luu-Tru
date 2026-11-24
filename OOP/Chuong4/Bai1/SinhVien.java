package OOP.Chuong4.Bai1;

import java.util.Scanner;

public class SinhVien extends Nguoi {

    // Thuoc tinh bo sung
    private int maSV;
    private String lop;

    // Constructor khong tham so
    public SinhVien() {
        super();
        maSV = 0;
        lop = "";
    }

    // Constructor co tham so
    public SinhVien(String soDinhDanh, String hoTen, int namSinh,
                    String diaChi, NoiSinh noiSinh,
                    int maSV, String lop) {

        super(soDinhDanh, hoTen, namSinh, diaChi, noiSinh);

        this.maSV = maSV;
        this.lop = lop;
    }

    // Get
    public int getMaSV() {
        return maSV;
    }

    public String getLop() {
        return lop;
    }

    // Set
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    // Nhap
    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("Nhap ma sinh vien: ");
        maSV = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap lop: ");
        lop = sc.nextLine();
    }

    // Xuat
    @Override
    public void xuat() {
        super.xuat();

        System.out.println("Ma sinh vien: " + maSV);
        System.out.println("Lop: " + lop);
    }
}