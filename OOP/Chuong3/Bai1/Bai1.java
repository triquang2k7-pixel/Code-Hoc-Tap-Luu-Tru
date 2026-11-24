package OOP.Chuong3.Bai1;

import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap so luong phan tu mang
        int n;
        do {
            System.out.print("Nhap so luong diem: ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("So luong phai lon hon 0!");
            }
        } while (n <= 0);

        // Khoi tao mang doi tuong
        Diem[] ds = new Diem[n];

        int soLuong = 0;
        int chon;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Them diem (constructor co tham so)");
            System.out.println("2. Them diem (constructor khong tham so)");
            System.out.println("3. Xuat danh sach diem");
            System.out.println("4. Di chuyen diem");
            System.out.println("5. Xem toa do diem bang get");
            System.out.println("0. Thoat");
            System.out.println("==========================");

            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1: {
                    if (soLuong >= ds.length) {
                        System.out.println("Mang da day!");
                        break;
                    }

                    double x, y;

                    System.out.print("Nhap hoanh do x: ");
                    x = sc.nextDouble();

                    System.out.print("Nhap tung do y: ");
                    y = sc.nextDouble();

                    ds[soLuong] = new Diem(x, y);
                    soLuong++;

                    System.out.println("Them diem thanh cong!");
                    break;
                }

                case 2: {
                    if (soLuong >= ds.length) {
                        System.out.println("Mang da day!");
                        break;
                    }

                    ds[soLuong] = new Diem();
                    ds[soLuong].nhap(sc);
                    soLuong++;

                    System.out.println("Them diem thanh cong!");
                    break;
                }

                case 3: {
                    if (soLuong == 0) {
                        System.out.println("Danh sach chua co diem!");
                    } else {
                        for (int i = 0; i < soLuong; i++) {
                            System.out.print("Diem thu " + (i + 1) + ": ");
                            ds[i].xuat();
                        }
                    }
                    break;
                }

                case 4: {
                    if (soLuong == 0) {
                        System.out.println("Danh sach chua co diem!");
                        break;
                    }

                    System.out.print("Nhap vi tri diem can di chuyen: ");
                    int viTri = sc.nextInt();

                    if (viTri < 1 || viTri > soLuong) {
                        System.out.println("Vi tri khong hop le!");
                        break;
                    }

                    System.out.print("Nhap gia tri x': ");
                    double x1 = sc.nextDouble();

                    System.out.print("Nhap gia tri y': ");
                    double y1 = sc.nextDouble();

                    ds[viTri - 1].diChuyen(x1, y1);

                    System.out.println("Di chuyen thanh cong!");
                    ds[viTri - 1].xuat();
                    break;
                }

                case 5: {
                    if (soLuong == 0) {
                        System.out.println("Danh sach chua co diem!");
                        break;
                    }

                    System.out.print("Nhap vi tri diem: ");
                    int viTri = sc.nextInt();

                    if (viTri < 1 || viTri > soLuong) {
                        System.out.println("Vi tri khong hop le!");
                        break;
                    }

                    System.out.println("Hoanh do x = "
                            + ds[viTri - 1].getX());

                    System.out.println("Tung do y = "
                            + ds[viTri - 1].getY());
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
