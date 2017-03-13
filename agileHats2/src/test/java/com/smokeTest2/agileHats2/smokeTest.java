package com.smokeTest2.agileHats2;

import org.testng.annotations.Test;
import org.testng.reporters.jq.TimesPanel;
import org.testng.*;

import com.sun.org.apache.*;


import java.util.concurrent.TimeUnit;

import org.apache.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class smokeTest {

	private WebDriver driver;
	private String baseUrl;
	pageFactory searchPage;
	WebDriverWait wait;
//
	@BeforeTest
	public void beforeMethod() {

		System.setProperty("webdriver.gecko.driver", "/home/anita/Desktop/geckodriver/geckodriver");
		driver = new FirefoxDriver();
		searchPage = new pageFactory(driver);
		baseUrl = "http://agilehatsplay.elasticbeanstalk.com/login";
		wait = new WebDriverWait(driver, 30);
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test()
	public void f() throws InterruptedException {
		System.out.println("before email");
		searchPage.setEmail("anita79s@yahoo.com");
		System.out.println("after email");
		searchPage.setPassword("pass123");
		System.out.println("after password");
		searchPage.slickLoginButton();
		System.out.println("after login button and before link");
		
		
		System.out.println("after link click");
		searchPage.clickCreateTopicButton();
		
		System.out.println("after create button click");
		searchPage.setTopicName("Topic Name Maven Test");
		searchPage.setTopicDescription("This is topic description...");
		searchPage.submitCreateButton();

	}

}
