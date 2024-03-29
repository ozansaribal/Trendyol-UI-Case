package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import users.User;

public class LoginPage extends BasePage{
    private By emailBy = By.id("login-email");
    private By passwordBy = By.id("login-password-input");
    private By submitBy = By.className("submit");

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage login(User user) {
        sendKeys(emailBy, user.getEmail());
        sendKeys(passwordBy, user.getPassword());
        click(submitBy, 5);

        HomePage homePage = new HomePage(webDriver);
        homePage.waitForLoad();

        return homePage;
    }
}
