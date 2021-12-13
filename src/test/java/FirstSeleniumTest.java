import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FirstSeleniumTest {

    @Test
    public void googleOpenTest () {
        String driverPath = "C:\\Users\\BRITENET\\Desktop\\Selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

      /*  Dimension dimension = new Dimension(1200, 800);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(dimension);
      //  driver.manage().window().maximize();
        driver.get("//C://Users//BRITENET//Downloads//Test.html");
        driver.findElement(By.id("newPage")).click();
        driver.quit(); //zamyka wszystkie okna
      //  driver.close(); // zamyka okno pierwotne, na którym jest obecnie focus (driver)*/

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("//C://Users//BRITENET//Downloads//Test.html");
        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        WebElement firstNameInput = driver.findElement(By.name("fname"));
        WebElement w3SchoolLink = driver.findElement(By.linkText("Visit W3Schools.com!")); //musi być cały tekst kompletny, inaczej nie znajdzie
        WebElement googleLink = driver.findElement(By.partialLinkText("Weird")); //część linku może być
        WebElement topSecretParagraf = driver.findElement(By.className("topSecret"));
        WebElement firstInput = driver.findElement(By.tagName("input"));

        WebElement firstLink = driver.findElement(By.tagName("a"));
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Znaleziono " + links.size() + " linki");
        if(links.size()>0) {
            System.out.println("linki istnieją");
        } else {
            System.out.println("Linki nie istnieją");
        }

        WebElement clickOnMeCss = driver.findElement(By.cssSelector("#clickOnMe"));
        WebElement clickOnMeXpath = driver.findElement(By.xpath("//*[@id=\"clickOnMe\"]"));

      /*  //CSS selektory
        WebElement clickOnMeCssButton = driver.findElement(By.cssSelector("#clickOnMe"));
        WebElement links = driver.findElement(By.cssSelector("a"));
        WebElement topSecret = driver.findElement(By.cssSelector(".topSecret"));
        WebElement tdFirstChild = driver.findElement(By.cssSelector("td:first-child"));

        //XPath
        WebElement clickOnMeXpathButton = driver.findElement(By.xpath("/html/body/button"));
        WebElement clickOnMeXpathButton2 = driver.findElement(By.xpath("//button"));
        WebElement linksXpath = driver.findElement(By.xpath("//a"));
        WebElement topSecretXpath = driver.findElement(By.xpath("//p[@class='topSecret']"));
        WebElement topSecretXpath2 = driver.findElement(By.xpath("//*[@class='topSecret']"));
        WebElement linkText = driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));
        */



    }

}
