package jurnal6;

public class Main {
  public static void main(String[] args) {
    // Membuat objek User dan PremiumUser
    User regularUser = new User("asikinmang123");
    PremiumUser premiumUser = new PremiumUser("aduhpusing27", 2);

    // Membuat array lagu list1
    Song[] list1 = new Song[6];
    list1[0] = new Song("Andrea Bocelli", "Time To Say Goodbye", 434);
    list1[1] = new Song("Kana-Boon", "Silhouette", 265);
    list1[2] = new Song("NIKI", "High School in Jakarta", 241);
    list1[3] = new Song("Lucy Rose", "Shiver", 218);
    list1[4] = new Song("Oasis", "Wonderwall", 280);
    list1[5] = new Song("Ally Kerr", "The Sore Feet Song", 189);

    // Membuat array lagu list2
    Song[] list2 = new Song[2];
    list2[0] = new Song("Led Zeppelin", "How Many More Times", 509);
    list2[1] = new Song("Hans Zimmer", "Interstellar Main Theme", 785);

    // Set playlist untuk masing-masing user
    regularUser.setPlaylist(list1);
    premiumUser.setPlaylist(list2);

    // Output untuk pengguna umum
    System.out.println("Pengguna Umum:");
    System.out.print("Akun: ");
    System.out.println(regularUser.getUsername());
    regularUser.playPlaylist();

    // Output untuk pengguna premium
    System.out.println("==============================");
    System.out.println("Pengguna Premium:");
    System.out.print("Akun: ");
    System.out.println(premiumUser.getUsername());
    premiumUser.playPlaylist();
  }
}
