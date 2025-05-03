package tp6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SepedaMotor {
  protected String warnaMotor;
  protected int ukuranTangki;
  protected LocalDateTime waktuIsiBensin;

  public SepedaMotor(String warna) {
    this.warnaMotor = warna;
    this.ukuranTangki = 3;
    this.waktuIsiBensin = null;
  }

  public void isiTangkiFull() {
    waktuIsiBensin = LocalDateTime.now();
  }

  public String cekKapanHabis() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    return waktuIsiBensin.plusHours(ukuranTangki).format(formatter);
  }

  public boolean jalan() {
    if (waktuIsiBensin == null) {
      System.out.println("Bensin habis, sepeda motor tidak dapat jalan");
      return false;
    }
    System.out.println("Sepeda motor sedang berjalan");
    return true;
  }
}
