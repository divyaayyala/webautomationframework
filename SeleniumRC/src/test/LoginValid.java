package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class LoginValid {
	public Selenium selenium = null;
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.ebay.com/");
		selenium.start();
	}

	@Test
	public void testLoginValid() throws Exception {
		selenium.open("/");
		selenium.click("link=Sign in");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=userid", "divyaayyala");
		selenium.type("id=pass", "Changeme");
		selenium.click("id=but_sgnBt");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
