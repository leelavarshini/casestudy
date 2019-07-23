package Casestudy;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Cucumber\\CASECUCUMBER\\src\\resources\\java\\Casestudy1.feature",
plugin= {"html:target\\Report2"})
public class runner2 {
   
}
