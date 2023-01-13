package pt.com.clevertiassesmentbff.client;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static pt.com.clevertiassesmentbff.util.Constants.GET_TOLIST_JOB;
import static pt.com.clevertiassesmentbff.util.Constants.POST_SAVE_NEW_JOB;

import java.util.List;

import javax.validation.Valid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import pt.com.clevertiassesmentbff.config.FeignConfig;
import pt.com.clevertiassesmentbff.domain.dto.NormaliserDto;

@FeignClient(name = "ClevertiAssesmentNormaliserClient", url = "${cleverti.assesment.url}", configuration = FeignConfig.class)
public interface NormaliserClient {
	
	@PostMapping(value = POST_SAVE_NEW_JOB, produces = APPLICATION_JSON_VALUE)
	public NormaliserDto save(
//			@RequestHeader(value = "Authorization") String accessToken,
			@Valid @RequestBody final NormaliserDto form);
	
	@GetMapping(value = GET_TOLIST_JOB, produces = APPLICATION_JSON_VALUE)
	ResponseEntity<List<NormaliserDto>> toList(@RequestParam(defaultValue = "", required = false) String jobName);
}
