package ru.kinopoisk.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextField extends AbstractElement {


    public TextField(By by) {
        super(by);
    }

    public TextField(WebElement we) {
        super(we);
    }

    public String getText(){
        return we.getText();
    }
}
