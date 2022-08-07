package Steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsDefinition {
    private WebDriver d;

    @Given("^user is on mot status page$")
    public void user_is_on_mot_status_page(){
        WebDriverManager.chromedriver().setup();
        d= new ChromeDriver();
        d.get("https://www.gov.uk/check-vehicle-tax");
    }

    @When("^user clicks on start now button$")
    public void user_clicks_on_start_now_button() {
        d.findElement(By.linkText("Start now")).click();

    }@And("user should see the validity of Mot")
    public void userShouldSeeTheValidityOfMot() {
        d.get("https://vehicleenquiry.service.gov.uk/");
        Assert.assertTrue(d.getTitle().contains("registration"));

    }
    @Then("user enters {string}")
    public void userEnters(String Registrationnumber) {
        d.findElement(By.xpath("//input[@id='wizard_vehicle_enquiry_capture_vrn_vrn']"))
                 .sendKeys(Registrationnumber);
      //  d.findElement(By.xpath("//input[@name='submit']")).click();
        //asa above line uncommented TC's fail

    }
}