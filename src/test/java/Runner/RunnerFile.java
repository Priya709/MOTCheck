package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/mot.feature",glue={"Steps"},
        dryRun = false, monochrome = true,
        plugin = { "pretty", "junit:target/JUnitReports/reports.xml",
                //"json:target/JSONReports/report.json",
                "html:target/HTMLReports"})




public class RunnerFile {
}
