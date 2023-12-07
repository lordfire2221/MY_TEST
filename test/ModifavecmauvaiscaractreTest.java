// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ModifavecmauvaiscaractreTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void modifavecmauvaiscaractre() {
    driver.get("https://mohamedmamdouh1999.github.io/Products_CRUDS/");
    driver.manage().window().setSize(new Dimension(1039, 832));
    driver.findElement(By.id("inputName")).click();
    driver.findElement(By.id("inputName")).sendKeys("Ased");
    driver.findElement(By.id("inputPrice")).click();
    driver.findElement(By.id("inputPrice")).sendKeys("789");
    {
      WebElement element = driver.findElement(By.id("inputCategory"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("inputCategory"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("inputCategory"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("inputCategory")).click();
    {
      WebElement dropdown = driver.findElement(By.id("inputCategory"));
      dropdown.findElement(By.xpath("//option[. = 'MOBILE']")).click();
    }
    driver.findElement(By.cssSelector("#inputCategory > option:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".p-2:nth-child(1)")).click();
    {
      WebElement element = driver.findElement(By.id("inputCondition"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("inputCondition"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("inputCondition"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("inputCondition")).click();
    {
      WebElement dropdown = driver.findElement(By.id("inputCondition"));
      dropdown.findElement(By.xpath("//option[. = 'Bad']")).click();
    }
    driver.findElement(By.cssSelector(".bg-danger:nth-child(3)")).click();
    driver.findElement(By.id("inputSearch")).click();
    driver.findElement(By.id("inputSearch")).click();
    driver.findElement(By.id("inputSearch")).sendKeys("azert");
    driver.findElement(By.cssSelector("tr:nth-child(1) .me-2")).click();
    driver.findElement(By.id("inputPrice")).click();
    driver.findElement(By.id("inputPrice")).sendKeys("12");
    {
      WebElement element = driver.findElement(By.id("inputCategory"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("inputCategory"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("inputCategory"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("inputCategory")).click();
    {
      WebElement dropdown = driver.findElement(By.id("inputCategory"));
      dropdown.findElement(By.xpath("//option[. = 'MOBILE']")).click();
    }
    driver.findElement(By.cssSelector("#inputCategory > option:nth-child(1)")).click();
    {
      WebElement element = driver.findElement(By.id("inputCondition"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("inputCondition"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("inputCondition"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("inputCondition")).click();
    driver.findElement(By.cssSelector(".bg-success:nth-child(1)")).click();
    {
      WebElement element = driver.findElement(By.id("inputCondition"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("inputCondition"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("inputCondition"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("inputCondition")).click();
    {
      WebElement dropdown = driver.findElement(By.id("inputCondition"));
      dropdown.findElement(By.xpath("//option[. = 'Bad']")).click();
    }
    driver.findElement(By.cssSelector(".bg-danger")).click();
    driver.findElement(By.id("inputName")).click();
    driver.findElement(By.id("inputName")).sendKeys("zerty");
    driver.findElement(By.id("btnAdd")).click();
    driver.findElement(By.id("btnAdd")).click();
    driver.findElement(By.id("btnAdd")).click();
    {
      WebElement element = driver.findElement(By.id("btnAdd"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id("btnAdd")).click();
    driver.findElement(By.id("btnAdd")).click();
    {
      WebElement element = driver.findElement(By.id("btnAdd"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id("btnAdd")).click();
    driver.findElement(By.id("btnClear")).click();
    driver.findElement(By.id("btnAdd")).click();
  }
}
