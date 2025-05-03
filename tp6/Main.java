package tp6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    SepedaMotor sp = new SepedaMotor("Hitam");
    HondaBaet hb = new HondaBaet("Biru");
    YamahaMoi ym = new YamahaMoi("Merah");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    System.out.println("Status Awal Sepeda Motor:");
    sp.jalan();
    
    System.out.println("Status Awal HandoBaet:");
    hb.jalan();

    System.out.println("Status Awal YamahaMoi:");
    ym.jalan();

    System.out.println("--------------------");

    System.out.println("Status Terbaru Sepeda Motor:");
    System.out.println("Waktu Saat ini: " + LocalDateTime.now().format(formatter));
    sp.isiTangkiFull();
    sp.jalan();
    System.out.println(sp.cekKapanHabis());

    System.out.println("Status Terbaru HandoBaet:");
    System.out.println("Waktu Saat ini: " + LocalDateTime.now().format(formatter));
    hb.isiTangkiFull();
    hb.jalan();

    System.out.println("Status Terbaru YamahaMoi:");
    System.out.println("Waktu Saat ini: " + LocalDateTime.now().format(formatter));
    ym.isiTangkiFull();
    ym.jalan();
  }
}
