package OOP.Chuong7.Bai1;


import java.util.Scanner;

public class QuanLyTL {
    DSTaiLieu dstl = new DSTaiLieu();
    Scanner sc = new Scanner(System.in);

    // Nhap thong tin sach
    public Sach nhapSach() {
        System.out.print("Nhap ten sach: ");
        String ten = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhap so trang: ");
        int soTrang = Integer.parseInt(sc.nextLine());

        return new Sach(ten, tacGia, soTrang);
    }

    // Nhap thong tin dia
    public Dia nhapDia() {
        System.out.print("Nhap ten dia: ");
        String ten = sc.nextLine();

        System.out.print("Nhap dung luong: ");
        double dungLuong = Double.parseDouble(sc.nextLine());

        return new Dia(ten, dungLuong);
    }

    // 1. Them tai lieu
    public void them() {
        System.out.println("1. Sach");
        System.out.println("2. Dia");
        System.out.print("Chon loai tai lieu: ");

        int chon = Integer.parseInt(sc.nextLine());

        switch (chon) {
            case 1:
                dstl.them(nhapSach());
                break;

            case 2:
                dstl.them(nhapDia());
                break;

            default:
                System.out.println("Lua chon khong hop le!");
        }
    }

    // 2. Sua tai lieu
    public void sua() {
        dstl.xuatDanhSach();

        System.out.print("Nhap vi tri can sua: ");
        int viTri = Integer.parseInt(sc.nextLine()) - 1;

        TaiLieu tl = dstl.get(viTri);

        if (tl == null) {
            System.out.println("Vi tri khong hop le!");
            return;
        }

        TaiLieu moi;

        if (tl instanceof Sach) {
            System.out.println("Nhap thong tin sach moi:");
            moi = nhapSach();

        } else {
            System.out.println("Nhap thong tin dia moi:");
            moi = nhapDia();
        }

        if (dstl.sua(viTri, moi)) {
            System.out.println("Sua thanh cong!");
        }
    }

    // 3. Xoa tai lieu
    public void xoa() {
        dstl.xuatDanhSach();

        System.out.print("Nhap vi tri can xoa: ");
        int viTri = Integer.parseInt(sc.nextLine()) - 1;

        if (dstl.xoa(viTri)) {
            System.out.println("Xoa thanh cong!");
        } else {
            System.out.println("Vi tri khong hop le!");
        }
    }

    // 4. Tim kiem tai lieu
    public void timKiem() {
        System.out.print("Nhap ten tai lieu can tim: ");
        String tuKhoa = sc.nextLine();

        dstl.timKiem(tuKhoa);
    }

    // 5. Xuat danh sach tai lieu
    public void xuatDanhSach() {
        dstl.xuatDanhSach();
    }

    // 6. Doc danh sach tu file
    public void docFile() {
        dstl.docFile("data.txt");
    }

    // 7. Ghi danh sach ra file
    public void ghiFile() {
        dstl.ghiFile("data.txt");
    }

    // Menu
    public void menu() {
        int chon;

        do {
            System.out.println("\n========== QUAN LY TAI LIEU ==========");
            System.out.println("1. Them tai lieu");
            System.out.println("2. Sua tai lieu");
            System.out.println("3. Xoa tai lieu");
            System.out.println("4. Tim kiem tai lieu");
            System.out.println("5. Xuat danh sach tai lieu");
            System.out.println("6. Tai danh sach tai lieu tu file");
            System.out.println("7. Xuat danh sach tai lieu ra file");
            System.out.println("8. Thoat");

            System.out.print("Nhap lua chon: ");

            try {
                chon = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so!");
                chon = 0;
                continue;
            }

            switch (chon) {
                case 1:
                    them();
                    break;

                case 2:
                    sua();
                    break;

                case 3:
                    xoa();
                    break;

                case 4:
                    timKiem();
                    break;

                case 5:
                    xuatDanhSach();
                    break;

                case 6:
                    docFile();
                    break;

                case 7:
                    ghiFile();
                    break;

                case 8:
                    System.out.println("Ket thuc chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 8);
    }
}
