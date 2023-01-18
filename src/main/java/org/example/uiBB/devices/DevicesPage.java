package org.example.uiBB.devices;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DevicesPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//button[1]/span[2][text()='Add Devices']")
    private SelenideElement addDeviceButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div[1]/table/tbody/tr[1]/td[1]/div")
    private SelenideElement firstCheckboxDevices;
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
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div[@role='dialog']//div/button[1]")
    private SelenideElement closeIconWindowFilter;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div[@role='dialog']//div/button[2]")
    private SelenideElement cancelFilterButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div[@role='dialog']//div/button[3]")
    private SelenideElement applyFilterButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"devices-page\"]//div/button/i[@class='pi pi-chevron-down']")
    private SelenideElement actionsDropdown;
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
    private SelenideElement autotestInstoreQuestionnaireChoose;


}
