import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;


public class WhatsApp implements ActionListener {

    @Test
    public void whatsApp() throws InterruptedException {
        EdgeDriver driver = new EdgeDriver();
        driver.navigate().to("https://web.whatsapp.com/");
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement inputSearch= driver.findElement(By.xpath("//p[@class='selectable-text copyable-text iq0m558w']"));
        inputSearch.click();
        inputSearch.sendKeys("3197183430");

        Thread.sleep(5000);
        WebElement firstResult = driver.findElement(By.xpath("//div[@data-testid='cell-frame-container']"));
        firstResult.click();
        WebElement message = driver.findElement(By.className("_3Uu1_"));
        message.click();
        message.sendKeys("." + Keys.ENTER);

        Thread.sleep(5000);
        driver.quit();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        EdgeDriver driver = new EdgeDriver();
        driver.navigate().to("https://web.whatsapp.com/");
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement inputSearch= driver.findElement(By.xpath("//p[@class='selectable-text copyable-text iq0m558w']"));
        inputSearch.click();
        inputSearch.sendKeys("3197183430");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        WebElement firstResult = driver.findElement(By.xpath("//div[@data-testid='cell-frame-container']"));
        firstResult.click();
        WebElement message = driver.findElement(By.className("_3Uu1_"));
        message.click();
        message.sendKeys("." + Keys.ENTER);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        driver.quit();

    }
}
