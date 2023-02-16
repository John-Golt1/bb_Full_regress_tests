package ui_test.devices;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.example.ui.LoginNSYS;
import org.example.ui.StartPage;
import org.example.ui.devices.DevicesPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.refresh;

public class DevicesTest {
    StartPage startPage = new StartPage();
    DevicesPage devicesPage;
    @Before
    public void preconditions() {
        LoginNSYS loginPage = open("https://nstst1.net", LoginNSYS.class);
        startPage = loginPage.login("Rob", "Administrator", "Rob_12");
        devicesPage = startPage.getDevices();
    }
//    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//    }
    @Test
    @Description("application of the questionnaire inStore")
    public void testActionsQuestionnaireInstore() {
        devicesPage.firstCheckboxDeviceClick();
        devicesPage.chooseInstoreQuestionnaire();
        refresh();
        String  expectedName = devicesPage.getTextFromQuestionnaireInstoreName();
        Assert.assertEquals("for autotest instore", expectedName);
    }
    @Test
    @Description("application of the questionnaire Widget")
    public void testActionsQuestionnaireWidget() {
        devicesPage.firstCheckboxDeviceClick();
        devicesPage.chooseWidgetQuestionnaire();
        refresh();
        String expectedName = devicesPage.getTextFromQuestionnaireWidgetName();
        Assert.assertEquals("for autotest test", expectedName);
    }
    @Test
    @Description("application of the questionnaire Mobile")
    public void testActionsQuestionnaireMobile() {
        devicesPage.firstCheckboxDeviceClick();
        devicesPage.chooseMobileQuestionnaire();
        refresh();
        String expectedName = devicesPage.getTextFromQuestionnaireMobileName();
        Assert.assertEquals("for autotest mobile", expectedName);
    }
    @Test
    @Description("application of the questionnaire Robot")
    public void testActionsQuestionnaireRobot() {
        devicesPage.firstCheckboxDeviceClick();
        devicesPage.chooseRobotQuestionnaire();
        refresh();
        String expectedName = devicesPage.getTextFromQuestionnaireRobotName();
        Assert.assertEquals("Default", expectedName);
    }
    @After
    public void close() {
        Selenide.closeWebDriver();
    }
}
