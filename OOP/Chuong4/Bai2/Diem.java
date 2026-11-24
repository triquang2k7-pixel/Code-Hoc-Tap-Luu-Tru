package OOP.Chuong4.Bai2;

import java.util.Scanner;

public class Diem {
    // Thuoc tinh
    private int x;
    private int y;

    // Constructor khong tham so
    public Diem() {
        x = 0;
        y = 0;
    }

    // Constructor co tham so
    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Get
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Set
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Nhap
    public void nhap(Scanner sc) {
        System.out.print("Nhap x: ");
        x = sc.nextInt();

        System.out.print("Nhap y: ");
        y = sc.nextInt();

        sc.nextLine();
    }

    // Xuat
    public void xuat() {
        System.out.println("Toa do: (" + x + ", " + y + ")");
    }
}