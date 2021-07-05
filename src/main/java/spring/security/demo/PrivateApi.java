package spring.security.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/private")
public class PrivateApi {	
	@GetMapping(value = "validateFirst")
	public ResponseEntity<String> validateFirst() {
		ResponseEntity<String> response = new ResponseEntity<String> ("SUCCESS",HttpStatus.OK) ;
		return response;
	}
}

