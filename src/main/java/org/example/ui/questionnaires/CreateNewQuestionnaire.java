package org.example.ui.questionnaires;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class CreateNewQuestionnaire {
    @FindBy(how = How.XPATH, using = "//*[@id=\"create-new-questionnaire\"]//div[@class=\"p-col-8\"]/input")
    private SelenideElement questionnaireNameField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"create-new-questionnaire\"]//div/div[2]/div")
    private SelenideElement questionnaireTypeList;
    @FindBy(how = How.XPATH, using = "//*[@id=\"create-new-questionnaire\"]//ul/li[1]")
    private SelenideElement instoreType;
    @FindBy(how = How.XPATH, using = "//*[@id=\"create-new-questionnaire\"]//ul/li[2]")
    private SelenideElement widgetType;
    @FindBy(how = How.XPATH, using = "//*[@id=\"create-new-questionnaire\"]//ul/li[3]")
    private SelenideElement mobileType;
    @FindBy(how = How.XPATH, using = "//*[@id=\"create-new-questionnaire\"]//ul/li[4]")
    private SelenideElement robotType;
    @FindBy(how = How.XPATH, using = "//*[@id=\"create-new-questionnaire\"]/div[3]/button[2]")
    private SelenideElement createButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"create-new-questionnaire\"]/div[3]/button[1]")
    private SelenideElement cancelButton;

    public void nameGenerator(String q) {
        QuestionnaireGenerator generator = new QuestionnaireGenerator();
        generator.QuestionnaireGenerator();
        questionnaireNameField.setValue(q + generator);
    }
    public QuestionnaireCard createQuestionnaireInstore(String name) {
        nameGenerator(name);
        questionnaireTypeList.click();
        instoreType.shouldBe(Condition.visible).click();
        createButton.click();
        QuestionnaireCard questionnaireCard = page(QuestionnaireCard.class);
        return questionnaireCard;
    }
    public QuestionnaireCard createQuestionnaireMobile(String name) {
        nameGenerator(name);
        questionnaireTypeList.click();
        mobileType.shouldBe(Condition.visible).click();
        createButton.click();
        QuestionnaireCard questionnaireCard = page(QuestionnaireCard.class);
        return questionnaireCard;
    }
    public QuestionnaireCard createQuestionnaireWidget(String name) {
        nameGenerator(name);
        questionnaireTypeList.click();
        widgetType.shouldBe(Condition.visible).click();
        createButton.click();
        QuestionnaireCard questionnaireCard = page(QuestionnaireCard.class);
        return questionnaireCard;
    }
    public QuestionnaireCard createQuestionnaireRobot(String name) {
        nameGenerator(name);
        questionnaireTypeList.click();
        robotType.shouldBe(Condition.visible).click();
        createButton.click();
        QuestionnaireCard questionnaireCard = page(QuestionnaireCard.class);
        return questionnaireCard;
    }
    public void clickCancel() {
        cancelButton.click();
    }
}
