package com.example.reservation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HomePage {
    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement lnkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement lnkEmployeeList;

    @Autowired
    private WebDriver webDriver;

    @PostConstruct
    public void InitLoginPage() {
        PageFactory.initElements(webDriver, this);
    }

    public LoginPage ClickLogin() {
        lnkLogin.click();
        System.out.println("Click Login");
        return new LoginPage();
    }

    public void ClickEmployeeList() {
        lnkEmployeeList.click();
    }
}
