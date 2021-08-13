package pageObject;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginPage {

    public TextBox emailTextBox = new TextBox(By.id("email"));
    public TextBox passwordTextBox = new TextBox(By.id("password"));
    public Button loginButton = new Button(By.xpath("//*[@id='login_form']/button"));
}
