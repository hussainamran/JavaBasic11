package com.syntax.class241;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver webDriver=new ChromeDriver();
        webDriver.openBrowser();
        webDriver.maximizeWindow();
        webDriver.findElement();
        webDriver.closeBrowser();

        WebDriver webDriver1=new FirefoxDriver();
        webDriver1.openBrowser();
        webDriver1.maximizeWindow();
        webDriver1.findElement();
        webDriver1.closeBrowser();

        WebDriver[] webDriver2={new ChromeDriver(),new FirefoxDriver()};
    for(WebDriver webDriver3:webDriver2){
        webDriver3.openBrowser();
        webDriver3.maximizeWindow();
        webDriver3.findElement();
        webDriver3.closeBrowser();
    }
    }
}
