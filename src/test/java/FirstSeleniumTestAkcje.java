import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSeleniumTestAkcje {

    @Test
    public void googleOpenTest() throws InterruptedException {
        String driverPath = "C:\\Users\\BRITENET\\Desktop\\Selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("//C://Users//BRITENET//Downloads//Test.html");
        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        clickOnMeButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        //alert.dismiss();
      /*  WebElement firstNameInput = driver.findElement(By.id("fname"));
        firstNameInput.sendKeys("Magda");
        firstNameInput.clear();
        firstNameInput.sendKeys("Tomek");*/

        Select carSelect = new Select(driver.findElement(By.tagName("select")));
       // carSelect.selectByIndex(2);
       // carSelect.deselectByVisibleText("Mercedes");
        carSelect.selectByValue("audi");

        WebElement firstNameInput = driver.findElement(By.id("fname"));
        firstNameInput.sendKeys("Tomek");
        System.out.println("Wartość to " + firstNameInput.getText()); //tu nie zadziała
        System.out.println("Wartość to " + firstNameInput.getAttribute("value")); //dla Inputa ta metoda do pobrania tekstu z inputa
        WebElement label = driver.findElement(By.tagName("label"));
        System.out.println("Wartość dla label to " + label.getText()); //pobiera tekst ze wszystkiego z wyjątkiem z inputa

        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        //Thread.sleep(5000);
        checkbox.click();
        WebElement radioButton = driver.findElement(By.xpath("//input[@value='female']"));
        radioButton.click();


        // driver.quit();


    }
}
