package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class RegistrationValid {
	public Selenium selenium=null;
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.ebay.com/");
		selenium.start();
	}

	@Test
	public void testRegistrationValid() throws Exception {
		selenium.open("/");
		selenium.click("id=registerLink");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=firstname", "jasmine");
		selenium.type("id=lastname", "ganti");
		selenium.type("id=email", "jasmine.ganti@gmail.com");
		selenium.type("id=userid", "jasmineganti");
		selenium.type("id=PASSWORD", "Changeme");
		selenium.type("id=rpass", "Changeme");
		selenium.click("id=but_submit");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
