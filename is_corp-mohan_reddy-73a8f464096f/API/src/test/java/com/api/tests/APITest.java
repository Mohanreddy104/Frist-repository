package com.api.tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.WsStep;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;
import com.qmetry.qaf.automation.ws.rest.RestTestBase;
import com.qmetry.qaf.automation.ws.rest.RestWSTestCase;

public class APITest extends RestWSTestCase {
	@QAFTestStep(description = "verification of applyleave")
    @Test(priority=1)
    public void applyLeave() {
     Map<String, Object> data = new HashMap<String, Object>();
        data.put("endpointUrl", ConfigurationManager.getBundle().getString("applyleave.endpointUrl"));
        data.put("method", ConfigurationManager.getBundle().getString("applyleave.method"));
        data.put("tokenId", ConfigurationManager.getBundle().getString("applyleave.token"));
        WsStep.userRequests("new.request", data);
        WsStep.responseShouldHaveStatus("ok");
        WsStep.responseShouldHaveStatusCode(200);
        int statuscode = new RestTestBase().getResponse().getStatus().getStatusCode();
        Reporter.log("status code is " + statuscode);
        Validator.assertTrue(statuscode == 200, "leave is not accepted", "leave is accepted");
	}
	@QAFTestStep(description = "verification of visa Request")
   
	@Test(priority=2)
	public void visaRequest() {
	        Map<String, Object> data = new HashMap<String, Object>();
	        data.put("endpointUrl", ConfigurationManager.getBundle().getString("visa.endpointUrl"));
	        data.put("method", ConfigurationManager.getBundle().getString("visa.method"));
	        data.put("tokenId", ConfigurationManager.getBundle().getString("visa.token"));
	        WsStep.userRequests("new.request", data);
	        WsStep.responseShouldHaveStatus("ok");
	        WsStep.responseShouldHaveStatusCode(200);
	        int statuscode = new RestTestBase().getResponse().getStatus().getStatusCode();
	        Reporter.log("status code is" +statuscode);
	        Validator.assertTrue(statuscode == 200, "visa is  not accepted", "visa is accepted");
		}
	@QAFTestStep(description = "verification of leave")
    @Test(priority=3)
	public void leavemanager() {
	     Map<String, Object> data = new HashMap<String, Object>();
	        data.put("endpointUrl", ConfigurationManager.getBundle().getString("leave.endpointUrl"));
	        data.put("method", ConfigurationManager.getBundle().getString("leave.method"));
	        data.put("tokenId", ConfigurationManager.getBundle().getString("leave.token"));
	        WsStep.userRequests("leavemanager.request", data);
	        WsStep.responseShouldHaveStatus("ok");
	        WsStep.responseShouldHaveStatusCode(200);
	        int statuscode = new RestTestBase().getResponse().getStatus().getStatusCode();
	        Reporter.log("status code is" +statuscode);
	        Validator.assertTrue(statuscode == 200, "leave is not ok", "leave is ok");
		}

	@QAFTestStep(description = "verification of essMyProfile")
	@Test(priority=4)
	public void essMyProfile() {
		Map<String, Object> data = new HashMap<String, Object>();
        data.put("endpointUrl", ConfigurationManager.getBundle().getString("myprofile.endpointUrl"));
        data.put("method", ConfigurationManager.getBundle().getString("myprofile.method"));
        data.put("tokenId", ConfigurationManager.getBundle().getString("myprofile.token"));
        WsStep.userRequests("new.request", data);
        WsStep.responseShouldHaveStatus("ok");
        WsStep.responseShouldHaveStatusCode(200);
        int statuscode = new RestTestBase().getResponse().getStatus().getStatusCode();
        Reporter.log("status code is" + statuscode);
        Validator.assertTrue(statuscode == 200, "profile is not ok", "profile is ok");
	}

		@QAFTestStep(description = "verification of travelRequest")
		@Test(priority=5)
		public void travelRequest() {
		 Map<String, Object> data = new HashMap<String, Object>();
		  data.put("endpointUrl", ConfigurationManager.getBundle().getString("travelrequest.endpointUrl"));
        data.put("method", ConfigurationManager.getBundle().getString("travelrequest.method"));
        data.put("tokenId", ConfigurationManager.getBundle().getString("travelrequest.token"));
        WsStep.userRequests("new.request", data);
        WsStep.responseShouldHaveStatus("ok");
        WsStep.responseShouldHaveStatusCode(200);
        int statuscode = new RestTestBase().getResponse().getStatus().getStatusCode();
        Reporter.log("status code is" + statuscode);
        Validator.assertTrue(statuscode == 200, "travel request is not ok", "travel request is ok");
	}
	
}
