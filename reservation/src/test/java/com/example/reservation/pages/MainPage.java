package com.example.reservation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Component
public class MainPage {

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private HomePage homePage;

    @Value("${app.url}")
    private String appUrl;

    @Autowired
    private WebDriver webDriver;


    public void PerformLogin() {
        webDriver.navigate().to(appUrl);

        System.out.println("Login: " + appUrl);
        homePage.ClickLogin();
        loginPage.Login("admin", "adminpassword");
        loginPage.ClickLogin();
    }
}
