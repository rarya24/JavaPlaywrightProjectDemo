package tests;

import org.testng.annotations.Test;

import base.BaseTest;

public class FirstTest extends BaseTest{

    @Test
    public void verifyTitle(){
        page.navigate("https://www.google.com/ncr"); // no country redirect
        //handle cookie popup
        if(page.isVisible("button:has-text('Accept All')")){
            page.click("button:has-text('Accept All')");
        }
         System.out.println("The Page Title is:" + page.title());
    }

    /*
    public static void main(String[] args) {
        
        try(Playwright playwright = Playwright.create()){
            
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            page.navigate("https://www.google.com");

            System.out.println("The Page Title is:" + page.title());
            browser.close();
        }
    }*/

}
