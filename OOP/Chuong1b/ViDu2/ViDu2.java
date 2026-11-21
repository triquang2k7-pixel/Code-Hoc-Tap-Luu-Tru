package OOP.Chuong1b.ViDu2;

public class ViDu2 {
    public static int soChanHon5() {
        for(int i = 1; i <= 10; i++) {
            if (i % 2 != 0) continue;
            if (i > 5) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int ketQua = soChanHon5();
        
        if(ketQua != -1) {
            System.out.println("Không tìm thấy kết quả số chẵn lớn hơn 5 đầu ");
        } else {
            System.out.println("Tìm thấy kết quả số chẵn lớn hơn 5 đầu tiên là: " + ketQua);
        }
    }
}