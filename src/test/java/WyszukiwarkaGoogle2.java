import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WyszukiwarkaGoogle2 {
   private WebDriver driver;

    @Test
    public void googleOpenTest(){
        String driverPath = "C:\\Users\\BRITENET\\Desktop\\Selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//*[@id=\"introAgreeButton\"]/span/span")).click();

        WebElement serchInput = driver.findElement(By.name("q"));
        serchInput.sendKeys("Selenium");
        serchInput.sendKeys(Keys.ENTER);
        WebElement seleniumPageLink = driver.findElement(By.xpath("//span[text()='Selenium WebDriver']"));
        seleniumPageLink.click();

        String expectedTitle = "SeleniumHQ Browser Automation";
        System.out.println(driver.getTitle());

        Assert.assertEquals(expectedTitle, driver.getTitle());
        //Assert.assertNotEquals("Test1", "Test2");
        Assert.assertTrue(expectedTitle.equals(driver.getTitle()));
        Assert.assertTrue("Tytuły nie są równe", driver.getTitle().equals("SeleniumHQ Browser Automation"));

        driver.quit();
    }

   /* @AfterClass
    public void tearDown(){
        System.out.println("Wykonuję się po klasie");

    }*/
}
