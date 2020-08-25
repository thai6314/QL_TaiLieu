
package oop_cova;

/**
 *
 * @author WINDOWS 10 PRO _D565
 */
public class Sach extends TaiLieu{
    private String tenTacGia;
    private String tenSach;
    private int soTrang;

    public Sach() {
        super();
    }

    public Sach(String maTaiLieu, String nhaXuatBan, String soBanPhatHanh,String tenTacGia, String tenSach, int soTrang) {
        super(maTaiLieu,nhaXuatBan,soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }
}
