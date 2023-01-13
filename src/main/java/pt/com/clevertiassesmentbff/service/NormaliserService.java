package pt.com.clevertiassesmentbff.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import pt.com.clevertiassesmentbff.domain.dto.NormaliserDto;

public interface NormaliserService {

	public NormaliserDto save(final NormaliserDto form);

	public ResponseEntity<List<NormaliserDto>> toList(String jobName);

}
