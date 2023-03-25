package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;



@CucumberOptions(features={"src/test/java/features/LoginWithDiffData.feature"},
glue="steps",
publish=true,
monochrome=true,
tags="not @smoke")//@smoke
//@smoke or @dilip
//@regression and @dilip
public class LoginRunner extends BaseClass{

}
