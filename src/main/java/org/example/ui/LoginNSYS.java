package org.example.ui;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class LoginNSYS {
    @FindBy(how = How.NAME,using = "ClientName")
    private SelenideElement userName;
    @FindBy(how = How.NAME, using = "Login")
    private SelenideElement login;
    @FindBy(how = How.NAME, using = "Email")
    private SelenideElement Email;
    @FindBy(how = How.NAME, using = "Password")
    private SelenideElement password;
    @FindBy(how = How.CSS, using = "button[title='Login']")
    private SelenideElement buttonLogin;
    @FindBy(how = How.CSS, using = ".login-version-link")
    private SelenideElement buttonTwoFields;
    @FindBy(how = How.XPATH, using = "//form/div[@role='alert']")
    private SelenideElement messageError;
    public String messageError(){
        return messageError.getText();
    }

    public void setUserName(String clientName) {
        userName.setValue(clientName);
    }

    public void setEmail(String email) {
        Email.setValue(email);
    }
    public StartPage login2(String email, String password){
        buttonTwoFields.click();
        setEmail(email);
        setPassword(password);
        buttonLogin.click();
        StartPage startPage = page(StartPage.class);
        return startPage;
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
