package pt.com.clevertiassesmentbff.exception;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@EqualsAndHashCode(callSuper=false)
public class BusinessException extends RuntimeException implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8082101662004603378L;
	
	@JsonIgnore
	private final HttpStatus httpStatusCode;
	
	private final String code;
	
	private final String message;
	
	private final String description;
	
	public BusinessExceptionBody getOnlyBody() {
		return BusinessExceptionBody.builder()
				.code(this.code)
				.message(this.message)
				.description(this.description)
				.build();
	}
	
	@Getter
	@Setter
	@ToString
	@EqualsAndHashCode
	@NoArgsConstructor
	@AllArgsConstructor
	@Builder
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class BusinessExceptionBody {
		
		private String code;
		private String message;
		private String description;
		
	}

	
}
