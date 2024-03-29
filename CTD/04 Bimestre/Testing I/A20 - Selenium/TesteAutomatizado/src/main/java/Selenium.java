import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        WebElement campoUsuario = driver.findElement(By.id("user-name"));
        campoUsuario.sendKeys("standard_user");

        WebElement campoSenha = driver.findElement(By.id("password"));
        campoSenha.sendKeys("secret_sauce");

        WebElement btnLogin = driver.findElement(By.id("login-button"));
        btnLogin.click();

        WebElement btnBurguerMenu = driver.findElement(By.id("react-burger-menu-btn"));
        btnBurguerMenu.click();

        WebElement aboutSidebarLink = driver.findElement(By.id("about_sidebar_link"));
        aboutSidebarLink.click();

    }
}

