package br.com.tricentis.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
					glue = "br.com.tricentis.steps",
					plugin = "pretty",
					monochrome = true)
public class TricentisCucumberRunner {

}
