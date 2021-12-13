import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WyszukiwarkaGoogle3 { //DO POPRAWY

    public WebDriver driver;

    @Before
    public void setUp(){
        System.out.println("Przed klasą");
        String driverPath = "C:\\Users\\BRITENET\\Desktop\\Selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void googleOpenTest(){
        driver.get("https://www.google.com/");

        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//*[@id=\"introAgreeButton\"]/span/span")).click();

        WebElement serchInput = driver.findElement(By.name("q"));
        serchInput.sendKeys("Selenium");
        serchInput.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//span[text()='Selenium WebDriver']")).click();
        System.out.println(driver.getTitle());
        Assert.assertEquals("SeleniumHQ Browser Automation", driver.getTitle());

    }

    /*
    @After
    public void tearDown(){
        System.out.println("Wykonuję się po klasie");
        driver.quit();
    }*/
}
