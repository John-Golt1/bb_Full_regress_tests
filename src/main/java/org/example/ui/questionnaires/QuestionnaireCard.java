package org.example.ui.questionnaires;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class QuestionnaireCard {
    @FindBy(how = How.XPATH, using = "//*[@id=\"questionnaire-card\"]//div[2]/button[1]/span[1]")
    private SelenideElement checkImeiBlock;
    @FindBy(how = How.XPATH, using = "//*[@id=\"block0\"]//div[2]/button[2]")
    private SelenideElement deleteImeiBlock;
    @FindBy(how = How.XPATH, using = "//*[@id=\"block0\"]//div[2]/button[3]")
    private SelenideElement deleteQuestionBlock;
    @FindBy(how = How.XPATH, using = "//*[@id=\"block0\"]//div[2]/button")
    private SelenideElement deleteDiagBlock;
    @FindBy(how = How.XPATH, using = "//*[@id=\"questionnaire-card\"]//button[2]/span[text()='Add questions']")
    private SelenideElement questionsBlock;
    @FindBy(how = How.XPATH, using = "//*[@id=\"questionnaire-card\"]//button[3]/span[1]")
    private SelenideElement diagTestBlock;
    @FindBy(how = How.XPATH, using = "//*[@id=\"questionnaire-card\"]//button[4]/span[1]")
    private SelenideElement autogradingBlock;
    @FindBy(how = How.XPATH, using = "//*[@id=\"questionnaire-card\"]//button[5]/span[1]")
    private SelenideElement personalDataBlock;
    @FindBy(how = How.XPATH, using = "//*[@id=\"questionnaire-card\"]//button[6]/span[1]")
    private SelenideElement dataErasureBlock;
    @FindBy(how = How.XPATH, using = "//*[@id=\"questionnaire-card\"]//div[3]/button[1]")
    private SelenideElement cancelButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"questionnaire-card\"]//div[3]/button")
    private SelenideElement deleteBlockRobot;
    @FindBy(how = How.XPATH, using = "//*[@id=\"main-app\"]//button[2]")
    private SelenideElement confirmDelete;
    @FindBy(how = How.XPATH, using = "//*[@id=\"questionnaire-card\"]//div[3]/button[2]")
    private SelenideElement nextButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"block0\"]")
    private SelenideElement firstBlock;
    @FindBy(how = How.XPATH, using = "//*[@id=\"block0\"]//button/span[text()='Question block name']")
    private SelenideElement questionBlockName;
    @FindBy(how = How.XPATH, using = "//*[@id=\"block0\"]//button/span[text()='Personal data']")
    private SelenideElement personalDataBlockName;
    @FindBy(how = How.XPATH, using = "//*[@id=\"block0\"]//div[@class='block-title']")
    private SelenideElement firstBlockName; //diag, autograde
    @FindBy(how = How.XPATH, using = "//*[@id=\"questionnaire-card\"]/div[@class='title']")
    private SelenideElement titlePage;
    public String getTitle(){
        titlePage.shouldBe(Condition.visible);
        return titlePage.getText();
    }

    public void clickCancel() {
        cancelButton.click();
    }
    public void clickDeleteBlockRobot() {
        deleteBlockRobot.click();
        confirmDelete.click();
    }
    public void deleteBlockForTest() {
        deleteImeiBlock.click();
    }
    public void deleteBlockDiagForTest() {
        deleteDiagBlock.click();
    }
    public void deleteBlockQuestionForTest() {
        deleteQuestionBlock.click();
    }
    public void addEMEIBlock() {
        checkImeiBlock.shouldBe(Condition.visible).click();
    }
    public void addQuestionBlock() {
        questionsBlock.shouldBe(Condition.visible).click();
    }
    public void addDiagBlock() {
        diagTestBlock.shouldBe(Condition.visible).click();
    }
    public void addAutogradingBlock() {
        autogradingBlock.shouldBe(Condition.visible).click();
    }
    public void addPersonalDataBlock() {
        personalDataBlock.shouldBe(Condition.visible).click();
    }
    public SelenideElement getFirstBlock() {
        return firstBlock;
    }
    public SelenideElement getQuestionBlockName() {
        return questionBlockName;
    }
    public SelenideElement getFirstBlockName() {
        return firstBlockName;
    }
    public SelenideElement getPersonalDataBlockName() {
        return personalDataBlockName;
    }
}
