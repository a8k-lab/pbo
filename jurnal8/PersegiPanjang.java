package jurnal8;

public class PersegiPanjang extends BangunDatar {
  private int panjang, lebar;

  public PersegiPanjang(String nama, int panjang, int lebar) {
    super(nama);
    this.panjang = panjang;
    this.lebar = lebar;
  }

  public int getPanjang() {
    return panjang;
  }
  public int getLebar() {
    return lebar;
  }

  public void setPanjang(int panjang) {
    this.panjang = panjang;
  }
  public void setLebar(int lebar) {
    this.lebar = lebar;
  }
  @Override
  public double hitungKeliling() {
    return panjang * lebar;
  }
  @Override
  public double hitungLuas() {
    return panjang * lebar * 0.5;
  }
}
