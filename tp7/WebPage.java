package tp7;

public abstract class WebPage {
  protected String webTitle;
  protected String loggedUsername;

  public WebPage(String title) {
    this.webTitle = title;
    this.loggedUsername = null;
  }
  
  public void showHeader() {
    System.out.println("######################################");
    System.out.println("### " + webTitle + "\t##");
    System.out.println("#-----------------------------------##");
  }
  public void showFooter() {
    System.out.println("#-----------------------------------##");
    System.out.println("# Created by AbdulMalik \t##");
    System.out.println("######################################");
  }
  public abstract void showMainPage();
  public void showFullPage() {
    showHeader();
    showMainPage();
    showFooter();
  }
  public void login(String username) {
    loggedUsername = username;
  }
}
