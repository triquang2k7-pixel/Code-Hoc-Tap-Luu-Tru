/*2. Thiết kế lớp HINHCHUNHAT bao gồm các thuộc tính chiều dài, chiều rộng,
các phương thức get,set, nhập/xuất/tính diện tích/tính chu vi hình chữ nhật*/

package OOP.Chuong3.Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khai bao mang dong
        ArrayList<HinhTron> ds = new ArrayList<>();

        int chon;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Them HT (constructor co tham so)");
            System.out.println("2. Them HT (constructor khong tham so)");
            System.out.println("3. Xuat danh sach hinh tron");
            System.out.println("4. Tinh dien tich va chu vi");
            System.out.println("5. Thay doi ban kinh (Set)");
            System.out.println("6. Xem ban kinh (Get)");
            System.out.println("7. Xoa hinh tron");
            System.out.println("0. Thoat");
            System.out.println("==========================");

            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();

            switch (chon) {

                case 1: {
                    double r;

                    do {
                        System.out.print("Nhap ban kinh: ");
                        r = sc.nextDouble();

                        if (r <= 0) {
                            System.out.println("Ban kinh phai lon hon 0!");
                        }
                    } while (r <= 0);

                    ds.add(new HinhTron(r));

                    System.out.println("Them hinh tron thanh cong!");
                    break;
                }

                case 2: {
                    HinhTron ht = new HinhTron();

                    ht.nhap(sc);

                    ds.add(ht);

                    System.out.println("Them hinh tron thanh cong!");
                    break;
                }

                case 3: {
                    if (ds.isEmpty()) {
                        System.out.println("Danh sach chua co hinh tron!");
                    } else {
                        for (int i = 0; i < ds.size(); i++) {
                            System.out.println("\nHinh tron thu " + (i + 1));
                            ds.get(i).xuat();
                        }
                    }
                    break;
                }

                case 4: {
                    if (ds.isEmpty()) {
                        System.out.println("Danh sach chua co hinh tron!");
                        break;
                    }

                    System.out.print("Nhap vi tri hinh tron: ");
                    int viTri = sc.nextInt();

                    if (viTri < 1 || viTri > ds.size()) {
                        System.out.println("Vi tri khong hop le!");
                        break;
                    }

                    System.out.println("Dien tich: "
                            + ds.get(viTri - 1).dienTich());

                    System.out.println("Chu vi: "
                            + ds.get(viTri - 1).chuVi());
                    break;
                }

                case 5: {
                    if (ds.isEmpty()) {
                        System.out.println("Danh sach chua co hinh tron!");
                        break;
                    }

                    System.out.print("Nhap vi tri hinh tron can sua: ");
                    int viTri = sc.nextInt();

                    if (viTri < 1 || viTri > ds.size()) {
                        System.out.println("Vi tri khong hop le!");
                        break;
                    }

                    double r;

                    do {
                        System.out.print("Nhap ban kinh moi: ");
                        r = sc.nextDouble();

                        if (r <= 0) {
                            System.out.println("Ban kinh phai lon hon 0!");
                        }
                    } while (r <= 0);

                    ds.get(viTri - 1).setBanKinh(r);

                    System.out.println("Cap nhat thanh cong!");
                    break;
                }

                case 6: {
                    if (ds.isEmpty()) {
                        System.out.println("Danh sach chua co hinh tron!");
                        break;
                    }

                    System.out.print("Nhap vi tri hinh tron: ");
                    int viTri = sc.nextInt();

                    if (viTri < 1 || viTri > ds.size()) {
                        System.out.println("Vi tri khong hop le!");
                        break;
                    }

                    System.out.println("Ban kinh: "
                            + ds.get(viTri - 1).getBanKinh());
                    break;
                }

                case 7: {
                    if (ds.isEmpty()) {
                        System.out.println("Danh sach chua co hinh tron!");
                        break;
                    }

                    System.out.print("Nhap vi tri can xoa: ");
                    int viTri = sc.nextInt();

                    if (viTri < 1 || viTri > ds.size()) {
                        System.out.println("Vi tri khong hop le!");
                        break;
                    }

                    ds.remove(viTri - 1);

                    System.out.println("Xoa hinh tron thanh cong!");
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
