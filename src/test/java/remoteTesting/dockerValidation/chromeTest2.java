package remoteTesting.dockerValidation;

import java.net.MalformedURLException;
import java.net.URL;
import com.docker.Base.BaseTest;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class chromeTest2 extends BaseTest {

@Test
public void test2() throws MalformedURLException
{
		// TODO Auto-generated method stub
	    DesiredCapabilities cap=new DesiredCapabilities();
	    cap.setBrowserName("firefox");
		URL u=new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(u,cap);
		driver.get("http://gmail.com");
		System.out.println(driver.getTitle());
	    Assert.assertEquals(driver.getTitle(),"Gmail");
		
	}

}
