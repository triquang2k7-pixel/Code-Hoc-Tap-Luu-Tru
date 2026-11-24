package OOP.Chuong6.Bai1;

import java.util.Scanner;

public class Viet extends VanPhongPham {

    // Thuoc tinh bo sung
    private String mauMuc;

    // Constructor khong tham so
    public Viet() {
        super();
        mauMuc = "";
    }

    // Constructor co tham so
    public Viet(String ma, String ten, int soLuong,
                double donGia, String mauMuc) {

        super(ma, ten, soLuong, donGia);
        this.mauMuc = mauMuc;
    }

    // Get
    public String getMauMuc() {
        return mauMuc;
    }

    // Set
    public void setMauMuc(String mauMuc) {
        this.mauMuc = mauMuc;
    }

    // Nhap
    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("Nhap mau muc: ");
        mauMuc = sc.nextLine();
    }

    // Xuat
    @Override
    public void xuat() {
        System.out.println("===== VIET (BUT) =====");
        super.xuat();
        System.out.println("Mau muc: " + mauMuc);
    }
}