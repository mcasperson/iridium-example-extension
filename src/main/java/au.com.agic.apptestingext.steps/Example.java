package com.matthewcasperson.iridium.extensions.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.java.en.When;

/**
 * Cucumber steps exist in a POJO
 */
public class Example {

	private static final Logger LOGGER = LoggerFactory.getLogger(Example.class);

	/**
	 * Annotate a public method with @And, @But, @When, @Given or @Then, and cucumber
	 * will recognise the method as a Gherkin step
	 *
	 * @param message The message to be written to the log
	 */
	@When("I write \".*?\" as a log message")
	public void writeExampleLogMessage(final String message) {
		LOGGER.info(message);
	}
}
