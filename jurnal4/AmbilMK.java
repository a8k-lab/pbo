package jurnal4;

public class AmbilMK {
  private MataKuliah mataKuliah;
  private String nilai;
  private String tahunAjaran;

  public AmbilMK(MataKuliah mataKuliah, String nilai, String tahunAjaran) {
    this.mataKuliah = mataKuliah;
    this.nilai = nilai;
    this.tahunAjaran = tahunAjaran;
  }

  public void setMataKuliah(MataKuliah mataKuliah) {
    this.mataKuliah = mataKuliah;
  }
  public void setNilai(String nilai) {
    this.nilai = nilai;
  }
  public void setTahunAjaran(String tahunAjaran) {
    this.tahunAjaran = tahunAjaran;
  }

  public MataKuliah getMataKuliah() {
    return this.mataKuliah;
  }
  public String getNilai() {
    return this.nilai;
  }
  public String getTahunAjaran() {
    return this.tahunAjaran;
  }
}
