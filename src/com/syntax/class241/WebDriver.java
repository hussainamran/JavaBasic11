package com.syntax.class241;

public interface WebDriver {
    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour:
 openBrowser(), closeBrowser(), maximizeWindow(), findElement(). Create 2 classes that
implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open chrome browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize chrome browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find an element on chrome browser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Closed chrome browser");
    }

}
class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Open firefox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize firefox browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find an element on firefox browser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Closed firefox browser");
    }
}