package org.example.uiBB;

import com.codeborne.selenide.SelenideElement;
import org.example.uiBB.questionnaires.QuestionnairesPage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class StartPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/li[2]/a")
    private SelenideElement questionnaires;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/li[3]/a")
    private SelenideElement categories;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/li[4]/a")
    private SelenideElement devices;
    @FindBy(how = How.XPATH, using = "//*[@id=\"menu\"]/li[5]/a")
    private SelenideElement preferences;
    public QuestionnairesPage getQuestionnaires() {
        questionnaires.click();
        QuestionnairesPage questionnairesPage = page(QuestionnairesPage.class);
        return questionnairesPage;
    }
}
