package org.example.ui.devices;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

public class DevicesPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//button[1]/span[2][text()='Add Devices']")
    private SelenideElement addDeviceButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div[1]/table/tbody/tr[1]/td[1]/div")
    private SelenideElement firstCheckboxDevices;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div[1]/table/tbody/tr[1]/td[2]/div")
    private SelenideElement secondCheckboxDevices;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]/div/div[2]/div[1]/div/button[2]/span[1]")
    private SelenideElement filterButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div[@role='dialog']//div[@class='p-dropdown p-component p-inputwrapper p-inputwrapper-filled']")
    private SelenideElement chooseColumnFilter;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div[@role='dialog']//div[@class='p-dropdown-items-wrapper']/ul/li[1]")
    private SelenideElement firstElementDropDownChooseColumn;
    @FindBy(how = How.XPATH, using = "///*[@id=\"devices-page\"]//div[@role='dialog']//div[@class='p-dropdown p-component p-inputwrapper']")
    private SelenideElement filterType;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div[@role='dialog']//div/ul/li[@aria-label='Contains']")
    private SelenideElement containsType;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div[@role='dialog']//div//input[@class='p-column-filter p-inputtext p-component']")
    private SelenideElement enterValue;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div[@role='dialog']//div/button[@class='p-dialog-header-icon p-dialog-header-close p-link']")
    private SelenideElement closeIconWindowFilter;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div[@role='dialog']//div/button[2]")
    private SelenideElement cancelFilterButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div[@role='dialog']//div/button[3]")
    private SelenideElement applyFilterButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div/button/i[@class='pi pi-chevron-down']")
    private SelenideElement actionsDropdown;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]/div/div[2]/div[3]/div")
    private SelenideElement windowChooseQuestionnaire;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div/div[@class='p-menu p-component p-menu-overlay']/ul/li[1]")
    private SelenideElement chooseWidgetQuestionnaire;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div/div[@class='p-menu p-component p-menu-overlay']/ul/li[2]")
    private SelenideElement chooseInstoreQuestionnaire;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div/div[@class='p-menu p-component p-menu-overlay']/ul/li[3]")
    private SelenideElement chooseMobileQuestionnaire;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div/div[@class='p-menu p-component p-menu-overlay']/ul/li[4]")
    private SelenideElement chooseRobotQuestionnaire;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div/div[@class='p-menu p-component p-menu-overlay']/ul/li[5]")
    private SelenideElement chooseRewardType;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div[@role='dialog']//div[@class='p-scrollpanel-content']/div//label[@for='0a241f09-39b8-4479-9e15-6c199bb0c3e8']")
    private SelenideElement autotestInstoreQuestionnaireChoose; //опросник для инстор
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div[@role='dialog']//div[@class='p-scrollpanel-content']/div//label[@for='e54cbccf-ddb8-42c8-bb5c-b749a706b2a0']")
    private SelenideElement autotestWidgetQuestionnaireChoose; //опросник для виджета
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div[@role='dialog']//div[@class='p-scrollpanel-content']//label[@for='8bf093bb-e2b1-4c6c-9df2-5ed9a8278a3d']")
    private SelenideElement autotestMobileQiestionnaireChoose;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div[@role='dialog']//div[@class='p-scrollpanel-content']//label[@for='31e2e454-5cc7-457a-bd25-c18a001595e2']")
    private SelenideElement autotestRobotQiestionnaireChoose;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//button[2]/span[text()='Choose']")
    private SelenideElement chooseQuestionnaireButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//table/tbody/tr[1]/td[12]/a")
    private SelenideElement getTextFromCell; //получаем текст из ячейки в таблице(название опросника для inStore
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//table/tbody/tr[1]/td[11]/a")
    private SelenideElement getTextFromCellWidget; //получаем текст из ячейки в таблице(название опросника для widget
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//table/tbody/tr[1]/td[13]/a")
    private SelenideElement getTextFromCellMobile; //получаем текст из ячейки в таблице(название опросника для mobile
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//table/tbody/tr[1]/td[14]/a")
    private SelenideElement getTextFromCellRobot; //получаем текст из ячейки в таблице(название опросника для robot
    @FindBy(how = How.XPATH, using = "//*[@id=\"main-app\"]/div[2]/div/div/div/div/div")
    private SelenideElement successEdit;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div[@role='checkbox'][@aria-checked='true']")
    private SelenideElement checkoxTrue;
    @Step("click to first checkbox and check it's")
    public void firstCheckboxDeviceClick() {
        firstCheckboxDevices.shouldBe(Condition.visible, Duration.ofSeconds(10));
        firstCheckboxDevices.click();
        checkoxTrue.shouldBe(Condition.enabled);
    }
//    public void actionFalse() {
//        windowChooseQuestionnaire.shouldBe(Condition.not(Condition.visible));
//    }
    @Step("Выбор опросника Instore через Actions")
    public void chooseInstoreQuestionnaire() {
        actionsDropdown.click();
        chooseInstoreQuestionnaire.click();
        autotestInstoreQuestionnaireChoose.click();
        chooseQuestionnaireButton.click();
        successEdit.shouldBe(Condition.enabled);
    }
    @Step("Выбор опросника Widget через Actions")
    public void chooseWidgetQuestionnaire() {
        actionsDropdown.click();
        chooseWidgetQuestionnaire.click();
        autotestWidgetQuestionnaireChoose.click();
        chooseQuestionnaireButton.click();
        successEdit.shouldBe(Condition.enabled);
    }
    @Step("Выбор опросника Mobile через Actions")
    public void chooseMobileQuestionnaire() {
        actionsDropdown.click();
        chooseMobileQuestionnaire.click();
        autotestMobileQiestionnaireChoose.click();
        chooseQuestionnaireButton.click();
        successEdit.shouldBe(Condition.enabled);
    }
    @Step("Выбор опросника Robot через Actions")
    public void chooseRobotQuestionnaire() {
        actionsDropdown.click();
        chooseRobotQuestionnaire.click();
        autotestRobotQiestionnaireChoose.click();
        chooseQuestionnaireButton.click();
        successEdit.shouldBe(Condition.enabled);
    }
    @Step("Get text from cell in a table for inStore questionnaire name")
    public String getTextFromQuestionnaireInstoreName() {
        getTextFromCell.shouldBe(Condition.enabled);
        String name = getTextFromCell.getText();
        return name;
    }
    @Step("Get text from cell in a table for widget questionnaire name")
    public String getTextFromQuestionnaireWidgetName() {
        getTextFromCellWidget.shouldBe(Condition.enabled);
        String name = getTextFromCellWidget.getText();
        return name;
    }
    @Step("Get text from cell in a table for widget questionnaire name")
    public String getTextFromQuestionnaireMobileName() {
        getTextFromCellMobile.shouldBe(Condition.enabled);
        String name = getTextFromCellMobile.getText();
        return name;
    }
    @Step("Get text from cell in a table for robot questionnaire name")
    public String getTextFromQuestionnaireRobotName() {
        getTextFromCellRobot.shouldBe(Condition.enabled);
        String name = getTextFromCellRobot.getText();
        return name;
    }


}
