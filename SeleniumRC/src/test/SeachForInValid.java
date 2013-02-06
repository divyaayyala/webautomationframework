package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class SeachForInValid {
	public Selenium selenium = null;
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.ebay.com/");
		selenium.start();
	}

	@Test
	public void testSeachForInValid() throws Exception {
		selenium.open("/");
		selenium.click("id=gh-btn");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=gh-ac", "diwali crackers");
		selenium.click("id=gh-btn");
		selenium.waitForPageToLoad("30000");
		verifyTrue(selenium.isTextPresent("0 results"));
	}

	private void verifyTrue(boolean textPresent) {
		// TODO Auto-generated method stub
		
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
