package org.example.uiBB;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class LoginNSYS {
    @FindBy(how = How.NAME,using = "ClientName")
    private SelenideElement userName;
    @FindBy(how = How.NAME, using = "Login")
    private SelenideElement login;
    @FindBy(how = How.NAME, using = "Password")
    private SelenideElement password;
    @FindBy(how = How.XPATH, using = ".//button[@type='submit']")
    private SelenideElement buttonLogin;

    public void setUserName(String clientName) {
        userName.setValue(clientName);
    }

    public void setLogin(String userName) {
        login.setValue(userName);
    }

    public void setPassword(String pass) {
        password.setValue(pass);
    }
    public StartPage login(String clientName, String userName, String pass) {
        setUserName(clientName);
        setLogin(userName);
        setPassword(pass);
        buttonLogin.click();
        StartPage startPage = page(StartPage.class);
        return startPage;
    }
}
