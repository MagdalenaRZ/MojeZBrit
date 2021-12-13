import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class LogowaniePk {
    @Test
    public void logowanie() {
        String driverPath = "C:\\Users\\BRITENET\\Desktop\\Selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ipko.pl/");
        driver.manage().window().maximize();

        driver.findElement(By.name("view./LOGIN/.data.login")).sendKeys("2");
        driver.findElement(By.cssSelector("#root > div._1a490 > div > div._1a490 > form > div._2zi49 > div > div > div._2-7LM._3XeUC > div._3O5ga > div > div._3lSno > div._5s1Zc > button")).click();

        driver.manage().timeouts().implicitlyWait(5, SECONDS);
        driver.findElement(By.name("view./LOGIN/.data.password")).sendKeys("O");
        driver.manage().timeouts().implicitlyWait(5, SECONDS);
        driver.findElement(By.cssSelector("#root > div._1a490 > div > div._1a490 > form > div._2zi49 > div > div > div._2-7LM._3XeUC > div._3O5ga > div > div._3lSno > div._5s1Zc > button")).click();

        driver.manage().timeouts().implicitlyWait(5, SECONDS);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/div[2]/div/div/div/div[3]/div/div[2]/div/div[2]/button")).click();

        //driver.findElement(By.className("_1__az")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[1]/ul/button[3]/span")).click();
        //driver.findElement(By.className("XggiN")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div[1]/div[2]/a")).click();
        //driver.findElement(By.className("_12aeN _12nER")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div")).click();
        //driver.findElement(By.className("link link-show x-show-details")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/div[1]/div/div[1]/div/a[1]")).click();

        WebElement Dsecure2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/div[2]/div/ul/li[2]/ul[2]/li[1]/span/p"));
        System.out.println(Dsecure2.getText());
        Assert.assertTrue("Mobilna autoryzacja 3D-Secure", true);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/div/div[2]/div/ul/li[2]/ul[2]/li[1]/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/div[2]/div[3]/div/button[1]/span")).click();


    }
}

