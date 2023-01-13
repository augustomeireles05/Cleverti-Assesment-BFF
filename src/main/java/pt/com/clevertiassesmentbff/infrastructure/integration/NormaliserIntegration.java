package pt.com.clevertiassesmentbff.infrastructure.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import pt.com.clevertiassesmentbff.client.NormaliserClient;
import pt.com.clevertiassesmentbff.domain.dto.NormaliserDto;

@AllArgsConstructor
@Service
public class NormaliserIntegration {
	
	@Autowired
	private final NormaliserClient normaliserClient;
	
	public NormaliserDto save(final NormaliserDto form) {
		return normaliserClient.save(form);
	}

	public ResponseEntity<List<NormaliserDto>> toList(String jobName) {
		return normaliserClient.toList(jobName);
	}
	
	
}
