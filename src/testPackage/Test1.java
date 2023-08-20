// 1. Open google.com and check the title of web page and redirect to google.co.in
package testPackage;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver","C:/Program Files/SeleniumGecko/geckodriver.exe");
				FirefoxDriver driver = new FirefoxDriver(); //   ChromeDriver driver=new ChromeDriver();
				driver.get("http://www.google.com");
				String title = driver.getTitle();
				if(title.equals("Google"))
				{
					System.out.println("Test is Passed - Title is Google");
				}
				else
				{
					System.out.println("Test is Failed - Title is not Google, Expected Title is"+title);
				}
				
				Thread.sleep(2500);
				
				driver.navigate().to("http://www.google.co.in");
				
				String url = driver.getCurrentUrl();
				if(url.contains("google.co.in"))
				{
					System.out.println("Test is Passed - URL contains co.in");
				}
				else
				{
					System.out.println("Test is Falied - URL do not contain co.in"+url);
				}
				
				driver.quit();

	}

}
