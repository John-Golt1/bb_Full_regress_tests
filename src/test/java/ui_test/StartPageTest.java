package ui_test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.example.ui.LoginNSYS;
import org.example.ui.StartPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;

public class StartPageTest {
    @Before
    public void setUp(){
        Configuration.browser = "firefox";
    }
//    @Test
//    public void loginWith3Params() {
//        LoginNSYS login = open("https://nstst.net", LoginNSYS.class);
//        StartPage startPage = login.login("Rob", "Administrator", "Rob_12");
//        Assert.assertEquals("  Questionnaire", startPage.getElementQuestionnaire());
//    }
    @Test
    public void loginWith2Params(){
       LoginNSYS login = open("https://nstst.net", LoginNSYS.class);
       StartPage startPage = login.login2("rob@rob.com", "Rob_12");
        Assert.assertEquals("  Questionnaire", startPage.getElementQuestionnaire());
    }
    @Test
    public void checkErrorMessageUnActiveClient(){
        LoginNSYS login = open("https://nstst.net", LoginNSYS.class);
        login.login("Test", "Administrator", "Rob_12");
        Assert.assertEquals("Client is not active", login.messageError());
    }
    @Test
    public void checkErrorMessageWithSameClientName(){
        LoginNSYS login = open("https://nstst.net", LoginNSYS.class);
        login.login("TestTestTestTest", "Administrator", "Rob_12");
        Assert.assertEquals("Client or user is not found", login.messageError());
    }
    @Test
    public void checkErrorMessageWithSamePassword(){
        LoginNSYS login = open("https://nstst.net", LoginNSYS.class);
        login.login("Rob", "Administrator", "Test");
        Assert.assertEquals("Incorrect password", login.messageError());
    }
    @After
    public void close(){
        Selenide.closeWebDriver();
    }
}
