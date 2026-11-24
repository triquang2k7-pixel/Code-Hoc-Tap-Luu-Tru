package OOP.Chuong6.Bai2;

import java.util.Scanner;

public class KySu extends CanBo {

    // Thuoc tinh bo sung
    private String nganhDaoTao;

    // Constructor khong tham so
    public KySu() {
        super();
        nganhDaoTao = "";
    }

    // Constructor co tham so
    public KySu(String ma, String hoTen, int tuoi,
                String diaChi, String nganhDaoTao) {

        super(ma, hoTen, tuoi, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    // Get
    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    // Set
    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    // Nhap
    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("Nhap nganh dao tao: ");
        nganhDaoTao = sc.nextLine();
    }

    // Xuat
    @Override
    public void xuat() {
        System.out.println("===== KY SU =====");
        super.xuat();
        System.out.println("Nganh dao tao: " + nganhDaoTao);
    }
}