package com.allinmd.po.webdriver.cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.allinmd.po.webdriver.page.RegWebElements;
import com.allinmd.util.DriverList;
import com.allinmd.util.Utils;
import com.allinmd.util.RandomStr;
import com.runtime.listener.Assertion;

/**
 * 手机注册-跳过认证
 * @author sun
 *
 */
@Listeners({com.runtime.listener.AssertionListener.class})
public class RegPhoneCase {
	private static WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = DriverList.webDriverRun();
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		PageFactory.initElements(driver, RegWebElements.class);
	}
	
	@AfterClass  
	public void tearDown() {	
		driver.quit();
		Utils.sleep(2);
		Utils.setInputMethod();
	} 
	
	/**
	 *  验证"立即注册"按钮是否存在以确定页面正常跳转
	 */
	@Test (priority = 1)
	public void assertRegButton() {
		Assertion.assertEquals(true, RegWebElements.regBtnIsExist(), "\"立即注册\"按钮未找到，页面不符或元素改变，请检查！");
    }
	
	/**
	 * 注册手机账号
	 */
	@Test (priority = 2)
	@Parameters({"GLOBAL_PASSWORD"})
	public void regPhone(String GLOBAL_PASSWORD) {
		String username = RandomStr.randomPhone();
		
		RegWebElements.regPhoneFlow(username, GLOBAL_PASSWORD);
	}
	
}