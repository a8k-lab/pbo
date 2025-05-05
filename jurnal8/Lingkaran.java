package jurnal8;

public class Lingkaran extends BangunDatar {
  private int jariJari;

  public Lingkaran(String nama, int jariJari) {
    super(nama);
    this.jariJari = jariJari;
  }

  public int getJariJari() {
    return jariJari;
  }

  public void setJariJari(int jariJari) {
    this.jariJari = jariJari;
  }
  @Override
  public double hitungKeliling() {
    return jariJari * jariJari;
  }
  @Override
  public double hitungLuas() {
    return jariJari * jariJari * 0.5;
  }
}
