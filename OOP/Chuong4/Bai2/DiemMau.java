package OOP.Chuong4.Bai2;

import java.util.Scanner;

public class DiemMau extends Diem {

    // Thuoc tinh bo sung
    private int mau;

    // Constructor khong tham so
    public DiemMau() {
        super();
        mau = 0;
    }

    // Constructor co tham so
    public DiemMau(int x, int y, int mau) {
        super(x, y);
        this.mau = mau;
    }

    // Get
    public int getMau() {
        return mau;
    }

    // Set
    public void setMau(int mau) {
        this.mau = mau;
    }

    // Nhap
    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("Nhap ma mau: ");
        mau = sc.nextInt();

        sc.nextLine();
    }

    // Xuat
    @Override
    public void xuat() {
        super.xuat();

        System.out.println("Ma mau: " + mau);
    }
}