package C_third_task;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ThirdTaskITVDN {
    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void termination() {
        driver.close();
    }

    @Test
    public void test() {
        driver.get("https://itvdn.com/ru");
        assertThat(driver.getTitle(), equalTo("IT Курсы программирования онлайн - обучение программированию, видео уроки | ITVDN"));

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='home-search']"));        //input#home-search
        searchBox.sendKeys("Java");

        WebElement searchResult = driver.findElement(By.xpath("//a[@data-index='1']"));        //input[data-index='1']
        searchResult.click();
        assertThat(driver.getTitle(), equalTo("Специальность Java developer, обязанности Java разработчиков"));

        WebElement closeNotification = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[3]/span"));        //html > body > div:nth-of-type(3) > div:nth-of-type(1) > div > div:nth-of-type(3) > span
        closeNotification.click();

        WebElement btnFilledOrange = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/a"));        //html > body > div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(1) > a
        btnFilledOrange.click();
        assertThat(driver.getTitle(), equalTo("Регистрация учетной записи"));

        WebElement itvdniconVideoCatalogMenuItemIcon = driver.findElement(By.xpath("//span[@class='itvdnicon-video-catalog menu-item-icon']"));        //.itvdnicon-video-catalog menu-item-icon
        itvdniconVideoCatalogMenuItemIcon.click();
        assertThat(driver.getTitle(), equalTo("Курсы программирования: каталог курсов по сложности, стоимости и авторству"));

        WebElement courseJavaStarter = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div[1]/a[1]/div"));        //html > body > div:nth-of-type(3) > div > div:nth-of-type(3) > div:nth-of-type(2) > div:nth-of-type(1) > a:nth-of-type(1) > div
        courseJavaStarter.click();
        assertThat(driver.getTitle(), equalTo("Видео курс Java Starter, уроки Java для начинающих - онлайн обучение ITVDN"));

        WebElement playVideo = driver.findElement(By.xpath("//iframe[@src='https://player.vimeo.com/video/171111471?app_id=122963']"));        //iframe[src='https://player.vimeo.com/video/171111471?app_id=122963']
        playVideo.click();

        WebElement buttonStudyingWithTrainer = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/ul/li[3]/a"));        //html > body > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(1) > ul > li:nth-of-type(3) > a
        buttonStudyingWithTrainer.click();

        WebElement buttonJavaDeveloper = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/ul/li[3]/div/div[3]/ul/li[5]/a/div/span[2]"));        //html > body > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(1) > ul > li:nth-of-type(3) > div > div:nth-of-type(3) > ul > li:nth-of-type(5) > a > div > span:nth-of-type(2)
        buttonJavaDeveloper.click();
        assertThat(driver.getTitle(), equalTo("Java Developer - Online обучение на ITVDN"));

        WebElement buttonSignUp = driver.findElement(By.xpath("//button[@class='face__button btn-filled-orange consultation-open-btn consult-btn-js']"));        //.face__button btn-filled-orange consultation-open-btn consult-btn-js
        buttonSignUp.click();

        WebElement buttonSendRequest = driver.findElement(By.xpath("//*[@id='consultation-form']/div[3]/button"));        //#consultation-form > div:nth-of-type(3) > button
        buttonSendRequest.click();

        assertThat(driver.findElement(By.xpath("//*[@id='Name-error']")).getText(), equalTo("Пожалуйста, укажите Ваше имя"));
    }
}
