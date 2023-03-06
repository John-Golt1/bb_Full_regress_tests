package ui_test.questionnaires;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.example.ui.LoginNSYS;
import org.example.ui.StartPage;
import org.example.ui.questionnaires.CreateNewQuestionnaire;
import org.example.ui.questionnaires.QuestionnaireCard;
import org.example.ui.questionnaires.QuestionnairesPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ui_test.BaseTest;
import ui_test.BrowserType;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static ui_test.BrowserType.FOX_BROWSER;
import static ui_test.BrowserType.GOOGLE_CHROME;

@RunWith(Parameterized.class)
public class AddBlocksTest extends BaseTest {
    BrowserType browserType;
    StartPage startPage = new StartPage();
    CreateNewQuestionnaire newQuestionnaire;
    QuestionnairesPage questionnairesPage;
    QuestionnaireCard questionnaireCard;
    public AddBlocksTest(BrowserType type){
        this.browserType = type;
    }
    @Parameterized.Parameters
    public static Object[][] getData(){
        return new Object[][]{
                {GOOGLE_CHROME},
                {FOX_BROWSER}
        };
    }
    private String name = "test";
    @Before
    @Step("Create page object for tests")
    public void preconditions() throws IOException {
        initBrowser(browserType);
        LoginNSYS loginPage = open("https://nstst.net", LoginNSYS.class);
        startPage = loginPage.login("Rob", "Administrator", "Rob_12");
        questionnairesPage = startPage.getQuestionnaires();
        newQuestionnaire = questionnairesPage.addQuestionnaire();
    }
    @Test
    @Description("add block imei and check his name")
    public void addBlockImeiInstore() {
        questionnaireCard = newQuestionnaire.createQuestionnaireInstore(name);
        questionnaireCard.addEMEIBlock();
        Assert.assertEquals("Check IMEI", questionnaireCard.getFirstBlockName().getText());
        questionnaireCard.deleteBlockForTest();
    }
    @Test
    @Description("add block questions and check his name")
    public void addBlockQuestionnaireInstore() {
        questionnaireCard = newQuestionnaire.createQuestionnaireInstore(name);
        questionnaireCard.addQuestionBlock();
        Assert.assertEquals("Question block name", questionnaireCard.getQuestionBlockName().getText());
        questionnaireCard.deleteBlockForTest();
    }
    @Test
    @Description("add block diag and check his name")
    public void addBlockDiagInstore() {
        questionnaireCard = newQuestionnaire.createQuestionnaireInstore(name);
        questionnaireCard.addDiagBlock();
        Assert.assertEquals("Diagnostics results", questionnaireCard.getFirstBlockName().getText());
        questionnaireCard.deleteBlockDiagForTest();
    }
    @Test
    @Description("add block personal data and check his name")
    public void addBlockDataInstore() {
        questionnaireCard = newQuestionnaire.createQuestionnaireInstore(name);
        questionnaireCard.addPersonalDataBlock();
        Assert.assertEquals("Personal data", questionnaireCard.getPersonalDataBlockName().getText());
        questionnaireCard.deleteBlockForTest();
    }
    @Test
    @Description("add block autograding and check his name")
    public void addBlockAutogradingInstore() {
        questionnaireCard = newQuestionnaire.createQuestionnaireInstore(name);
        questionnaireCard.addAutogradingBlock();
        Assert.assertEquals("Autograding results", questionnaireCard.getFirstBlockName().getText());
        questionnaireCard.deleteBlockForTest();
    }
    @Test
    @Description("add block imei and check his name")
    public void addBlockImeiMobile() {
        questionnaireCard = newQuestionnaire.createQuestionnaireMobile(name);
        questionnaireCard.addEMEIBlock();
        Assert.assertEquals("Check IMEI", questionnaireCard.getFirstBlockName().getText());
        questionnaireCard.deleteBlockForTest();
    }
    @Test
    @Description("add block questions and check his name")
    public void addBlockQuestionsMobile() {
        questionnaireCard = newQuestionnaire.createQuestionnaireMobile(name);
        questionnaireCard.addQuestionBlock();
        Assert.assertEquals("Question block name", questionnaireCard.getQuestionBlockName().getText());
        questionnaireCard.deleteBlockQuestionForTest();
    }
    @Test
    @Description("add block diag and check his name")
    public void addBlockDiagMobile() {
        questionnaireCard = newQuestionnaire.createQuestionnaireMobile(name);
        questionnaireCard.addDiagBlock();
        Assert.assertEquals("Diagnostics results", questionnaireCard.getFirstBlockName().getText());
        questionnaireCard.deleteBlockForTest();
    }
    @Test
    @Description("add block autograding and check his name")
    public void addBlockAutogradeMobile() {
        questionnaireCard = newQuestionnaire.createQuestionnaireMobile(name);
        questionnaireCard.addAutogradingBlock();
        Assert.assertEquals("Autograding results", questionnaireCard.getFirstBlockName().getText());
        questionnaireCard.deleteBlockForTest();
    }
    @Test
    @Description("add block personal data and check his name")
    public void addBlockPersonalDataMobile() {
        questionnaireCard = newQuestionnaire.createQuestionnaireMobile(name);
        questionnaireCard.addPersonalDataBlock();
        Assert.assertEquals("Personal data", questionnaireCard.getPersonalDataBlockName().getText());
        questionnaireCard.deleteBlockForTest();
    }
    @Test
    @Description("add block imei and check his name")
    public void addBlockImeiWidget() {
        questionnaireCard = newQuestionnaire.createQuestionnaireWidget(name);
        questionnaireCard.addEMEIBlock();
        Assert.assertEquals("Check IMEI", questionnaireCard.getFirstBlockName().getText());
        questionnaireCard.deleteBlockForTest();
    }
    @Test
    @Description("add block questions and check his name")
    public void addBlockQuestionsWidget() {
        questionnaireCard = newQuestionnaire.createQuestionnaireWidget(name);
        questionnaireCard.addQuestionBlock();
        Assert.assertEquals("Question block name", questionnaireCard.getQuestionBlockName().getText());
        questionnaireCard.deleteBlockQuestionForTest();
    }
    @Test
    @Description("add block diag and check his name")
    public void addBlockDiagWidget() {
        questionnaireCard = newQuestionnaire.createQuestionnaireWidget(name);
        questionnaireCard.addDiagBlock();
        Assert.assertEquals("Diagnostics results", questionnaireCard.getFirstBlockName().getText());
        questionnaireCard.deleteBlockDiagForTest();
    }
    @Test
    @Description("add block autograding and check his name")
    public void addBlockAutogradeWidget() {
        questionnaireCard = newQuestionnaire.createQuestionnaireWidget(name);
        questionnaireCard.addAutogradingBlock();
        Assert.assertEquals("Autograding results", questionnaireCard.getFirstBlockName().getText());
        questionnaireCard.deleteBlockForTest();
    }
    @Test
    @Description("Добавляем блок personal data and check his name")
    public void addBlockPersonalDataWidget() {
        questionnaireCard = newQuestionnaire.createQuestionnaireWidget(name);
        questionnaireCard.addPersonalDataBlock();
        Assert.assertEquals("Personal data", questionnaireCard.getPersonalDataBlockName().getText());
        questionnaireCard.deleteBlockForTest();
    }
//    @Test
//    public void createQuestionnaireRobot() {
//        questionnaireCard = newQuestionnaire.createQuestionnaireRobot(name);
//        questionnaireCard.clickDeleteBlockRobot();
//        questionnaireCard.addEMEIBlock();
//        questionnaireCard.getFirstBlock().isEnabled();
//        questionnaireCard.deleteBlockForTest();
//    }
    @After
    public void quit() {
       try {
           questionnaireCard.clickCancel();
           questionnairesPage.deleteQuestionnaire();
           questionnairesPage.getSuccessDeleteMessage().shouldBe(Condition.visible);
       } finally {
           Selenide.closeWebDriver();
       }
    }
}
