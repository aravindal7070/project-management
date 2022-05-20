package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\login.feature",glue= { "org.adactstep"})
public class TestRunner {
	
	

}
//username|password|location|hotelname|roomtype|roomnumber|checkin|checkout|adultroom|childroom|firstname|lastname|address|creditcardtype|expirymonth|expiryyear|cvvnumber|
