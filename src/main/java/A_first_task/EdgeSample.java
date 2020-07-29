package A_first_task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;

public class EdgeSample {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

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
        driver.close();
        driver.switchTo().window(tabs.get(0));

        driver.quit();
    }
}
