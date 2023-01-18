package ui_test;

import org.example.uiBB.LoginNSYS;
import org.junit.After;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.open;

public class StartPageTest {
    @After
    public void testLogin() {
        LoginNSYS login = open("https://nstst.net", LoginNSYS.class);
        login.login("Rob", "Administrator", "Rob_12");
    }
    @Test
    public void addCheckImeiBlock() {

    }
}
