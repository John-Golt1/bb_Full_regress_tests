package ui_test.questionnaires;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
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

import static com.codeborne.selenide.Selenide.open;

public class CreateQuestionnairesTest {
    StartPage startPage = new StartPage();
    CreateNewQuestionnaire newQuestionnaire;
    QuestionnairesPage questionnairesPage;
    QuestionnaireCard questionnaireCard;
    private String name = "test";
    @Before
    public void preconditions() {
        LoginNSYS loginPage = open("https://nstst1.net", LoginNSYS.class);
        startPage = loginPage.login("Rob", "Administrator", "Rob_12");
        questionnairesPage = startPage.getQuestionnaires();
        newQuestionnaire = questionnairesPage.addQuestionnaire();
    }
    @Test
    public void createQuestionnaireInstore() {
        questionnaireCard = newQuestionnaire.createQuestionnaireInstore(name);
        Assert.assertEquals("Questionnaire" ,questionnaireCard.getTitle());
    }
    @Test
    public void createQuestionnaireWidget() {
        questionnaireCard = newQuestionnaire.createQuestionnaireWidget(name);
        Assert.assertEquals("Questionnaire" ,questionnaireCard.getTitle());
    }
    @Test
    public void createQuestionnaireMobile() {
        questionnaireCard = newQuestionnaire.createQuestionnaireMobile(name);
        Assert.assertEquals("Questionnaire" ,questionnaireCard.getTitle());
    }
    @Test
    public void createQuestionnaireRobot() {
        questionnaireCard = newQuestionnaire.createQuestionnaireRobot(name);
        questionnaireCard.clickDeleteBlockRobot();
        Assert.assertEquals("Questionnaire" ,questionnaireCard.getTitle());
    }
    @After
    @Step("Delete test questionnaire and close browser")
    public void deleteTestValues() {
        questionnaireCard.clickCancel();
        questionnairesPage.deleteQuestionnaire();
        questionnairesPage.getSuccessDeleteMessage().shouldBe(Condition.visible);
        Selenide.closeWebDriver();
    }
}
