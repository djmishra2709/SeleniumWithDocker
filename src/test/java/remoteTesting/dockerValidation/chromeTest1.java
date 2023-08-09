package remoteTesting.dockerValidation;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


import com.docker.Base.BaseTest;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class chromeTest1 extends BaseTest {

@Test
public void test1() throws MalformedURLException
{
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setBrowserName("chrome");
		URL url =new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(url,cap);
		driver.get("http://google.com");
	    Assert.assertEquals(driver.getTitle(),"Google");
		
	}

}
