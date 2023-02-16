package org.example.ui.questionnaires;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class QuestionnairesPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"questionnaire-page\"]//button[1]/span[@class=\"p-button-label\"]")
    private SelenideElement addQuestionnaire;
    @FindBy(how = How.XPATH, using = "//*[@id=\"questionnaire-page\"]//button[3]/span[2][text()='Delete']")
    private SelenideElement deleteQuestionnaire;
    @FindBy(how = How.XPATH, using = "//*[@id=\"questionnaire-page\"]//table/tbody/tr[1]//div[@class='p-checkbox-box p-component']")
    private SelenideElement firstCheckBox;
    @FindBy(how = How.XPATH,  using = "//*[@id=\"main-app\"]//button[2]")
    private SelenideElement yesButton;
    @FindBy(how = How.XPATH,  using = "//*[@id=\"main-app\"]//button[1]")
    private SelenideElement noButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"main-app\"]/div[2]/div/div/div/div/div")
    private SelenideElement successDeleteMessage;
    public CreateNewQuestionnaire addQuestionnaire() {
        addQuestionnaire.click();
        CreateNewQuestionnaire newQuestionnaire = page(CreateNewQuestionnaire.class);
        return newQuestionnaire;
    }
    public void deleteQuestionnaire() {
        firstCheckBox.click();
        deleteQuestionnaire.click();
        yesButton.click();
    }
    public SelenideElement getSuccessDeleteMessage() {
        return successDeleteMessage;
    }
}
