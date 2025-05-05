package tp7;

public class Main {
  public static void main(String[] args) {
    // Membuat objek HomePage dan DashboardPage
    HomePage homePage = new HomePage("Home Page");
    DashboardPage dashboardPage = new DashboardPage("Dashboard Page");

    System.out.println("===== Sebelum Login =====");
    System.out.println("\n----- Home Page Sebelum Login -----");
    homePage.showFullPage();

    System.out.println("\n----- Dashboard Page Sebelum Login -----");
    dashboardPage.showFullPage();

    System.out.println("\n===== Setelah Login =====");
    System.out.println("\n----- Proses Login -----");
    homePage.login("AbdulMalik");
    dashboardPage.login("AbdulMalik");

    System.out.println("\n----- Home Page Setelah Login -----");
    homePage.showFullPage();

    System.out.println("\n----- Dashboard Page Setelah Login -----");
    dashboardPage.showFullPage();
  }
}
