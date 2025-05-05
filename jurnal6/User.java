package jurnal6;

public class User {
  protected String username;
  protected Song[] playlist;

  public User(String username) {
    if (username == null || username.isEmpty()) {
      this.username = "anonymous";
    } else {
      this.username = username;
    }
  }

  public String getUsername() {
    return username;
  }
  public void setPlaylist(Song[] arrSong) {
    if (arrSong == null || arrSong.length == 0) {
      System.out.println("play list kosong");
    } else {
      this.playlist = arrSong;
    }
  }

  protected Song[] getPlaylist() {
    return playlist;
  }
  public void playPlaylist() {
    if (playlist == null || playlist.length == 0) {
      System.out.println("play list kosong");
      return;
    }

    for (Song song : playlist) {
      System.out.println("Lagu iklan selingan karena akun gratisan");
      song.playMusic();
    }
  }
}
