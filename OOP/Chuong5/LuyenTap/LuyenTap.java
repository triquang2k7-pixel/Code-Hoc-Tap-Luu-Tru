/*LUYỆN TẬP

- Xây dựng lớp hình học là lớp trừu tượng có hàm trừu
tượng: tinhdientich(); tinhchuvi(); nhap(); xuat();
- Xây dựng lớp hình tròn, lớp hình chữ nhật kế thừa từ
lớp hình học và hiện thực hóa các hàm trừu tượng trong
lớp hình học.
- Trong hàm main, xây dựng mảng gồm các đối tượng lớp
hình học và test các phương thức.*/

package OOP.Chuong5.LuyenTap;

import java.util.Scanner;

public class LuyenTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap so luong hinh
        int n;

        do {
            System.out.print("Nhap so luong hinh: ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("So luong phai lon hon 0!");
            }
        } while (n <= 0);

        // Khoi tao mang tinh
        HinhHoc[] ds = new HinhHoc[n];

        // Nhap danh sach hinh
        for (int i = 0; i < n; i++) {
            System.out.println("\n===== NHAP HINH THU " + (i + 1) + " =====");
            System.out.println("1. Hinh tron");
            System.out.println("2. Hinh chu nhat");

            int chon;

            do {
                System.out.print("Nhap lua chon: ");
                chon = sc.nextInt();

                if (chon != 1 && chon != 2) {
                    System.out.println("Lua chon khong hop le!");
                }
            } while (chon != 1 && chon != 2);

            // Tao doi tuong lop con
            if (chon == 1) {
                ds[i] = new HinhTron();
            } else {
                ds[i] = new HinhChuNhat();
            }

            // Goi phuong thuc nhap
            ds[i].nhap(sc);
        }

        // Xuat danh sach va tinh toan
        System.out.println("\n========== KET QUA ==========");

        for (int i = 0; i < n; i++) {
            System.out.println("\nHinh thu " + (i + 1));

            ds[i].xuat();

            System.out.printf("Dien tich: %.2f%n",
                    ds[i].tinhDienTich());

            System.out.printf("Chu vi: %.2f%n",
                    ds[i].tinhChuVi());
        }

        sc.close();
    }
}
