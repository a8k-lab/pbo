package tp7;

public class HomePage extends WebPage implements Loginable {
  public HomePage(String title) {
    super(title);
  }

  @Override
  public void login(String input) {
    super.login(input);
  }
  @Override
  public void showMainPage() {
    if (loggedUsername == null) {
      System.out.println("# Selamat datang \t\t##");
      System.out.println("# Anda sedang berada di home page\t##");
      System.out.println("# Ini penjelasan umum home page\t##");
    } else {
      System.out.println("# Selamat datang, " + loggedUsername + "! \t##");
      System.out.println("# Anda sedang berada di home page \t##");
      System.out.println("# Ini penjelasan khusus home page \t##");
    }
  }
}
