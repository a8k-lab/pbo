package tp7;

public class DashboardPage extends WebPage implements Loginable {
  public DashboardPage(String title) {
    super(title);
  }

  @Override
  public void login(String input) {
    super.login(input);
  }
  @Override
  public void showMainPage() {
    if (loggedUsername == null) {
      System.out.println("# Akses ditutup untuk user guest \t##");
      System.out.println("# Mohon login terlebih dahulu \t##");
    } else {
      System.out.println("# Dashboard Page – " + loggedUsername + " \t##");
      System.out.println("# Opsi-opsi page dashboard \t##");
      System.out.println("# dsb \t##");
    }
  }
}
