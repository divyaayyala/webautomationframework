package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class SeachForValid {
	public Selenium selenium=null;
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.ebay.com/");
		selenium.start();
	}

	@Test
	public void testSeachForValid() throws Exception {
		selenium.open("/");
		selenium.click("id=gh-btn");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=gh-ac", "ipad 3");
		selenium.click("id=gh-btn");
		selenium.waitForPageToLoad("30000");
		verifyTrue(selenium.isTextPresent("iPad/Tablet/eBook Accessories"));
	}

	private void verifyTrue(boolean textPresent) {
		
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
