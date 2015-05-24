package demo.service;

import org.springframework.stereotype.Component;

@Component
public class TestServiceImpl implements TestService {

	@Override
	public String getMessage() {
		return "service message";
	}

}
