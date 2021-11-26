package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/"},
//        features = {"src/test/java/features/Login.feature"},
//        features = {"src/test/java/features/NewsLetter.feature"},
//        features = {"src/test/java/features/CommunityPoll.feature"},
//        features = {"src/test/java/features/Jewelry.feature"},
//        features = {"src/test/java/features/Search.feature"},
//        features = {"src/test/java/features/SearchNegative.feature"},
//        features = {"src/test/java/features/LoginMultipleUsers.feature"},

        tags = "@ui",
        glue = {"steps"},
        plugin = {"pretty","html:target/report.html"}

)

public class TestRunner
{



}
