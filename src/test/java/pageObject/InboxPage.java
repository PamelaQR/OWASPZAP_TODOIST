package pageObject;

import controlSelenium.Label;
import org.openqa.selenium.By;

public class InboxPage {

    public Label myTaskLabel = new Label(By.xpath("//*[@id='filter_inbox']/span[2]"));
    public By titletaskText = By.xpath("//*[@id='editor']/div[2]/header/div/h1/span");



}
