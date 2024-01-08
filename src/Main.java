import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    WebDriver driver;

    public void setBrowser(){
        System.setProperty("webdriver.chrome.driver","/Users/nastena/Downloads/chromedriver-mac-arm64/chromedriver");
        driver= new ChromeDriver();

    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.setBrowser();
        obj.getTitle();
        obj.setBrowser();
        obj.loginForm();



        }

    public void getTitle(){

        driver.navigate().to("https://youtube.com/");
        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "YouTube";
        System.out.println("Actual Page Title: " + actualPageTitle);
        if (actualPageTitle.equals(expectedPageTitle)) {
            System.out.println("Verification Passed: Page title is as expected.");
        } else {
            System.out.println("Verification Failed: Page title is not as expected.");
        }
        driver.quit();
    }
    public void loginForm(){
        driver.navigate().to("https://demo.applitools.com/");
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("testuser");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("testpass");
        WebElement loginButton = driver.findElement(By.id("log-in"));
        loginButton.click();

        WebElement icons = driver.findElement(By.xpath("//div[@class ='os-icon os-icon-layout']"));
        if(icons.isDisplayed()){
            System.out.println("Login Successful!");
        } else {
            System.out.println("Login Failed!");
        }
        driver.quit();

        }



    }

