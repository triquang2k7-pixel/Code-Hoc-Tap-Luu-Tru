package OOP.Chuong7.Bai1;


public class Sach extends TaiLieu {
    private String tacGia;
    private int soTrang;

    public Sach(String ten, String tacGia, int soTrang) {
        super(ten);
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }

    public String getTacGia() {
        return tacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    @Override
    public void xuat() {
        System.out.println("Loai: Sach");
        System.out.println("Ten: " + ten);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("So trang: " + soTrang);
    }
}


