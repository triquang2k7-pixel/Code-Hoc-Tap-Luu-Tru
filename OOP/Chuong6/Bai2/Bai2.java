
package OOP.Chuong6.Bai2;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DSCB ds = new DSCB();

        int chon;

        do {
            System.out.println("\n========== QUAN LY CAN BO ==========");
            System.out.println("1. Them can bo");
            System.out.println("2. Sua can bo theo ma");
            System.out.println("3. Xoa can bo theo ma");
            System.out.println("4. Tim kiem theo ho ten");
            System.out.println("5. Hien thi danh sach");
            System.out.println("0. Thoat");
            System.out.println("====================================");

            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {

                case 1: {
                    ds.them(sc);
                    break;
                }

                case 2: {
                    System.out.print("Nhap ma can bo can sua: ");
                    String ma = sc.nextLine();

                    ds.sua(ma, sc);
                    break;
                }

                case 3: {
                    System.out.print("Nhap ma can bo can xoa: ");
                    String ma = sc.nextLine();

                    ds.xoa(ma);
                    break;
                }

                case 4: {
                    System.out.print("Nhap ho ten can tim: ");
                    String hoTen = sc.nextLine();

                    ds.timKiem(hoTen);
                    break;
                }

                case 5: {
                    ds.hienThi();
                    break;
                }

                case 0:
                    System.out.println("Ket thuc chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);

        sc.close();
    }
}
