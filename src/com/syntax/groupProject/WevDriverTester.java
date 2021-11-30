package com.syntax.groupProject;

public class WevDriverTester {
    public static void main(String[] args) {
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.navigate();
        chromeDriver.getScreenshot();
        System.out.println(chromeDriver.getTitle("Chrome browser"));
        System.out.println();
        FirefoxDriver firefoxDriver=new FirefoxDriver();
        firefoxDriver.navigate();
        firefoxDriver.getScreenshot();
        System.out.println(firefoxDriver.getTitle("Firefox browser"));
        System.out.println();
        SafariDriver safariDriver=new SafariDriver();
        safariDriver.navigate();
        safariDriver.getScreenshot();
        System.out.println(safariDriver.getTitle("Safari browser"));

        WebDriver[] webDriver={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};

        for(WebDriver webDriver1:webDriver){
            webDriver1.open();
            webDriver1.close();
            System.out.println();
        }
    }
}
