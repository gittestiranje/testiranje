package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo.service.TestService;

@RestController
@RequestMapping(value = "/test")
public class TestController {

	private String test = "test";
	private TestService testService;

	@Autowired
	public TestController(TestService testService) {
		this.testService = testService;
	}


	@RequestMapping(value = "/message", method = RequestMethod.GET)
	@ResponseBody
	public String getMessage() {
		return testService.getMessage();
	}

}
