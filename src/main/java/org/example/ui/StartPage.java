package org.example.ui;

import com.codeborne.selenide.SelenideElement;
import org.example.ui.devices.DevicesPage;
import org.example.ui.questionnaires.QuestionnairesPage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class StartPage {
    @FindBy(how = How.CSS, using = "a[href$='Questionnaire#']")
    private SelenideElement questionnaires;
    @FindBy(how = How.CSS, using = "a[href$='Categories#']")
    private SelenideElement categories;
    @FindBy(how = How.CSS, using = "a[href$='Devices#']")
    private SelenideElement devices;

    public QuestionnairesPage getQuestionnaires() {
        questionnaires.click();
        QuestionnairesPage questionnairesPage = page(QuestionnairesPage.class);
        return questionnairesPage;
    }
    public String getElementQuestionnaire(){
       return questionnaires.getText();
    }
    public DevicesPage getDevices() {
        devices.click();
        DevicesPage devicesPage = page(DevicesPage.class);
        return devicesPage;
    }
}
