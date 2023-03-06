package ru.kinopoisk.pages;

import org.openqa.selenium.By;
import ru.kinopoisk.Elements.Button;
import ru.kinopoisk.Elements.Label;
import ru.kinopoisk.Elements.ServiceElement;
import ru.kinopoisk.Managers.DriverManager;

import java.util.List;
import java.util.stream.Collectors;

public class MainPage {
    public  Label sberAutoLabel = new Label(By.xpath("//*[@data-testid=\"headerLogoIconDesktop\"]")); //переменная хранящяя лого сбер авто
    public Button autosubscriptionBtn = new Button(By.xpath("//*[text() = \"Автоподписка\"]"));// переменная хранящяя локатор по кнопке Автоподписка
    public  Button sellAutoBtn = new Button(By.xpath("//*[text() = \"Продать авто\"]"));
    public  Button chatsBtn = new Button(By.xpath("//*[text() = \"Чаты\"]"));
    public  Button favoritesBtn = new Button(By.xpath("//*[text() = \"Избранное\"]"));
    public  Button authorizationBtn = new Button(By.xpath("//*[text() = \"Войти\"]"));

    public  Button creditBtn = new Button(By.xpath("//*[text() = \"Кредит\"]"));
   // public  Button autoBtn = new Button(By.xpath("//*[text() = \"Авто\"]"));
    public  Button sellBtn = new Button(By.xpath("//*[text() = \"Продать\"]"));
    public  Button insuranceBtn = new Button(By.xpath("//*[text() = \"Страхование\"]"));

    public List<ServiceElement> getListServiceElement() {
        return DriverManager.getDriver()
                .findElements(By.xpath("//div[@data-testid=\"servicesSlider\"]/div/div[contains(@class,\"swiper-slide\")]"))
                .stream().map(ServiceElement::new).collect(Collectors.toList());
    }
}
