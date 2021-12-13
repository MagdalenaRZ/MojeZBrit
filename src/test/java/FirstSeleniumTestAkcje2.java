import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTestAkcje2 {

    @Test
    public void googleOpenTest() throws InterruptedException {
        String driverPath = "C:\\Users\\BRITENET\\Desktop\\Selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
       // String driverPath = "C:\\Users\\BRITENET\\Downloads\\chromedriver_win32 (2).zip";
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("//C://Users//BRITENET//Desktop//Kurs Selenium Udemy//Test.html");

      /*  WebElement paragraph = driver.findElement(By.className("topSecret"));
        System.out.println("Mój text to " + paragraph.getText());
        System.out.println("Mój text to " + paragraph.getAttribute("value"));
        System.out.println("Mój text to: " + paragraph.getAttribute("textContent")); //tekst ukryty */

       /* WebElement smileImage = driver.findElement(By.id("smileImage"));
        System.out.println(smileImage.getAttribute("naturalHeight"));
        System.out.println(smileImage.getSize().getHeight()); */

        //input wyszarzony - nie da się wpisać - jak sprawdzić
       /* WebElement firstNameInput = driver.findElement(By.name("fname"));
        if(firstNameInput.isEnabled()) {
            System.out.println("Element nie jest zablokowany ");
        } else {
            System.out.println("Element jest zablokowany");
        }
        firstNameInput.sendKeys("Magda"); */

        //Sprawdzanie czy checkbox został zaznaczony
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        if(checkbox.isSelected()) {
            System.out.println("Checkbox jest zaznaczony");
            checkbox.click();
            System.out.println("Checkbox został odznaczony");
        } else {
            System.out.println("Checkbox nie jest zaznaczony");
        }

        //Sprawdzanie czy element jest wyświetlony na stronie
        WebElement topSecretElement = driver.findElement(By.className("topSecret"));
        if(topSecretElement.isDisplayed()) {
            System.out.println("Element jest widoczny");
            System.out.println(topSecretElement.getText());
        } else {
            System.out.println("Element nie jest widoczny");
            System.out.println(topSecretElement.getAttribute("textContent"));
        }
        //Sprawdzanie czy element istnieje na stronie
        checkIfElementExist(By.tagName("a"), driver);
        checkIfElementExist(By.tagName("assaas"), driver);

        checkIfElemnetExist(driver, By.tagName("a"));
        checkIfElemnetExist(driver, By.tagName("asaas"));
    }
        //Sprawdzanie czy element istnieje na stronie
    //Pierwsza metoda
    public boolean checkIfElementExist(By locator, WebDriver driver) {
        if (driver.findElements(locator).size()>0) {
            System.out.println("Element istnieje na stronie");
            return  true;
        }
        System.out.println("Brak elementu na stronie");
        return false;
    }
    //Druga metoda
    public void checkIfElemnetExist(WebDriver driver,By locator) {
        try {
            driver.findElement(locator);
            System.out.println("Element istnieje na stronie");
        } catch (NoSuchElementException exc) {
            System.out.println("Element nie istnieje");
        }
    }
}