package com.syntax.groupProject.Task1.Task4;

public interface WebDriver {
    void open();
    void close();
    String getTitle(String Title);
}
interface RemoteWebDriver extends WebDriver{
    void navigate();
}
interface TakeScreenshot extends WebDriver,RemoteWebDriver{
    void getScreenshot();
}
class ChromeDriver implements RemoteWebDriver,TakeScreenshot{
    @Override
    public void navigate() {
        System.out.println("Navigate to chrome browser");
    }
    @Override
    public void open() {
        System.out.println("Open chrome browser");
    }
    @Override
    public String getTitle(String Title) {
        return Title;
    }
    @Override
    public void getScreenshot() {
        System.out.println("Take the screen shot of the chrome browser");
    }
    @Override
    public void close() {
        System.out.println("Close chrome browser");

    }
}
class FirefoxDriver extends ChromeDriver{
    @Override
    public void navigate() {
        System.out.println("Navigate to the FirefoxDriver browser");
    }

    @Override
    public void open() {
        System.out.println("Open FirefoxDriver browser");
    }

    @Override
    public String getTitle(String Title) {
        return Title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take screenshot of the Firefox browser");
    }

    @Override
    public void close() {
        System.out.println("Close FirefoxDriver browser");
    }
}
class SafariDriver extends FirefoxDriver {
    @Override
    public void navigate() {
        System.out.println("Navigate to the Safari browser");
    }

    @Override
    public void open() {
        System.out.println("Open Safari browser");
    }

    @Override
    public String getTitle(String Title) {
        return Title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take screenshot of the Safari browser");
    }

    @Override
    public void close() {
        System.out.println("Close Safari browser");
    }
}
