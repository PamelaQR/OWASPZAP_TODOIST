package testcases;

import io.qameta.allure.Issue;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import pageObject.InboxPage;
import pageObject.LoginPage;
import pageObject.MainPage;
import session.Sesion;

public class TodoistTest {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    InboxPage inboxPage = new InboxPage();

    @BeforeEach
    public void before(){

        Sesion.getInstance().getDriver().get("https://todoist.com/");
    }


    @DisplayName("***************VERIFICA LA EJECUCION DE TODOIST******************")
    @Description("TEST PARA VERIFICAR QUE LA APLICACION PERMITA LOGUEARSE CON USUARIO Y CONTRASEÑA ....")
    @Link("jira.com/10102")
    @Issue("Bug001")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void verifyProjectIsLogged(){

        mainPage.loginButton.click();
        loginPage.emailTextBox.setValue("inf_113_pcqr@hotmail.com");
        loginPage.passwordTextBox.setValue("1234567P*");
        loginPage.loginButton.click();
        inboxPage.myTaskLabel.click();

        Assertions.assertEquals("Bandeja de entrada",Sesion.getInstance().getDriver().findElement(inboxPage.titletaskText).getText());

    }
   @AfterEach
    public void after(){
        Sesion.getInstance().closeSesion();
    }

}
