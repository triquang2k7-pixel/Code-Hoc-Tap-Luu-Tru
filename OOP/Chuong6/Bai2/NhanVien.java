package OOP.Chuong6.Bai2;

import java.util.Scanner;

public class NhanVien extends CanBo {

    // Thuoc tinh bo sung
    private String congViec;

    // Constructor khong tham so
    public NhanVien() {
        super();
        congViec = "";
    }

    // Constructor co tham so
    public NhanVien(String ma, String hoTen, int tuoi,
                    String diaChi, String congViec) {

        super(ma, hoTen, tuoi, diaChi);
        this.congViec = congViec;
    }

    // Get
    public String getCongViec() {
        return congViec;
    }

    // Set
    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    // Nhap
    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("Nhap cong viec: ");
        congViec = sc.nextLine();
    }

    // Xuat
    @Override
    public void xuat() {
        System.out.println("===== NHAN VIEN =====");
        super.xuat();
        System.out.println("Cong viec: " + congViec);
    }
}