import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotInstagram {

        @Test
        public void Instagram()

        {

                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();

                driver.get("https://www.instagram.com/");
                driver.manage().window().maximize();

                System.out.println("Page title is :" + driver.getTitle());
                System.out.println("Current web URL is :" + driver.getCurrentUrl());

                String expected = "Instagram";
                String actual = driver.getTitle();
                Assert.assertEquals( "",expected, actual);

                TakesScreenshot ss = (TakesScreenshot) driver;

                File srcFile = ss.getScreenshotAs(OutputType.FILE);
                String timeStamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());

                String fileName = "IMG" +timeStamp+ ".jpg";

                try {
                        FileUtils.copyFile(srcFile,new File("D:\\Seleniumworkshop\\Day4\\"+fileName));
                } catch (IOException e) {
                        e.printStackTrace();
                }

        }
}