package co.com.tcs.certification.advantage.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/buy_product.feature",
        glue = "co.com.tcs.certification.advantage.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
		tags = "")

public class BuyProductRunner {
}