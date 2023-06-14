package runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import java.security.Key;

import static io.cucumber.junit.platform.engine.Constants.FILTER_TAGS_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("hellocucumber/example.feature")
@ConfigurationParameter(key=FILTER_TAGS_PROPERTY_NAME, value="@regression")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key=PLUGIN_PROPERTY_NAME, value="html:target/cucumber-html-report.html")
@ConfigurationParameter(key=PLUGIN_PROPERTY_NAME, value="json:target/cucumber-json-report.json")
public class RunCucumberTest {


}
