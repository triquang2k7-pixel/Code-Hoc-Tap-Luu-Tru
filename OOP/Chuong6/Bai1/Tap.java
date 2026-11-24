package OOP.Chuong6.Bai1;

import java.util.Scanner;

public class Tap extends VanPhongPham {

    // Thuoc tinh bo sung
    private int soTrang;

    // Constructor khong tham so
    public Tap() {
        super();
        soTrang = 0;
    }

    // Constructor co tham so
    public Tap(String ma, String ten, int soLuong,
               double donGia, int soTrang) {

        super(ma, ten, soLuong, donGia);
        this.soTrang = soTrang;
    }

    // Get
    public int getSoTrang() {
        return soTrang;
    }

    // Set
    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    // Nhap
    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("Nhap so trang: ");
        soTrang = sc.nextInt();

        sc.nextLine();
    }

    // Xuat
    @Override
    public void xuat() {
        System.out.println("===== TAP (VO) =====");
        super.xuat();
        System.out.println("So trang: " + soTrang);
    }
}