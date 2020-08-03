package A_first_task;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ChromeSample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");

//        ChromeOptions options = new ChromeOptions();
//        options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
//        options.addArguments("--headless");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com/xhtml");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("pickles");
        searchBox.submit();

        driver.navigate().to("https://dictionary.cambridge.org");

        WebElement cambridgeSearchBox = driver.findElement(By.className("cdo-search-input"));
        cambridgeSearchBox.sendKeys("carrot");
        cambridgeSearchBox.submit();

        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.open()");

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("http://mmtr.ru/");
        driver.close();
        driver.switchTo().window(tabs.get(0));

        driver.quit();
    }
}
