import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project08122021 {

    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/v4/");
        driver.manage().window().maximize();

        System.out.println("Page title is :" +driver.getTitle());
        System.out.println("Current web URL is :" +driver.getCurrentUrl());

        WebElement username= driver.findElement(By.name("uid"));
        username.sendKeys("mngr366103");

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("sYrehup");

        WebElement submit= driver.findElement(By.name("btnLogin"));
        submit.click(); 
        /*driver.get("http://pestlinux7:9090/WIMS/");
        driver.manage().window().maximize();

        System.out.println("Page title is :" +driver.getTitle());
        System.out.println("Current web URL is :" +driver.getCurrentUrl());

        WebElement username= driver.findElement(By.id("userName"));
        username.sendKeys("admin");

        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("admin"); */

        /*WebElement submit= driver.findElement(By.("btnLogin"));
        submit.click();*/

        //driver.close();
    }
}
