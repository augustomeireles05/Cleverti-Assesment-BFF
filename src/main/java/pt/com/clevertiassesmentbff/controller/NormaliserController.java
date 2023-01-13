package pt.com.clevertiassesmentbff.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import pt.com.clevertiassesmentbff.domain.dto.NormaliserDto;
import pt.com.clevertiassesmentbff.service.NormaliserService;

@RestController
@RequestMapping("/jobs")
@Api(tags = {"Normaliser information"})
public class NormaliserController {
	
	@Autowired
	private NormaliserService normaliseService;
	
	@ApiOperation(value = "Save a new job.", authorizations = {
			@Authorization(value = "OAuth2")}, notes = "All params must be send through RequestBody.")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message="Successful request."),
			@ApiResponse(code = 201, message="Created a new resource."),
			@ApiResponse(code = 401, message="Access denied."),
			@ApiResponse(code = 404, message="Job not found."),
			@ApiResponse(code = 500, message="Unkown error.")
	})
	@PostMapping
	public NormaliserDto save(
			@Valid @RequestBody final NormaliserDto form) {
		return normaliseService.save(form);
	}
	
	@ApiOperation(value = "List of an advanted seach of job.")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfull Request"),
			@ApiResponse(code = 404, message = "Datas not found."),
			@ApiResponse(code = 500, message = "Unkown error.")})
	@GetMapping
	public ResponseEntity<List<NormaliserDto>> toList(
			@RequestParam(defaultValue="", required = false, name="toList") String jobName) {
		return normaliseService.toList(jobName);
	}
}
