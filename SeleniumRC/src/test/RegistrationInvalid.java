package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class RegistrationInvalid {
	public Selenium selenium = null;
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.ebay.com/");
		selenium.start();
	}

	@Test
	public void testRegistrationInvalid() throws Exception {
		selenium.open("/");
		selenium.click("id=registerLink");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=firstname", "jasmine");
		selenium.type("id=lastname", "ganti");
		selenium.click("id=but_submit");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
