package Base1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckMOT {
    private WebDriver d;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        d = new ChromeDriver();
    }
@Test
    public void LaunchBrowser() {
        d.get("https://www.gov.uk/");
    WebElement element = d.findElement(By.xpath("//button[contains(@type,'submit')]"));
    element.click();
    }
   // @Test
    //public static void scrollTillEndOfDocument(WebDriver d){
      //  JavascriptExecutor js = (JavascriptExecutor) d;
        //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
       // CheckMOT.scrollTillEndOfDocument(d);
    //}
    @Test
    public void testScrollTillElementAppears(){
        d.get("https://www.gov.uk/");
        //JavascriptExecutor js = (JavascriptExecutor) d;
        //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
       // WebElement element = d.findElement(By.xpath("//a[contains(@class,'govuk-link')]"));
        WebElement element = d.findElement(By.xpath("//*[@id=\"content\"]/div/section[4]/ul/li[2]/a"));
        CheckMOT.scrollTillElementIsInView(element,d);
        element.click();
    }

    private static void scrollTillElementIsInView(WebElement element, WebDriver d) {
        JavascriptExecutor js = (JavascriptExecutor) d;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
   @Test
    public void ClickStart(){
d.get("https://www.gov.uk/check-mot-history");
//WebElement element = d.findElement(By.tagName("//svg[contains(@class,'govuk-button__start-icon govuk-!-display-none-print')]"));
WebElement element = d.findElement((By.tagName("a")));
       element.click();
   }


}
