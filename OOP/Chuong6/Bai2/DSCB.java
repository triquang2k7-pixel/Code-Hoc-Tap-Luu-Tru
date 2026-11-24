
package OOP.Chuong6.Bai2;

import java.util.Arrays;
import java.util.Scanner;

public class DSCB {

    // Thuoc tinh
    private CanBo[] ds;
    private int n;

    // Constructor khong tham so
    public DSCB() {
        n = 0;
        ds = new CanBo[0];
    }

    // Constructor co tham so
    public DSCB(int n, CanBo[] ds) {
        this.n = n;
        this.ds = Arrays.copyOf(ds, n);
    }

    // Tim vi tri can bo theo ma
    public int timViTri(String ma) {
        for (int i = 0; i < n; i++) {
            if (ds[i].getMa().equalsIgnoreCase(ma.trim())) {
                return i;
            }
        }

        return -1;
    }

    // Them can bo theo lua chon
    public void them(Scanner sc) {

        System.out.println("1. Cong nhan");
        System.out.println("2. Ky su");
        System.out.println("3. Nhan vien");

        int chon;

        do {
            System.out.print("Nhap loai can bo: ");
            chon = sc.nextInt();
            sc.nextLine();

            if (chon < 1 || chon > 3) {
                System.out.println("Lua chon khong hop le!");
            }
        } while (chon < 1 || chon > 3);

        // Khoi tao doi tuong theo lua chon
        CanBo cb;

        if (chon == 1) {
            cb = new CongNhan();
        } else if (chon == 2) {
            cb = new KySu();
        } else {
            cb = new NhanVien();
        }

        // Nhap thong tin bang da hinh
        cb.nhap(sc);

        // Kiem tra ma trung
        if (timViTri(cb.getMa()) != -1) {
            System.out.println("Ma can bo da ton tai!");
            return;
        }

        // Cap phat them 1 phan tu
        ds = Arrays.copyOf(ds, n + 1);

        ds[n] = cb;
        n++;

        System.out.println("Them can bo thanh cong!");
    }

    // Ham chong: Them doi tuong co san
    public void them(CanBo cb) {
        if (cb == null || timViTri(cb.getMa()) != -1) {
            System.out.println("Can bo khong hop le hoac ma da ton tai!");
            return;
        }

        ds = Arrays.copyOf(ds, n + 1);
        ds[n] = cb;
        n++;
    }

    // Sua can bo theo ma
    public void sua(String ma, Scanner sc) {

        int viTri = timViTri(ma);

        if (viTri == -1) {
            System.out.println("Khong tim thay can bo!");
            return;
        }

        CanBo cb = ds[viTri];

        System.out.println("--- Nhap thong tin moi ---");

        System.out.print("Nhap ho ten moi: ");
        cb.setHoTen(sc.nextLine());

        System.out.print("Nhap tuoi moi: ");
        cb.setTuoi(sc.nextInt());
        sc.nextLine();

        System.out.print("Nhap dia chi moi: ");
        cb.setDiaChi(sc.nextLine());

        // Sua thuoc tinh rieng cua tung loai can bo
        if (cb instanceof CongNhan) {

            CongNhan cn = (CongNhan) cb;

            int bac;

            do {
                System.out.print("Nhap bac moi (1-10): ");
                bac = sc.nextInt();
                sc.nextLine();

                if (bac < 1 || bac > 10) {
                    System.out.println("Bac phai tu 1 den 10!");
                }
            } while (bac < 1 || bac > 10);

            cn.setBac(bac);

        } else if (cb instanceof KySu) {

            KySu ks = (KySu) cb;

            System.out.print("Nhap nganh dao tao moi: ");
            ks.setNganhDaoTao(sc.nextLine());

        } else if (cb instanceof NhanVien) {

            NhanVien nv = (NhanVien) cb;

            System.out.print("Nhap cong viec moi: ");
            nv.setCongViec(sc.nextLine());
        }

        System.out.println("Sua can bo thanh cong!");
    }

    // Xoa can bo theo ma
    public void xoa(String ma) {

        int viTri = timViTri(ma);

        if (viTri == -1) {
            System.out.println("Khong tim thay can bo!");
            return;
        }

        // Dich chuyen cac phan tu sang trai
        for (int i = viTri; i < n - 1; i++) {
            ds[i] = ds[i + 1];
        }

        // Thu nho mang
        ds = Arrays.copyOf(ds, n - 1);

        n--;

        System.out.println("Xoa can bo thanh cong!");
    }

    // Tim kiem theo ho ten
    public void timKiem(String hoTen) {

        boolean timThay = false;

        for (int i = 0; i < n; i++) {

            if (ds[i].getHoTen().toLowerCase()
                    .contains(hoTen.trim().toLowerCase())) {

                System.out.println("\nCan bo thu " + (i + 1));
                ds[i].xuat();

                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay can bo!");
        }
    }

    // Hien thi danh sach
    public void hienThi() {

        if (n == 0) {
            System.out.println("Danh sach can bo rong!");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nCan bo thu " + (i + 1));
            ds[i].xuat();
        }
    }

    // Lay so luong can bo
    public int getN() {
        return n;
    }
}
