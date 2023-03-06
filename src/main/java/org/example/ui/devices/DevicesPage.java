package org.example.ui.devices;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

public class DevicesPage {
    @FindBy(how = How.XPATH, using = "//span[text()='Add Devices']")
    private SelenideElement addDeviceButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div[1]/table/tbody/tr[1]/td[1]/div")
    private SelenideElement firstCheckboxDevices;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div[1]/table/tbody/tr[1]/td[2]/div")
    private SelenideElement secondCheckboxDevices;
    @FindBy(how = How.CLASS_NAME, using = "pi pi-filter p-button-icon p-button-icon-left")
    private SelenideElement filterButton;
    @FindBy(how = How.XPATH, using = "//span[@class='p-dropdown-label p-inputtext']")
    private SelenideElement chooseColumnFilter;
    @FindBy(how = How.XPATH, using = "//li[@class='p-dropdown-item'][1]")
    private SelenideElement firstElementDropDownChooseColumn;
    @FindBy(how = How.XPATH, using = "[class='p-dropdown p-component p-inputwrapper']")
    private SelenideElement filterType;
    @FindBy(how = How.CSS, using = "[aria-label=Contains]")
    private SelenideElement containsType;
    @FindBy(how = How.XPATH, using = "//label[text()='Enter value']")
    private SelenideElement enterValue;
    @FindBy(how = How.CLASS_NAME, using = "p-dialog-header-close-icon pi pi-times")
    private SelenideElement closeIconWindowFilter;
    @FindBy(how = How.CLASS_NAME, using = "p-button-medium-large p-button-outlined p-mr-2 p-button p-component")
    private SelenideElement cancelFilterButton;
    @FindBy(how = How.CLASS_NAME, using = "p-button-medium-large p-button p-component")
    private SelenideElement applyFilterButton;
    @FindBy(how = How.CLASS_NAME, using = "pi pi-chevron-down")
    private SelenideElement actionsDropdown;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]/div/div[2]/div[3]/div")
    private SelenideElement windowChooseQuestionnaire;
    @FindBy(how = How.XPATH, using = "//span[@class='p-menuitem-text'][text()='Choose Widget questionnaire']")
    private SelenideElement chooseWidgetQuestionnaire;
    @FindBy(how = How.XPATH, using = "//span[@class='p-menuitem-text'][text()='Choose In-store questionnaire']")
    private SelenideElement chooseInstoreQuestionnaire;
    @FindBy(how = How.XPATH, using = "//span[@class='p-menuitem-text'][text()='Choose Mobile questionnaire']")
    private SelenideElement chooseMobileQuestionnaire;
    @FindBy(how = How.XPATH, using = "//span[@class='p-menuitem-text'][text()='Choose Robot questionnaire']")
    private SelenideElement chooseRobotQuestionnaire;
    @FindBy(how = How.XPATH, using = "//span[@class='p-menuitem-text'][text()='Choose Reward Type']")
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
