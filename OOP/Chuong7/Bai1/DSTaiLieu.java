package OOP.Chuong7.Bai1;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class DSTaiLieu {
    private ArrayList<TaiLieu> ds = new ArrayList<>();

    // 1. Them tai lieu
    public void them(TaiLieu tl) {
        ds.add(tl);
        System.out.println("Them thanh cong!");
    }

    // 2. Sua tai lieu
    public boolean sua(int viTri, TaiLieu tl) {
        if (viTri < 0 || viTri >= ds.size()) {
            return false;
        }

        ds.set(viTri, tl);
        return true;
    }

    // 3. Xoa tai lieu
    public boolean xoa(int viTri) {
        if (viTri < 0 || viTri >= ds.size()) {
            return false;
        }

        ds.remove(viTri);
        return true;
    }

    // 4. Tim kiem tai lieu theo ten
    public void timKiem(String tuKhoa) {
        boolean timThay = false;

        tuKhoa = tuKhoa.trim().toLowerCase();

        for (TaiLieu tl : ds) {
            if (tl.getTen().toLowerCase().contains(tuKhoa)) {
                tl.xuat();
                System.out.println("----------------");
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay tai lieu!");
        }
    }

    // 5. Xuat danh sach tai lieu
    public void xuatDanhSach() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }

        for (int i = 0; i < ds.size(); i++) {
            System.out.println("Vi tri: " + (i + 1));
            ds.get(i).xuat();
            System.out.println("----------------");
        }
    }

    // Lay tai lieu theo vi tri
    public TaiLieu get(int viTri) {
        if (viTri < 0 || viTri >= ds.size()) {
            return null;
        }

        return ds.get(viTri);
    }

    // Lay so luong tai lieu
    public int getSoLuong() {
        return ds.size();
    }

    // 6. Doc danh sach tai lieu tu file
    public void docFile(String tenFile) {
        ArrayList<TaiLieu> dsMoi = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(tenFile));

            String line;

            while ((line = br.readLine()) != null) {
                String[] arr = line.split("\\|", -1);

                if (arr.length == 4 && arr[0].equals("S")) {
                    String ten = arr[1];
                    String tacGia = arr[2];
                    int soTrang = Integer.parseInt(arr[3]);

                    Sach s = new Sach(ten, tacGia, soTrang);
                    dsMoi.add(s);

                } else if (arr.length == 3 && arr[0].equals("D")) {
                    String ten = arr[1];
                    double dungLuong = Double.parseDouble(arr[2]);

                    Dia d = new Dia(ten, dungLuong);
                    dsMoi.add(d);

                } else {
                    System.out.println("Dong du lieu khong hop le: " + line);
                }
            }

            br.close();

            ds.clear();
            ds.addAll(dsMoi);

            System.out.println("Doc file thanh cong!");

        } catch (Exception e) {
            System.out.println("Loi doc file: " + e.getMessage());
        }
    }

    // 7. Ghi danh sach tai lieu ra file
    public void ghiFile(String tenFile) {
        try {
            FileWriter fw = new FileWriter(tenFile);

            for (TaiLieu tl : ds) {
                if (tl instanceof Sach) {
                    Sach s = (Sach) tl;

                    fw.write("S|" + s.getTen() + "|"
                            + s.getTacGia() + "|"
                            + s.getSoTrang() + "\n");

                } else if (tl instanceof Dia) {
                    Dia d = (Dia) tl;

                    fw.write("D|" + d.getTen() + "|"
                            + d.getDungLuong() + "\n");
                }
            }

            fw.close();

            System.out.println("Ghi file thanh cong!");

        } catch (IOException e) {
            System.out.println("Loi ghi file: " + e.getMessage());
        }
    }
}


