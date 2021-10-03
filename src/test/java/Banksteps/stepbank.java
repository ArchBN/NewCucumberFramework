package Banksteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepbank {
    WebDriver driver;

    @Given("Open DemoGuru URL and launch the application")
    public void open_demo_guru_url_and_launch_the_application() {
       System.setProperty("webdriver.chrome.driver", "C://Users//archana//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl = "http://www.demo.guru99.com/V4/";
        driver.get(baseUrl);
    }
    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersUsername(String username,String password) {
        {
            driver.findElement(By.name("uid")).clear();
            driver.findElement(By.name("uid")).sendKeys(username);
            driver.findElement(By.name("password")).clear();
            driver.findElement(By.name("password")).sendKeys(password);

        }
    }
    @Then("^Submit the credentials$")
    public void submitTheCredentials() {
        driver.findElement(By.name("btnLogin")).click();
        driver.quit();
    }


}


