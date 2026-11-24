package OOP.Chuong7.Bai1;

public class Dia extends TaiLieu {
    private double dungLuong;

    public Dia(String ten, double dungLuong) {
        super(ten);
        this.dungLuong = dungLuong;
    }

    public double getDungLuong() {
        return dungLuong;
    }

    @Override
    public void xuat() {
        System.out.println("Loai: Dia");
        System.out.println("Ten: " + ten);
        System.out.println("Dung luong: " + dungLuong + " GB");
    }
}


