package OOP.Chuong3.Bai4;

import java.util.Scanner;

public class SinhVien {

    // Thuoc tinh
    private String maSV;
    private String hoTen;
    private String lop;
    private double diemMon1;
    private double diemMon2;
    private double diemMon3;

    // Constructor khong tham so
    public SinhVien() {
        maSV = "";
        hoTen = "";
        lop = "";
        diemMon1 = 0;
        diemMon2 = 0;
        diemMon3 = 0;
    }

    // Constructor co tham so
    public SinhVien(String maSV, String hoTen, String lop,
                    double diemMon1, double diemMon2, double diemMon3) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
    }

    // Get
    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public double getDiemMon1() {
        return diemMon1;
    }

    public double getDiemMon2() {
        return diemMon2;
    }

    public double getDiemMon3() {
        return diemMon3;
    }

    // Set
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setDiemMon1(double diemMon1) {
        this.diemMon1 = diemMon1;
    }

    public void setDiemMon2(double diemMon2) {
        this.diemMon2 = diemMon2;
    }

    public void setDiemMon3(double diemMon3) {
        this.diemMon3 = diemMon3;
    }

    // Nhap diem
    private double nhapDiem(Scanner sc, String tenMon) {
        double diem;

        do {
            System.out.print("Nhap " + tenMon + ": ");
            diem = sc.nextDouble();

            if (diem < 0 || diem > 10) {
                System.out.println("Diem phai tu 0 den 10!");
            }
        } while (diem < 0 || diem > 10);

        return diem;
    }

    // Nhap thong tin sinh vien
    public void nhap(Scanner sc) {
        System.out.print("Nhap ma sinh vien: ");
        maSV = sc.nextLine();

        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();

        System.out.print("Nhap lop: ");
        lop = sc.nextLine();

        diemMon1 = nhapDiem(sc, "diem mon 1");
        diemMon2 = nhapDiem(sc, "diem mon 2");
        diemMon3 = nhapDiem(sc, "diem mon 3");

        sc.nextLine();
    }

    // Tinh diem trung binh
    public double tinhDiemTrungBinh() {
        return (diemMon1 + diemMon2 + diemMon3) / 3;
    }

    // Xep loai
    public String xepLoai() {
        double dtb = tinhDiemTrungBinh();

        if (dtb >= 8) {
            return "Gioi";
        } else if (dtb >= 6.5) {
            return "Kha";
        } else if (dtb >= 5) {
            return "Trung binh";
        } else if (dtb >= 3.5) {
            return "Yeu";
        } else {
            return "Kem";
        }
    }

    // Xuat thong tin
    public void xuat() {
        System.out.println("Ma sinh vien: " + maSV);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Lop: " + lop);
        System.out.println("Diem mon 1: " + diemMon1);
        System.out.println("Diem mon 2: " + diemMon2);
        System.out.println("Diem mon 3: " + diemMon3);

        System.out.printf("Diem trung binh: " + tinhDiemTrungBinh());

        System.out.println("Xep loai: " + xepLoai());
    }
}
