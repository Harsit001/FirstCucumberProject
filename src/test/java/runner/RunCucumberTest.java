package runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import java.security.Key;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("hellocucumber/Imgur")
@ConfigurationParameter(key=FILTER_TAGS_PROPERTY_NAME, value="@systemtest")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@ConfigurationParameter(key=PLUGIN_PROPERTY_NAME, value="html:target/cucumber-html-report.html")
@ConfigurationParameter(key =GLUE_PROPERTY_NAME, value = "stepDef")
@ConfigurationParameter(key=PLUGIN_PROPERTY_NAME, value="json:target/cucumber-json-report.json")
public class RunCucumberTest {


}
