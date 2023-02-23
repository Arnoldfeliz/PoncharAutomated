import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Primary
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\alnorld.feliz\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // -------------------- LOGIN MI LLAVE ALLEN ----------------------- //

        driver.get("https://millaveallen.ikeasi.com/#/landing");
        Thread.sleep(5000);
        System.out.println("--> Login to mi llave allen...");

        WebElement usernameFld = driver.findElement(By.xpath("//input[@id='name']"));
        usernameFld.sendKeys("wylda.rodriguez");

        WebElement passwordFld = driver.findElement(By.xpath("(//input['id=password'])[2]"));
        passwordFld.sendKeys("GiGi..Popo*20");
        WebElement verifyBtn = driver.findElement(By.xpath("(//span['type=checkbox'])[7]"));
        verifyBtn.click();
        Thread.sleep(2000);

        WebElement loginBtn = driver.findElement(By.xpath("(//button['@type=\"submit\"'])[3]"));
        loginBtn.click();
        Thread.sleep(5000);

        WebElement areaPersonalBtn = driver.findElement(By.xpath("(//a['@'])[6]"));
        areaPersonalBtn.click();
        Thread.sleep(3000);

        WebElement fichajesBtn = driver.findElement(By.xpath("(//button[@type='button'])[5]"));
        fichajesBtn.click();
        Thread.sleep(3000);

        WebElement comfirmacionBtn = driver.findElement(By.xpath("(//button[@type='button'])[8]"));
        comfirmacionBtn.click();
        Thread.sleep(3000);

        driver.quit();

    }
}
