package OOP.Chuong7.Bai1;

public class TaiLieu implements IXuat {
    protected String ten;

    public TaiLieu(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public void xuat() {
        System.out.println("Ten tai lieu: " + ten);
    }
}

