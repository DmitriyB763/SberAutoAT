package ru.kinopoiskTest.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.kinopoisk.Managers.DriverManager;
import static ru.kinopoisk.Managers.DriverManager.*;

import java.util.concurrent.TimeUnit;

public class Run {

    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        System.out.println("setUp");
        System.setProperty("webdriver.chrome.driver", "C:/Cdriver/chromedriver.exe"); //инициализация хромдрайвера
        setDriver(new ChromeDriver());
        getDriver().manage().window().maximize();//чтобы хром открывался в макс. разрешении
        getDriver().manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);// неявное ожидание , ожидание прогрузки элментов на страницах

    }

    @AfterSuite
    public static void stop(){
        if (getDriver() != null){ //проверка на то что драйвер не пустой (есть ссылка на объект))
            getDriver().quit();
        }
    }

}
