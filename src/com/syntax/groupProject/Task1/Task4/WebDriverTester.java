package com.syntax.groupProject.Task1.Task4;

public class WebDriverTester {
    public static void main(String[] args) {
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.navigate();
        chromeDriver.open();
        chromeDriver.getScreenshot();
        System.out.println(chromeDriver.getTitle("Chrome browser"));
        chromeDriver.close();
        System.out.println();
        FirefoxDriver firefoxDriver=new FirefoxDriver();
        firefoxDriver.navigate();
        firefoxDriver.open();
        firefoxDriver.getScreenshot();
        System.out.println(firefoxDriver.getTitle("Firefox browser"));
        firefoxDriver.close();
        System.out.println();
        SafariDriver safariDriver=new SafariDriver();
        safariDriver.navigate();
        safariDriver.open();
        safariDriver.getScreenshot();
        System.out.println(safariDriver.getTitle("Safari browser"));
        safariDriver.close();

        WebDriver[] webDriver={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};

        for(WebDriver webDriver1:webDriver){
            webDriver1.open();
            webDriver1.close();
            System.out.println();
        }

    }
}

