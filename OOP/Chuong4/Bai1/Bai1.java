/*BÀI TẬP 1

- Thiết kế lớp NoiSinh với thành phần dữ liệu phường, quận, tỉnh thành.
- Viết các phương thức khởi tạo, các phương thức get/set, phương thức
nhập/xuất cho lớp NoiSinh.
- Thiết kế lớp Nguoi gồm số định danh, Họ tên, năm sinh, địa chỉ và nơi
sinh.
- Viết các phương thức khởi tạo, phương thức get/set, phương thức
nhập/xuất cho lớp Nguoi.
- Thiết kế lớp SinhVien kế thừa từ lớp Nguoi, bổ sung thêm thuộc tính
MASV (int), lớp (String).
- Viết các phương thức khởi tạo, phương thức get/set, phương thức
nhập/xuất cho lớp SinhVien.*/

package OOP.Chuong4.Bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinhVien sv = new SinhVien();

        System.out.println("===== NHAP SINH VIEN =====");
        sv.nhap(sc);

        System.out.println("\n===== THONG TIN SINH VIEN =====");
        sv.xuat();

        sc.close();
    }
}
