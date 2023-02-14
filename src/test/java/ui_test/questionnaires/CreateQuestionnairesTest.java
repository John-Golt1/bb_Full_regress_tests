package ui_test.questionnaires;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.example.uiBB.LoginNSYS;
import org.example.uiBB.StartPage;
import org.example.uiBB.questionnaires.CreateNewQuestionnaire;
import org.example.uiBB.questionnaires.QuestionnaireCard;
import org.example.uiBB.questionnaires.QuestionnairesPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.Duration;

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
    }
    @Test
    public void createQuestionnaireWidget() {
        questionnaireCard = newQuestionnaire.createQuestionnaireWidget(name);
    }
    @Test
    public void createQuestionnaireMobile() {
        questionnaireCard = newQuestionnaire.createQuestionnaireMobile(name);
    }
    @Test
    public void createQuestionnaireRobot() {
        questionnaireCard = newQuestionnaire.createQuestionnaireRobot(name);
        questionnaireCard.clickDeleteBlockRobot();
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
