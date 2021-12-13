import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWyszukiwarkiGoogle {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.out.println("Wykonuje się przed klasą");
        String driverPath = "C:\\Users\\BRITENET\\Desktop\\Selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void googleOpenTest()  {
        driver.get("http://www.google.com");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//*[@id=\"introAgreeButton\"]/span/span")).click();
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium");
       // WebElement searchButton = driver.findElement(By.name("btnK"));
        searchInput.sendKeys(Keys.ENTER);
        driver.findElement(By.linkText("Selenium WebDriver")).click();
       // WebElement seleniumPageLink = driver.findElement(By.linkText("Selenium WebDriver"));
        //seleniumPageLink.click();

       // String expectedTitle = "Selenium (software) - Wikipedia";
       // System.out.println(driver.getTitle());

       // Assert.assertEquals(driver.getTitle(), expectedTitle);
       // Assert.assertNotEquals("Test1", "Test2");
       // Assert.assertTrue(expectedTitle.equals(driver.getTitle()));
       // Assert.assertTrue("Tytuły nie są równe", driver.getTitle().equals("Zła nazwa"));

    }

   /* @AfterClass
    public void tearDown() {
        System.out.println("Wykonuję się po klasie");
        driver.quit();

    }*/
}

