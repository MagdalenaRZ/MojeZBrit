package automationpractice;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class automatiompractice {

    @Test
    public static void main(String[] args) {

        String driverPath = "C:\\Users\\BRITENET\\Desktop\\Selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        ChromeDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        //find dress
        driver.findElement(By.name("search_query")).sendKeys("dress");
        WebElement dress = driver.findElementById("search_query_top");
        System.out.println(dress.getAttribute("value")); //pobranie tektu z inputa
        driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);

        //Sort by Price: Lowest first
        driver.findElement(By.id("selectProductSort")).click();
        driver.findElement(By.xpath("//*[@id=\"selectProductSort\"]/option[2]")).click();

        //More information
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")).click();
        System.out.println();

    }



    }

