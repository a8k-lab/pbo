
package jurnal6;

public class Song {
  private String artist;
  private String title;
  private int durationSeconds;

  public Song(String artist, String title, int durationSeconds) {
    this.artist = artist;
    this.title = title;
    this.durationSeconds = durationSeconds;
  }

  public String getArtist() {
    return artist;
  }
  public String getTitle() {
    return title;
  }
  public int getDurationSeconds() {
    return durationSeconds;
  }
  public int getDurationMM() {
    return durationSeconds / 60;
  }
  public int getDurationDD() {
    return durationSeconds % 60;
  }

  public void playMusic() {
    // Format: "Lagu [JudulLagu] oleh [NamaArtist] diputar dengan durasi [2:07]"
    System.out.printf("Lagu %s oleh %s diputar dengan durasi %d:%02d\n",
        title, artist, getDurationMM(), getDurationDD());
  }
  public void playMusic(int repeatCount) {
    for (int i = 1; i <= repeatCount; i++) {
      System.out.printf("Pemutaran ke-%d\n", i);
      playMusic();
    }
  }
}
