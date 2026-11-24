package OOP.Chuong6.Bai2;

import java.util.Scanner;

public class CanBo {

    // Thuoc tinh
    private String ma;
    private String hoTen;
    private int tuoi;
    private String diaChi;

    // Constructor khong tham so
    public CanBo() {
        ma = "";
        hoTen = "";
        tuoi = 0;
        diaChi = "";
    }

    // Constructor co tham so
    public CanBo(String ma, String hoTen, int tuoi, String diaChi) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    // Get
    public String getMa() {
        return ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    // Set
    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    // Nhap
    public void nhap(Scanner sc) {
        System.out.print("Nhap ma can bo: ");
        ma = sc.nextLine();

        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
    }

    // Xuat
    public void xuat() {
        System.out.println("Ma: " + ma);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Dia chi: " + diaChi);
    }
}