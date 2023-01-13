package pt.com.clevertiassesmentbff.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NormaliserDto {
	
	private Long id;
	private String jobName;
	private String jobDescription;
	
}
