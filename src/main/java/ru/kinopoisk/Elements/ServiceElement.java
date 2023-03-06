package ru.kinopoisk.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ServiceElement extends AbstractElement {



    public ServiceElement(By by) {
        super(by);
    }

    public ServiceElement(WebElement we) {
        super(we);
    }

    public TextField getServiceTitle(){
       return new TextField(we.findElement(By.xpath(".//*[@data-testid=\"serviceTitle\"]")));
    }

    public TextField getServiceText(){
        return new TextField(we.findElement(By.xpath(".//*[@data-testid=\"serviceText\"]")));
    }
}
