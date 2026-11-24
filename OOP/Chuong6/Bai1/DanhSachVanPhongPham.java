package OOP.Chuong6.Bai1;

import java.util.Arrays;
import java.util.Scanner;

public class DanhSachVanPhongPham {

    // Thuoc tinh
    private VanPhongPham[] ds;
    private int n;

    // Constructor khong tham so
    public DanhSachVanPhongPham() {
        n = 0;
        ds = new VanPhongPham[0];
    }

    // Constructor co tham so
    public DanhSachVanPhongPham(int n, VanPhongPham[] ds) {
        this.n = n;
        this.ds = Arrays.copyOf(ds, n);
    }

    // Them van phong pham theo lua chon
    public void them(Scanner sc) {

        System.out.println("1. Them tap");
        System.out.println("2. Them viet");

        int chon;

        do {
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();

            if (chon != 1 && chon != 2) {
                System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 1 && chon != 2);

        // Cap phat them 1 phan tu
        ds = Arrays.copyOf(ds, n + 1);

        // Tao doi tuong theo lua chon
        if (chon == 1) {
            ds[n] = new Tap();
        } else {
            ds[n] = new Viet();
        }

        // Da hinh: goi dung ham nhap cua lop con
        ds[n].nhap(sc);

        n++;

        System.out.println("Them thanh cong!");
    }

    // Them doi tuong co san
    public void them(VanPhongPham x) {
        ds = Arrays.copyOf(ds, n + 1);

        ds[n] = x;

        n++;
    }

    // Xuat danh sach
    public void xuat() {
        if (n == 0) {
            System.out.println("Danh sach rong!");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nVan phong pham thu " + (i + 1));
            ds[i].xuat();
        }
    }

    // Lay so luong
    public int getN() {
        return n;
    }
}