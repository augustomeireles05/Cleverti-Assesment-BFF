package pt.com.clevertiassesmentbff.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import lombok.extern.slf4j.Slf4j;
import pt.com.clevertiassesmentbff.domain.dto.NormaliserDto;
import pt.com.clevertiassesmentbff.infrastructure.integration.NormaliserIntegration;
import pt.com.clevertiassesmentbff.service.NormaliserService;

@Service
@Slf4j
public class NormaliserServiceImpl implements NormaliserService {
	
	private final static String ERROR_MSG = "Something got wrong: ";
	
	@Autowired
	private NormaliserIntegration normaliserIntegration;
	
	@Override
	public NormaliserDto save(NormaliserDto form) {
		try {
			return normaliserIntegration.save(form);
		} catch (Exception e) {
			log.error(ERROR_MSG + e.getMessage());
			e.getStackTrace();
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Save new job didn't work.");
		}
	}

	@Override
	public ResponseEntity<List<NormaliserDto>> toList(String jobName) {
		try {
			return normaliserIntegration.toList(jobName);
		} catch (Exception e) {
			log.error(ERROR_MSG + e.getMessage());
			e.getStackTrace();
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Get a list didn't work.");
		}
	}

}
