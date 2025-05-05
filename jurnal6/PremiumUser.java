package jurnal6;

public class PremiumUser extends User {
  private int repeatCount;

  public PremiumUser(String username, int repeatCount) {
    super(username);
    this.repeatCount = repeatCount;
  }

  public void setUsername(String username) {
    this.username = username;
  }
  public void setRepeatCount(int repeatCount) {
    this.repeatCount = repeatCount;
  }

  public String getPlaytime() {
    if (playlist == null || playlist.length == 0) {
      return "0:00:00";
    }

    int totalSeconds = 0;
    for (Song song : playlist) {
      totalSeconds += song.getDurationSeconds() * repeatCount;
    }

    int hours = totalSeconds / 3600;
    int minutes = (totalSeconds % 3600) / 60;
    int seconds = totalSeconds % 60;

    return String.format("%d:%02d:%02d", hours, minutes, seconds);
  }

  @Override
  public void playPlaylist() {
    if (playlist == null || playlist.length == 0) {
      System.out.println("play list kosong");
      return;
    }

    System.out.println("Semua lagu diputar tanpa iklan");

    for (Song song : playlist) {
      song.playMusic(repeatCount);
    }

    System.out.println("Jumlah durasi lagu yang telah dimainkan: " + getPlaytime());
  }
}
