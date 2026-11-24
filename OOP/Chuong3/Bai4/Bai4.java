/*4. Thiết kế lớp SINHVIEN bao gồm các thuộc tính: mã sinh viên, họ tên, lớp,
điểm môn 1, điểm môn 2, điểm môn 3, các phương thức get, set, nhập, xuất, tính
điểm trung bình, xếp loại*/


package OOP.Chuong3.Bai4;

import java.util.Scanner;

public class Bai4 {

    // Ham nhap diem va kiem tra
    public static double nhapDiem(Scanner sc, String tenMon) {
        double diem;

        do {
            System.out.print("Nhap " + tenMon + ": ");
            diem = sc.nextDouble();

            if (diem < 0 || diem > 10) {
                System.out.println("Diem phai tu 0 den 10!");
            }
        } while (diem < 0 || diem > 10);

        return diem;
    }

    // Ham xoa sinh vien bang cach dich chuyen mang
    public static int xoa(SinhVien[] ds, int soLuong, int viTri) {

        int index = viTri - 1;

        for (int i = index; i < soLuong - 1; i++) {
            ds[i] = ds[i + 1];
        }

        ds[soLuong - 1] = null;

        return soLuong - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap so luong phan tu mang
        int n;

        do {
            System.out.print("Nhap so luong sinh vien: ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("So luong phai lon hon 0!");
            }
        } while (n <= 0);

        // Khoi tao mang tinh
        SinhVien[] ds = new SinhVien[n];

        int soLuong = 0;
        int chon;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Them SV (constructor co tham so)");
            System.out.println("2. Them SV (constructor khong tham so)");
            System.out.println("3. Xuat danh sach sinh vien");
            System.out.println("4. Xem thong tin sinh vien (Get)");
            System.out.println("5. Sua diem sinh vien (Set)");
            System.out.println("6. Xoa sinh vien");
            System.out.println("0. Thoat");
            System.out.println("==========================");

            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {

                // Them bang constructor co tham so
                case 1: {
                    if (soLuong >= ds.length) {
                        System.out.println("Mang da day!");
                        break;
                    }

                    System.out.print("Nhap ma sinh vien: ");
                    String maSV = sc.nextLine();

                    System.out.print("Nhap ho ten: ");
                    String hoTen = sc.nextLine();

                    System.out.print("Nhap lop: ");
                    String lop = sc.nextLine();

                    double diem1 = nhapDiem(sc, "diem mon 1");
                    double diem2 = nhapDiem(sc, "diem mon 2");
                    double diem3 = nhapDiem(sc, "diem mon 3");

                    ds[soLuong] = new SinhVien(
                            maSV, hoTen, lop, diem1, diem2, diem3
                    );

                    soLuong++;

                    System.out.println("Them sinh vien thanh cong!");
                    break;
                }

                // Them bang constructor khong tham so
                case 2: {
                    if (soLuong >= ds.length) {
                        System.out.println("Mang da day!");
                        break;
                    }

                    ds[soLuong] = new SinhVien();
                    ds[soLuong].nhap(sc);

                    soLuong++;

                    System.out.println("Them sinh vien thanh cong!");
                    break;
                }

                // Xuat danh sach
                case 3: {
                    if (soLuong == 0) {
                        System.out.println("Danh sach chua co sinh vien!");
                    } else {
                        for (int i = 0; i < soLuong; i++) {
                            System.out.println("\nSinh vien thu " + (i + 1));
                            ds[i].xuat();
                        }
                    }
                    break;
                }

                // Xem thong tin bang Getter
                case 4: {
                    if (soLuong == 0) {
                        System.out.println("Danh sach chua co sinh vien!");
                        break;
                    }

                    System.out.print("Nhap vi tri sinh vien: ");
                    int viTri = sc.nextInt();

                    if (viTri < 1 || viTri > soLuong) {
                        System.out.println("Vi tri khong hop le!");
                        break;
                    }

                    SinhVien sv = ds[viTri - 1];

                    System.out.println("Ma sinh vien: " + sv.getMaSV());
                    System.out.println("Ho ten: " + sv.getHoTen());
                    System.out.println("Lop: " + sv.getLop());
                    System.out.println("Diem mon 1: " + sv.getDiemMon1());
                    System.out.println("Diem mon 2: " + sv.getDiemMon2());
                    System.out.println("Diem mon 3: " + sv.getDiemMon3());

                    break;
                }

                // Sua diem bang Setter
                case 5: {
                    if (soLuong == 0) {
                        System.out.println("Danh sach chua co sinh vien!");
                        break;
                    }

                    System.out.print("Nhap vi tri sinh vien can sua: ");
                    int viTri = sc.nextInt();

                    if (viTri < 1 || viTri > soLuong) {
                        System.out.println("Vi tri khong hop le!");
                        break;
                    }

                    SinhVien sv = ds[viTri - 1];

                    double diem1 = nhapDiem(sc, "diem mon 1 moi");
                    double diem2 = nhapDiem(sc, "diem mon 2 moi");
                    double diem3 = nhapDiem(sc, "diem mon 3 moi");

                    sv.setDiemMon1(diem1);
                    sv.setDiemMon2(diem2);
                    sv.setDiemMon3(diem3);

                    System.out.println("Cap nhat diem thanh cong!");
                    sv.xuat();

                    break;
                }

                // Xoa sinh vien
                case 6: {
                    if (soLuong == 0) {
                        System.out.println("Danh sach chua co sinh vien!");
                        break;
                    }

                    System.out.print("Nhap vi tri sinh vien can xoa: ");
                    int viTri = sc.nextInt();

                    if (viTri < 1 || viTri > soLuong) {
                        System.out.println("Vi tri khong hop le!");
                        break;
                    }

                    soLuong = xoa(ds, soLuong, viTri);

                    System.out.println("Xoa sinh vien thanh cong!");
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

