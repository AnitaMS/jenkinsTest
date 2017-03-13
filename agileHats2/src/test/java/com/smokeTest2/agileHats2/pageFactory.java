package com.smokeTest2.agileHats2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageFactory {

	WebDriver driver;

	@FindBy(id = "email")
	WebElement emailField;

	@FindBy(id = "password")
	WebElement passwordField;

	@FindBy(className = "buttons")
	WebElement loginButton;

	// @FindBy(xpath=".//*[@id='bs-example-navbar-collapse-1']/ul/li[2]/a")
    //@FindBy(xpath=".//a[@href='/topics']//parent::li")
	@FindBy(linkText = ("TOPICS"))
	WebElement topicsLink;

	//@FindBy(xpath = "html/body/div[1]/div[1]/a")
	//@FindBy(xpath="//*[text()[contains(.,'Create Topic')]]")
	 @FindBy(css="a[href*='/topics/new']")
	// @FindBy(css=".btn.btn-green.pull-right.heading-button")
	// @FindBy(xpath="//a[@href='/topics/new']")
	WebElement createTopicButton;

	@FindBy(xpath = "//input[@placeholder='Topic Name']")
	WebElement topicName;

	@FindBy(css = "#description")
	WebElement description;

	@FindBy(css = ".btn.btn-green.pull-right")
	WebElement createButton;

	public pageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setEmail(String email) {
		emailField.sendKeys(email);
	}

	public void setPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void slickLoginButton() {
		loginButton.submit();
	}

	public void clickTopicLink() {
		topicsLink.click();
	}

	public void clickCreateTopicButton() {
		createTopicButton.click();
	}

	public void setTopicName(String name) {
		topicName.sendKeys(name);
	}

	public void setTopicDescription(String desc) {
		description.sendKeys(desc);
	}

	public void submitCreateButton() {
		createButton.submit();
	}

}
