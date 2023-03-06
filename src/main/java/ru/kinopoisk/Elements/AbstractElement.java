package ru.kinopoisk.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.kinopoisk.Managers.DriverManager;

public abstract class AbstractElement {

    protected WebElement we;

    public AbstractElement(By by) {
        this.we = DriverManager.getDriver().findElement(by);
    }

    public AbstractElement(WebElement we) {
        this.we = we;
    }

    public Boolean isDisplayed(){  //метод ищущий элемент по передаваему ему локатору (через переменную  by)
        return we.isDisplayed();
    }

    public void click(){
        we.isDisplayed(); //метод кликающий по элементу (любому)
    }




}
