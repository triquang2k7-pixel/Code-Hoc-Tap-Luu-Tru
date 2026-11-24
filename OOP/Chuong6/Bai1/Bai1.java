/*Thiết kế lớp văn phòng phẩm bao gồm các thuộc tính: mã, tên,
số lượng có, đơn giá bán. Các phương thức thiết lập, nhập, xuất
thích hợp.
 Thiết kế lớp tập(vở) kế thừa lớp văn phòng phẩm bổ sung thuộc
tính số trang. Các phương thức thiết lập, nhập, xuất thích hợp.
 Thiết kế lớp viết (bút) kế thừa lớp văn phòng phẩm bổ sung
thuộc tính màu mực. Các phương thức thiết lập, nhập, xuất thích
hợp.
 Cài đặt đa hình cho phương thức nhập, xuất.
 Thiết kế lớp danh sách văn phòng phẩm: khai báo các thuộc tính
và phương thức hợp lý. Viết hàm xuất danh sách văn phòng
phẩm và hàm thêm 1 văn phòng phẩm cho phép người dùng
chọn thêm tập hoặc viết vào danh sách (sử dụng đa hình).*/

package OOP.Chuong6.Bai1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DanhSachVanPhongPham ds = new DanhSachVanPhongPham();

        int chon;

        do {
            System.out.println("\n===== QUAN LY VAN PHONG PHAM =====");
            System.out.println("1. Them van phong pham");
            System.out.println("2. Xuat danh sach");
            System.out.println("0. Thoat");

            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    ds.them(sc);
                    break;

                case 2:
                    ds.xuat();
                    break;

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