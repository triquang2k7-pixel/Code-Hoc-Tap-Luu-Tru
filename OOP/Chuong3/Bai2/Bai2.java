/*2. Thiết kế lớp HINHCHUNHAT bao gồm các thuộc tính chiều dài, chiều rộng,
các phương thức get,set, nhập/xuất/tính diện tích/tính chu vi hình chữ nhật*/

package OOP.Chuong3.Bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap so luong phan tu mang
        int n;

        do {
            System.out.print("Nhap so luong hinh chu nhat: ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("So luong phai lon hon 0!");
            }
        } while (n <= 0);

        // Khoi tao mang doi tuong
        HinhChuNhat[] ds = new HinhChuNhat[n];

        int soLuong = 0;
        int chon;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Them HCN (constructor co tham so)");
            System.out.println("2. Them HCN (constructor khong tham so)");
            System.out.println("3. Xuat danh sach HCN");
            System.out.println("4. Tinh dien tich va chu vi");
            System.out.println("5. Thay doi chieu dai va chieu rong");
            System.out.println("6. Xem chieu dai va chieu rong (Get)");
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

                    double dai, rong;

                    do {
                        System.out.print("Nhap chieu dai: ");
                        dai = sc.nextDouble();

                        if (dai <= 0) {
                            System.out.println("Chieu dai phai lon hon 0!");
                        }
                    } while (dai <= 0);

                    do {
                        System.out.print("Nhap chieu rong: ");
                        rong = sc.nextDouble();

                        if (rong <= 0) {
                            System.out.println("Chieu rong phai lon hon 0!");
                        }
                    } while (rong <= 0);

                    ds[soLuong] = new HinhChuNhat(dai, rong);
                    soLuong++;

                    System.out.println("Them HCN thanh cong!");
                    break;
                }

                case 2: {
                    if (soLuong >= ds.length) {
                        System.out.println("Mang da day!");
                        break;
                    }

                    ds[soLuong] = new HinhChuNhat();
                    ds[soLuong].nhap(sc);
                    soLuong++;

                    System.out.println("Them HCN thanh cong!");
                    break;
                }

                case 3: {
                    if (soLuong == 0) {
                        System.out.println("Danh sach chua co HCN!");
                    } else {
                        for (int i = 0; i < soLuong; i++) {
                            System.out.println("\nHinh chu nhat thu " + (i + 1));
                            ds[i].xuat();
                        }
                    }
                    break;
                }

                case 4: {
                    if (soLuong == 0) {
                        System.out.println("Danh sach chua co HCN!");
                        break;
                    }

                    System.out.print("Nhap vi tri HCN: ");
                    int viTri = sc.nextInt();

                    if (viTri < 1 || viTri > soLuong) {
                        System.out.println("Vi tri khong hop le!");
                        break;
                    }

                    System.out.println("Dien tich: "
                            + ds[viTri - 1].dienTich());

                    System.out.println("Chu vi: "
                            + ds[viTri - 1].chuVi());
                    break;
                }

                case 5: {
                    if (soLuong == 0) {
                        System.out.println("Danh sach chua co HCN!");
                        break;
                    }

                    System.out.print("Nhap vi tri HCN can sua: ");
                    int viTri = sc.nextInt();

                    if (viTri < 1 || viTri > soLuong) {
                        System.out.println("Vi tri khong hop le!");
                        break;
                    }

                    double dai, rong;

                    do {
                        System.out.print("Nhap chieu dai moi: ");
                        dai = sc.nextDouble();

                        if (dai <= 0) {
                            System.out.println("Chieu dai phai lon hon 0!");
                        }
                    } while (dai <= 0);

                    do {
                        System.out.print("Nhap chieu rong moi: ");
                        rong = sc.nextDouble();

                        if (rong <= 0) {
                            System.out.println("Chieu rong phai lon hon 0!");
                        }
                    } while (rong <= 0);

                    ds[viTri - 1].setChieuDai(dai);
                    ds[viTri - 1].setChieuRong(rong);

                    System.out.println("Cap nhat thanh cong!");
                    ds[viTri - 1].xuat();
                    break;
                }

                case 6: {
                    if (soLuong == 0) {
                        System.out.println("Danh sach chua co HCN!");
                        break;
                    }

                    System.out.print("Nhap vi tri HCN: ");
                    int viTri = sc.nextInt();

                    if (viTri < 1 || viTri > soLuong) {
                        System.out.println("Vi tri khong hop le!");
                        break;
                    }

                    System.out.println("Chieu dai: "
                            + ds[viTri - 1].getChieuDai());

                    System.out.println("Chieu rong: "
                            + ds[viTri - 1].getChieuRong());
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

