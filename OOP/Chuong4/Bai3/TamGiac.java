package OOP.Chuong4.Bai3;

import java.util.Scanner;
import OOP.Chuong4.Bai2.Diem;

public class TamGiac {

    // Ba dinh cua tam giac
    private Diem A;
    private Diem B;
    private Diem C;

    // Constructor khong tham so
    public TamGiac() {
        A = new Diem();
        B = new Diem();
        C = new Diem();
    }

    // Constructor co tham so
    public TamGiac(Diem A, Diem B, Diem C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    // Get
    public Diem getA() {
        return A;
    }

    public Diem getB() {
        return B;
    }

    public Diem getC() {
        return C;
    }

    // Set
    public void setA(Diem A) {
        this.A = A;
    }

    public void setB(Diem B) {
        this.B = B;
    }

    public void setC(Diem C) {
        this.C = C;
    }

    // Nhap tam giac
    public void nhap(Scanner sc) {
        System.out.println("--- Nhap dinh A ---");
        A.nhap(sc);

        System.out.println("--- Nhap dinh B ---");
        B.nhap(sc);

        System.out.println("--- Nhap dinh C ---");
        C.nhap(sc);
    }

    // Xuat tam giac
    public void xuat() {
        System.out.print("Dinh A: ");
        A.xuat();

        System.out.print("Dinh B: ");
        B.xuat();

        System.out.print("Dinh C: ");
        C.xuat();
    }

    // Tinh khoang cach giua hai diem
    private double khoangCach(Diem p1, Diem p2) {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }

    // Tinh chu vi tam giac
    public double chuVi() {
        double AB = khoangCach(A, B);
        double BC = khoangCach(B, C);
        double CA = khoangCach(C, A);

        return AB + BC + CA;
    }
}