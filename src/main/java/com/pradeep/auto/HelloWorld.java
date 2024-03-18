package com.pradeep.auto;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

public class HelloWorld {

    @Test
    public void testHelloWorld(){
        Playwright  playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.google.co.uk");
        page.close();
        System.out.println("Completed");
    }
}
