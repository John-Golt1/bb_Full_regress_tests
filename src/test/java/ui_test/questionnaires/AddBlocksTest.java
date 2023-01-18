package ui_test.questionnaires;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.example.uiBB.LoginNSYS;
import org.example.uiBB.StartPage;
import org.example.uiBB.questionnaires.CreateNewQuestionnaire;
import org.example.uiBB.questionnaires.QuestionnaireCard;
import org.example.uiBB.questionnaires.QuestionnairesPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class AddBlocksTest {
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
    @Description("Добавляем блок чек имей и проверяем, что он добавился")
    public void addBlockImeiInstore() {
        questionnaireCard = newQuestionnaire.createQuestionnaireInstore(name);
        questionnaireCard.addEMEIBlock();
        questionnaireCard.getFirstBlock().isEnabled();
        questionnaireCard.deleteBlockForTest();
    }
    @Test
    @Description("Добавляем блок вопросов и проверяем, что он добавился")
    public void addBlockQuestionnaireInstore() {
        questionnaireCard = newQuestionnaire.createQuestionnaireInstore(name);
        questionnaireCard.addQuestionBlock();
        questionnaireCard.getFirstBlock().isEnabled();
        questionnaireCard.deleteBlockForTest();
    }
    @Test
    @Description("Добавляем блок диагностики и проверяем, что он добавился")
    public void addBlockDiagInstore() {
        questionnaireCard = newQuestionnaire.createQuestionnaireInstore(name);
        questionnaireCard.addDiagBlock();
        questionnaireCard.getFirstBlock().isEnabled();
        questionnaireCard.deleteBlockDiagForTest();
    }
    @Test
    @Description("Добавляем блок персональных данных и проверяем, что он добавился")
    public void addBlockDataInstore() {
        questionnaireCard = newQuestionnaire.createQuestionnaireInstore(name);
        questionnaireCard.addPersonalDataBlock();
        questionnaireCard.getFirstBlock().isEnabled();
        questionnaireCard.deleteBlockForTest();
    }
    @Test
    @Description("Добавляем блок автогрейдинга и проверяем, что он добавился")
    public void addBlockAutogradingInstore() {
        questionnaireCard = newQuestionnaire.createQuestionnaireInstore(name);
        questionnaireCard.addAutogradingBlock();
        questionnaireCard.getFirstBlock().isEnabled();
        questionnaireCard.deleteBlockForTest();
    }
    @Test
    @Description("Добавляем блок чек имей и проверяем, что он добавился")
    public void addBlockImeiMobile() {
        questionnaireCard = newQuestionnaire.createQuestionnaireMobile(name);
        questionnaireCard.addEMEIBlock();
        questionnaireCard.getFirstBlock().isEnabled();
        questionnaireCard.deleteBlockForTest();
    }
    @Test
    @Description("Добавляем блок вопросов и проверяем, что он добавился")
    public void addBlockQuestionsMobile() {
        questionnaireCard = newQuestionnaire.createQuestionnaireMobile(name);
        questionnaireCard.addQuestionBlock();
        questionnaireCard.getFirstBlock().isEnabled();
        questionnaireCard.deleteBlockQuestionForTest();
    }
    @Test
    @Description("Добавляем блок диагностики и проверяем, что он добавился")
    public void addBlockDiagMobile() {
        questionnaireCard = newQuestionnaire.createQuestionnaireMobile(name);
        questionnaireCard.addDiagBlock();
        questionnaireCard.getFirstBlock().isEnabled();
        questionnaireCard.deleteBlockForTest();
    }
    @Test
    @Description("Добавляем блок автогрейдинга и проверяем, что он добавился")
    public void addBlockAutogradeMobile() {
        questionnaireCard = newQuestionnaire.createQuestionnaireMobile(name);
        questionnaireCard.addAutogradingBlock();
        questionnaireCard.getFirstBlock().isEnabled();
        questionnaireCard.deleteBlockForTest();
    }
    @Test
    @Description("Добавляем блок персональных данных и проверяем, что он добавился")
    public void addBlockPersonalDataMobile() {
        questionnaireCard = newQuestionnaire.createQuestionnaireMobile(name);
        questionnaireCard.addPersonalDataBlock();
        questionnaireCard.getFirstBlock().isEnabled();
        questionnaireCard.deleteBlockForTest();
    }
    @Test
    @Description("Добавляем блок чек имей и проверяем, что он добавился")
    public void addBlockImeiWidget() {
        questionnaireCard = newQuestionnaire.createQuestionnaireWidget(name);
        questionnaireCard.addEMEIBlock();
        questionnaireCard.getFirstBlock().isEnabled();
        questionnaireCard.deleteBlockForTest();
    }
    @Test
    @Description("Добавляем блок чек имей и проверяем, что он добавился")
    public void addBlockQuestionsWidget() {
        questionnaireCard = newQuestionnaire.createQuestionnaireWidget(name);
        questionnaireCard.addQuestionBlock();
        questionnaireCard.getFirstBlock().isEnabled();
        questionnaireCard.deleteBlockQuestionForTest();
    }
    @Test
    @Description("Добавляем блок чек имей и проверяем, что он добавился")
    public void addBlockDiagWidget() {
        questionnaireCard = newQuestionnaire.createQuestionnaireWidget(name);
        questionnaireCard.addDiagBlock();
        questionnaireCard.getFirstBlock().isEnabled();
        questionnaireCard.deleteBlockDiagForTest();
    }
    @Test
    @Description("Добавляем блок чек имей и проверяем, что он добавился")
    public void addBlockAutogradeWidget() {
        questionnaireCard = newQuestionnaire.createQuestionnaireWidget(name);
        questionnaireCard.addAutogradingBlock();
        questionnaireCard.getFirstBlock().isEnabled();
        questionnaireCard.deleteBlockForTest();
    }
    @Test
    @Description("Добавляем блок чек имей и проверяем, что он добавился")
    public void addBlockPersonalDataWidget() {
        questionnaireCard = newQuestionnaire.createQuestionnaireWidget(name);
        questionnaireCard.addPersonalDataBlock();
        questionnaireCard.getFirstBlock().isEnabled();
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
