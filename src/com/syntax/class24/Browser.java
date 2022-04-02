package com.syntax.class24;

public class Browser {
    void openBrowser(){
        System.out.println("Opening the browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website"+websiteLink);
    }
    void testThePage(){
        System.out.println("Testing the page");
    }
    void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class GoogleChrome extends Browser{
    void openBrowser(){
        System.out.println("Opening the GoogleChrome browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website"+websiteLink+"in GoogleChrome");
    }
    void testThePage(){
        System.out.println("Testing the page in GoogleChrome");
    }
    void closeBrowser(){
        System.out.println("closing the GoogleChrome browser");
    }
}
class Firefox extends Browser{
    void openBrowser(){
        System.out.println("Opening the Firefox browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website"+websiteLink+"in Firefox");
    }
    void testThePage(){
        System.out.println("Testing the page in firefox");
    }
    void closeBrowser(){
        System.out.println("closing the firefox browser");
    }
}
class Safari extends Browser{
    void openBrowser(){
        System.out.println("Opening the safari browser");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website"+websiteLink+"in safari");
    }
    void testThePage(){
        System.out.println("Testing the page in safari");
    }
    void closeBrowser(){
        System.out.println("closing the firefox safari");
    }
}
class IE extends Browser {
    void openBrowser() {
        System.out.println("Opening the IE");
    }

    void loadPage(String websiteLink) {
        System.out.println("loading the website" + websiteLink + "in IE");
    }

    void testThePage() {
        System.out.println("Testing the page in IE");
    }

    void closeBrowser() {
        System.out.println("closing the IE browser");
    }
}





