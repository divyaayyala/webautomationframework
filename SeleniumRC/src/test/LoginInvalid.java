package test;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginInvalid {
	public Selenium selenium=null;
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.ebay.com/"); 
		selenium.start();
	}

	@Test
	public void testLoginInvalid() throws Exception {
		selenium.open("/");
		selenium.click("link=Sign in");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=userid", "divyaayyala");
		selenium.click("id=but_sgnBt");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
