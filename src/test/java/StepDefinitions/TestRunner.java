package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinitions"},
        plugin ={"pretty","json:target/JSONReports/report.json",
                "html:target\\HtmlReports\\report.html",
                "junit:target\\JunitReports\\report.xml"

        })


public class TestRunner {


}
