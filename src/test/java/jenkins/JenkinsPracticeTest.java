package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class JenkinsPracticeTest {
	@Test
	public void jenkinsPracticeTest() {
		Reporter.log("Hii jenkins", true);
		Reporter.log("Bye jenkins", true);
		Reporter.log("hooo", false);
	}

}
