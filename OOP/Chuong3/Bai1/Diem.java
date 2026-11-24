package OOP.Chuong3.Bai1;

import java.util.*;

public class Diem {
    // Thuoc tinh
    private double x;
    private double y;

    // Constructor khong tham so
    public Diem() {
        x = 0;
        y = 0;
    }

    // Constructor co tham so
    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Get
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Set
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Nhap diem
    public void nhap(Scanner sc) {
        System.out.print("Nhap hoanh do x: ");
        x = sc.nextDouble();

        System.out.print("Nhap tung do y: ");
        y = sc.nextDouble();

        sc.nextLine();
    }

    // Xuat diem
    public void xuat() {
        System.out.println("Toa do diem: (" + x + ", " + y + ")");
    }

    // Di chuyen diem
    public void diChuyen(double x1, double y1) {
        x = x + x1;
        y = y + y1;
    }
}