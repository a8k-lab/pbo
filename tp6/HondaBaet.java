package tp6;

public class HondaBaet extends SepedaMotor {
  public HondaBaet(String warnaMotor) {
    super(warnaMotor);
    this.ukuranTangki = 4;
  }

  @Override
  public boolean jalan() {
    if (this.waktuIsiBensin == null) {
      System.out.println("Bensin Habis, sepeda motor tidak dapat berjalan");
      return false;
    }
    System.out.println("Sepeda motor sedang berjalan");
    String habis = cekKapanHabis();
    System.out.println("Motor Baet akan habis pada " + habis);
    return true;
  }
}
