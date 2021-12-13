import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.name;
import static org.openqa.selenium.Keys.ENTER;

public class WyslijWiadomosc {

    @Test

    public void logowanie() {
        String driverPath = "C:\\Users\\BRITENET\\Desktop\\Selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get("https://profil.wp.pl/login/login.html");
        driver.manage().window().maximize();

        By login = name("login_username");
        WebElement loginInput = driver.findElement(login);
        driver.findElement(name("login_username")).sendKeys("a@wp.pl");
        //loginInput.sendKeys(Keys.ENTER);

        WebElement passwordInput = driver.findElement(name("password"));
        driver.findElement(name("password")).sendKeys("Szy");
        passwordInput.sendKeys(Keys.ENTER);

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#main > nh-app-view > div > div > div > div.app-main.flex-max > div > div > div > div > nh-top-action-bar > div:nth-child(2) > div.topActionBar-left.flex.grow-1.shrink-0 > button:nth-child(2)")));

        WebElement napiszWiadomosc = driver.findElement(By.cssSelector("#main > nh-app-view > div > div > div > div.app-main.flex-max > div > div > div > div > nh-top-action-bar > div:nth-child(2) > div.topActionBar-left.flex.grow-1.shrink-0 > button:nth-child(2)"));
        //driver.findElement(By.linkText("draft")).click();
        napiszWiadomosc.click();

        //driver.manage().timeouts().implicitlyWait(5, SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(By.name("subject")));

        WebElement temat = driver.findElement(By.name("subject"));
        temat.sendKeys("test");

        /*WebElement wyslijDo = driver.findElement(By.className("sc-gGCbJM bXAcky"));
        wyslijDo.sendKeys("m@gmail.com");*/

        By inputLocator = By.tagName("input");
        WebElement input = driver.findElement(inputLocator);
        input.sendKeys("m@gmail.com");
        input.sendKeys(ENTER);

        WebElement trescWiadomosci = driver.findElement(By.xpath("//*[@id=\"draftComponent\"]/div[1]/div/div[2]/div[2]/div[1]"));
        trescWiadomosci.sendKeys("Tresc wiadomosci testowej");


        //driver.quit();


        // driver.findElement(By.xpath("//*[@id=\"folder-1\"]/div[2]")).click();

        // driver.findElement(By.xpath("//*[@id=\"topbar\"]/div/div[1]/button")).click();
    }

}
