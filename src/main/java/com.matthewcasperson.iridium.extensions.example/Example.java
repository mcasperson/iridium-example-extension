package com.matthewcasperson.iridium.extensions.example;

import au.com.agic.apptesting.utils.SleepUtils;
import au.com.agic.apptesting.utils.impl.SleepUtilsImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.java.en.When;

/**
 * Cucumber steps exist in a POJO
 */
public class Example {

	private static final Logger LOGGER = LoggerFactory.getLogger(Example.class);
	private static final SleepUtils SLEEP_UTILS = new SleepUtilsImpl();
	private static final int SLEEP_TIME = 10000;

	/**
	 * Annotate a public method with @And, @But, @When, @Given or @Then, and cucumber
	 * will recognise the method as a Gherkin step
	 *
	 * @param message The message to be written to the log
	 */
	@When("I write \".*?\" as a log message")
	public void writeExampleLogMessage(final String message) {
		LOGGER.info(message);
		SLEEP_UTILS.sleep(SLEEP_TIME);

	}
}
