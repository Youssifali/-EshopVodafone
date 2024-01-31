package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import io.cucumber.java.*;

public class HooksFile {
    public static WebDriver driver;
    @Before
    public void startDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://eshop.vodafone.com.eg/ar/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        //driver.findElement(By.xpath("//button[contains(@id,'onetrust-accept-btn-handler')]")).click();
    }

    @After
    public void stopDriver(){
        driver.close();
    }
}
