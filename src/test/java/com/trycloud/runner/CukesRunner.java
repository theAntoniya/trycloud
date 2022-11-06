package com.trycloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "pretty"
        },
        features = "src/test/resources",
        glue = "com/trycloud/step_definitions",
        stepNotifications = true,
        dryRun = false,
        tags = "@wip"

)
public class CukesRunner {
}
