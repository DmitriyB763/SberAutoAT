package ru.kinopoiskTest.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import ru.kinopoisk.Managers.DriverManager;
import ru.kinopoisk.pages.MainPage;
import ru.kinopoiskTest.runner.Run;


public class TestVisibleMainPageElements extends Run {
    //Перейти на https://sberauto.com/
    //Нажать на кнопку войти
    //Авторизоватся одним из 2 способов
    //Проверить что элементы MainPage  отображаются

    @Test
    public void visibleElementsMainPage(){
        DriverManager.getDriver().get("https://sberauto.com/");//открываю url страницы
        DriverManager.getDriver().findElement(By.xpath("//*[text()=\"Войти\"]")).click(); // нажимаю на кнопку войти
        DriverManager.getDriver().findElement(By.xpath("//*[data-test-id=\"authorization_section\"]")).isDisplayed();//проверяю что открылось окно авторизации
        DriverManager.getDriver().findElement(By.xpath("//input[placeholder=\"Ваш номер телефона\"]")).sendKeys("9277614164");//ввожу номер
        DriverManager.getDriver().findElement(By.xpath("//*[text()=\"Получить код по смс\"]")).click();//Нажимаю Получить код по смс
        //ввел код.Как это делать в боевых условиях?
        //на заготовленных тест. данных
        //1)заглушка
        //2)таблица в бд хрянящяя смс
        /*SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(sberAutoLabel.isDisplayed());
        //добавить остальные проверки на проверку видимости элементов mainPaige
        softAssert.assertAll();*/


    }

}
