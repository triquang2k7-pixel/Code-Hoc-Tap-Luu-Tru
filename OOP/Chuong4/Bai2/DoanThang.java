package OOP.Chuong4.Bai2;

import java.util.Scanner;

public class DoanThang {

    // Hai diem mau cua doan thang
    private DiemMau diem1;
    private DiemMau diem2;

    // Constructor khong tham so
    public DoanThang() {
        diem1 = new DiemMau();
        diem2 = new DiemMau();
    }

    // Constructor co tham so
    public DoanThang(DiemMau diem1, DiemMau diem2) {
        this.diem1 = diem1;
        this.diem2 = diem2;
    }

    // Get
    public DiemMau getDiem1() {
        return diem1;
    }

    public DiemMau getDiem2() {
        return diem2;
    }

    // Set
    public void setDiem1(DiemMau diem1) {
        this.diem1 = diem1;
    }

    public void setDiem2(DiemMau diem2) {
        this.diem2 = diem2;
    }

    // Nhap
    public void nhap(Scanner sc) {
        System.out.println("--- Nhap diem thu nhat ---");
        diem1.nhap(sc);

        System.out.println("--- Nhap diem thu hai ---");
        diem2.nhap(sc);
    }

    // Xuat
    public void xuat() {
        System.out.println("--- Diem thu nhat ---");
        diem1.xuat();

        System.out.println("--- Diem thu hai ---");
        diem2.xuat();
    }

    // Tinh khoang cach hai diem
    public double khoangCach() {
        int dx = diem1.getX() - diem2.getX();
        int dy = diem1.getY() - diem2.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }

    // Kiem tra hai diem co cung mau khong
    public boolean cungMau() {
        return diem1.getMau() == diem2.getMau();
    }
}