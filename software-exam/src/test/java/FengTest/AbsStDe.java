package FengTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class AbsStDe {
    private static final int WaitTime=7;

    static WebDriver wdriver;

    protected static MainPage mainpage;

    static
    {
        WebDriverManager.chromedriver().setup();
       wdriver=new ChromeDriver();
        wdriver.manage().timeouts().implicitlyWait(WaitTime, TimeUnit.SECONDS);
        mainpage=new MainPage(wdriver);
    }
}
