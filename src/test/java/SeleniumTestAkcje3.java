import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SeleniumTestAkcje3 {

    @Test
    public void googleOpenTest() throws InterruptedException {
        String driverPath = "C:\\Users\\BRITENET\\Desktop\\Selenium\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("//C://Users//BRITENET//Desktop//Kurs Selenium Udemy//Test.html");

        //Przełączanie między oknami przeglądarki
        WebElement newPageButton = driver.findElement(By.id("newPage"));
        String  currentWindowName = driver.getWindowHandle();
        newPageButton.click();
        switchToNewWindow(driver, currentWindowName);
        System.out.println("Tytuł to: " + driver.getTitle());
        System.out.println("Obecny URL to: " + driver.getCurrentUrl());
        driver.switchTo().window(currentWindowName);    //Powrót do pierwotnego okna przeglądarki
        driver.findElement(By.name("username")).sendKeys(" Mouse");
    }
    private void  switchToNewWindow(WebDriver driver, String currentWindowName) {
        System.out.println("Wartość dla obecnego okna to " + currentWindowName);
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Ilość okien przeglądarki " + windows.size());
        for(String window : windows) {
            if (!window.equals(currentWindowName)) {
                driver.switchTo().window(window);
            }
        }
    }


}