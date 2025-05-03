package tp6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class YamahaMoi extends SepedaMotor {
  public YamahaMoi(String warnaMotor) {
    super(warnaMotor);
    this.ukuranTangki = 5;
  }

  @Override
  public boolean jalan() {
    if (this.waktuIsiBensin == null) {
      System.out.println("Bensin Habis, sepeda motor tidak dapat berjalan");
      return false;
    }
    System.out.println("Sepeda motor sedang berjalan");
    String habis = cekKapanHabis();
    System.out.println("Bensin akan habis pada " + habis);
    return true;
  }
}
