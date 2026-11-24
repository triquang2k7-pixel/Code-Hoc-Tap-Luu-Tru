package OOP.Chuong6.Bai2;

import java.util.Scanner;

public class CongNhan extends CanBo {

    // Thuoc tinh bo sung
    private int bac;

    // Constructor khong tham so
    public CongNhan() {
        super();
        bac = 1;
    }

    // Constructor co tham so
    public CongNhan(String ma, String hoTen, int tuoi,
                    String diaChi, int bac) {

        super(ma, hoTen, tuoi, diaChi);
        this.bac = bac;
    }

    // Get
    public int getBac() {
        return bac;
    }

    // Set
    public void setBac(int bac) {
        this.bac = bac;
    }

    // Nhap
    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        do {
            System.out.print("Nhap bac cong nhan (1-10): ");
            bac = sc.nextInt();
            sc.nextLine();

            if (bac < 1 || bac > 10) {
                System.out.println("Bac phai tu 1 den 10!");
            }
        } while (bac < 1 || bac > 10);
    }

    // Xuat
    @Override
    public void xuat() {
        System.out.println("===== CONG NHAN =====");
        super.xuat();
        System.out.println("Bac: " + bac);
    }
}