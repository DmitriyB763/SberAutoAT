package ru.kinopoiskTest.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.kinopoisk.Managers.DriverManager;
import ru.kinopoisk.pages.MainPage;
import ru.kinopoiskTest.runner.Run;

public class TestSidebar extends Run {

    @Test
    public void checkElementsOnSidebar(){
        DriverManager.getDriver().get("https://sberauto.com/");
        MainPage mp = new MainPage();
        DriverManager.getDriver().findElement(By.xpath("//*[@data-testid=\"headerLogoIconDesktop\"]")).isDisplayed(); //поиск лейбла

    }


}
