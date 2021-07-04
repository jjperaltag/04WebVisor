package com.bdd.runnerTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"src//test//resources//features"},
        glue = {"com.bdd.VISOR",
                "com.bdd.web.VISOR.modoVisor.stepdefinition"},
        plugin = {"pretty", "html:target/cucumber"},
        tags = {"@DiagnosticoReset"},
//        tags = {"@ResetTotalNumeroActivo"},

        monochrome = true
)

@Test
public class RunnerTest extends AbstractTestNGCucumberTests {

}
